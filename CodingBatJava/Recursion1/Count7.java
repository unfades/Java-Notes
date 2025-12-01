public class Count7 {
    public static int count7(int n) {
        int num = 0;
        if(n == 0) return 0;
        if(n%10 == 7) num = 1;
        return num + count7(n/10);
    }
    public static void main(String[] args) {
        System.out.println(count7(7770078));
    }
}
