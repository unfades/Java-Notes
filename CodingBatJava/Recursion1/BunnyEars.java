public class BunnyEars {

    public static int bunnyEars(int bunnies) {
        if (bunnies == 0) return 0;
        return bunnyEars(bunnies - 1) + 2;
    }

    public static void main(String[] args) {
        System.out.println(bunnyEars(4));
    }
}
