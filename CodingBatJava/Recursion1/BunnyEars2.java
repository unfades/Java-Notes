public class BunnyEars2{

    public int bunnyEars2(int bunnies) {
        if(bunnies == 0) return 0;
        if(bunnies == 1) return 2;
        int num = 0;
        if(bunnies%2==0) num = 3;
        else num = 2;
        return bunnyEars2(bunnies-1) + num;
    }
    public static void main(String[] args) {
        //just reminding yourself you can do this, since
        // bunnyEars2 is a nonstatic method you cannot directly call it in main gotta make
        //an object of the class that holds this method and then call if nonstatic
        BunnyEars2 bunny = new BunnyEars2();
        bunny.bunnyEars2(7);
    }
}