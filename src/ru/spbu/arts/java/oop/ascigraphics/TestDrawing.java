package ru.spbu.arts.java.oop.ascigraphics;

public class TestDrawing {
    public static void main(String[] args) {

        Drawing picture = new Drawing(20, 20, '♡');
        picture.print();
        System.out.println();

        picture.drawVerticalLine(6, 9, 14, '⬛');
        picture.drawVerticalLine(12, 9, 14, '⬛');
        picture.drawHorizontalLine(5, 12, 9, '⬛');
        picture.drawHorizontalLine(5, 12, 14, '⬛');
        picture.print();

        System.out.println();

    }
}
