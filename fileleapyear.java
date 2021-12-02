public class fileleapyear {
    public static void main(String[] args) {
        System.out.println(fileleapyear(2002));
        System.out.println(fileleapyear(2020));
        System.out.println(fileleapyear(2010));
        System.out.println(fileleapyear(1976));
    }

    private static boolean fileleapyear (int x) {
        if (x % 4 == 0 && x % 100 != 0)
            return true;
        else return x % 400 == 0;
    }
}
