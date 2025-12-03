public class EndX {
    //gpts
    // public static String endX(String str) {
    //     if (str.length() == 0) return "";
    //     char c = str.charAt(0);
    //     if (c == 'x') return endX(str.substring(1)) + c;
    //     else return c + endX(str.substring(1));
    // }
    //mine
    public static String endX(String str) {
        return endX1(str) + endX2(str);
    }


    public static String endX1(String str){
        String x = ""; 
        String nonX = ""; 
        if(str.length()==0) return ""; 
        if(str.length() == 1 && str.charAt(0) != 'x') return str;
        if(str.charAt(str.length()-1) == 'x') x = "x";
        else nonX = ""+str.charAt(str.length()-1);
        nonX = endX1(str.substring(0,str.length()-1)) + nonX;
        return nonX;        
    }

    public static String endX2(String str){
        String x = ""; 
        String nonX = ""; 
        if(str.length()==0) return ""; 
        if(str.length() == 1 && str.charAt(0) == 'x') return str;
        if(str.charAt(str.length()-1) == 'x') x = "x";
        else nonX = ""+str.charAt(str.length()-1);
        x = endX2(str.substring(0,str.length()-1)) + x;
        return x;
    }
    public static void main(String[] args) {
        System.out.println(endX("erxxxhi "));
    }
}
