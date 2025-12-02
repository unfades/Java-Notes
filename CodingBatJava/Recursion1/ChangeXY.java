public class ChangeXY {
    public static String changeXY(String str) {
        if(str.length() == 0) return str;
        char c = str.charAt(str.length()-1);
        if(str.length()<=1 && str.equals("x")) str = "y";
        if(str.length() <= 1) return str;
        if(str.charAt(str.length()-1) =='x') c = 'y';
        return changeXY(str.substring(0,str.length()-1)) + c;
    }
    public static void main(String[] args) {
        System.out.println(changeXY("mcxxDonayyxxlds"));
    }
}
