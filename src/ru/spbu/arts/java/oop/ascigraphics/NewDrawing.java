package ru.spbu.arts.java.oop.ascigraphics;

public class NewDrawing {
    private char[][] pic;

    NewDrawing(int x, int y, char z) {
        this.pic = new char[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                this.pic[i][j] = z;
            }
        }
    }

    public void print() {
        for (char[] i: pic) {
            StringBuilder forPrint = new StringBuilder();
            for (char j: i)
                forPrint.append(j);
            System.out.println(forPrint);
        }
    }

    public void setPoint(int x, int y, char symbol) {
        pic[y][x] = symbol;
    }

    public void drawVerticalLine(int x, int y1, int y2, char symbol) {
        for (int i = y1; i <= y2; i++) {
            setPoint(x, i, symbol);
        }
    }

    public void drawHorizontalLine(int x1, int x2, int y, char symbol) {
        for (int i = x1; i <= x2; i++) {
            setPoint(i, y, symbol);
        }
    }

}
