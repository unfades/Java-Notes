public class PairStar {
    public static String pairStar(String str) {
        if(str.length() == 0) return "";
        String star = str.charAt(str.length()-1)+"";
        if(str.length() == 1) return str;
        if(str.charAt(str.length()-1) == str.charAt(str.length()-2)) star = "*" + star;
        return pairStar(str.substring(0,str.length()-1))+star;
    }
    public static void main(String[] args) {
        System.out.println(pairStar("xxyyabb"));
    }
}
