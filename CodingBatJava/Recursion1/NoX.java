public class NoX {
    public static String noX(String str) {
        if(str.length() <= 0) return "";
        String c = ""+str.charAt(str.length()-1);
        if(str.charAt(str.length()-1)=='x') c = "";
        return noX(str.substring(0,str.length()-1)) + c;
    }
    public static void main(String[] args) {
        System.out.println(noX("xxabcxabxc"));
    }
}
