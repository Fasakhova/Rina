public class fileinlast5 {
    public static void main(String[] args) {
        System.out.println(fileinlast5(17));
        System.out.println(fileinlast5(15));
        System.out.println(fileinlast5(47));
        System.out.println(fileinlast5(436970));
    }

    private static boolean fileinlast5 (int x) {
        return x % 5 == 0 && x % 10 != 0;
    }
}
