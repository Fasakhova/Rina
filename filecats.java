public class filecats {
    public static void main(String[] args) {
        filecats(32);
        filecats(10);
        filecats(4);
        filecats(61);
        filecats(15);
    }

    private static void filecats (int x) {
        if ((5 <= x & x <= 20) || (11 <= x % 100 && x % 100 <= 19)) {
            System.out.println(x + " котов");
        } else {
            if ((x % 10 == 0) || (5 <= x % 10)) {
                System.out.println(x + " котов");
            }
            if (x % 10 == 1) {
                System.out.println(x + " кот");
            }
            if (x % 10 == 2 || x % 10 == 3 || x % 10 == 4) {
                System.out.println(x + " кота");
            }
        }
    }
}
