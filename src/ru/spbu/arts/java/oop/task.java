package ru.spbu.arts.java.oop.ExamTask;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.EnumSet;
import java.util.Properties;

public class task {


    public static void main(String[] args) throws IOException {

        String fileName = "fileList.txt";

        PrintStream defOut = System.out;


        {

            System.out.println("Первый подход");

        }


        System.setOut(new PrintStream(new FileOutputStream(getFileName(fileName))));


        FileVisitor<Path> fileVisitor = null;

        Path path = null;
        {

            System.setOut(defOut);

            System.out.println("Второй подход");

        }


        System.setOut(new PrintStream(new FileOutputStream(getFileName(fileName))));


        //переход по символьным ссылкам, глубина вложенных папок - 2

        Files.walkFileTree(path, EnumSet.of(FileVisitOption.FOLLOW_LINKS), 2, fileVisitor);

    }


//поиск незанятого имени файла

    public static String getFileName(String fileName) {

        int i = 0;

        StringBuilder sb = new StringBuilder(fileName);

        while (Files.exists(Paths.get(sb.toString()))) {

            sb = new StringBuilder(fileName);

            int c = sb.lastIndexOf(".");

            if (c == -1) sb.append(String.format("%04d", i++));

            else {

                sb.insert(c, String.format("%04d", i++));

            }

        }

        return sb.toString();

    }


//пропуск папок если в них есть файл .access с полем Forbidden = true

    public static class DirAccessClass extends SimpleFVFileFailedSkipSubtree {

        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {

//создание пути к .access в папке

            Path path = Paths.get(dir + File.separator + ".access");

//файла нет, продолжать работу (работает если и AccessDenied к папке)

            if (!Files.exists(path))

                return FileVisitResult.CONTINUE;


            //сделала через класс Properties, с предположением, что в .access может быть много полей

            Properties properties = new Properties();

            properties.load(Files.newInputStream(path));


            if (properties.getProperty("forbidden") != null && properties.getProperty("forbidden").equals("true")) {

                System.out.println("SKIP: " + dir);

                return FileVisitResult.SKIP_SUBTREE;

            } else {

                return FileVisitResult.CONTINUE;

            }

        }
