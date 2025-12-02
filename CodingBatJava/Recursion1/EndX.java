public class EndX {

    public static String endX(String str) {
        if (str.length() == 0) return "";
        char c = str.charAt(0);
        if (c == 'x') return endX(str.substring(1)) + c;
        else return c + endX(str.substring(1));
    }
    public static void main(String[] args) {
        System.out.println(endX("erxxxhi"));
    }
}
