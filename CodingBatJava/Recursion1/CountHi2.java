public class CountHi2 {
    
    public static int countHi2(String str) {
        if(str.length()<=1) return 0;
        if(str.length() == 2 && str.charAt(0) == 'h' && str.charAt(1) == 'i') return 1;
        if(str.length() == 2 && str.charAt(0) != 'h' && str.charAt(1) != 'i') return 0;
        if(str.length()>=3 && str.charAt(str.length()-1) == 'i' &&
                            str.charAt(str.length()-2) == 'h' &&
                            str.charAt(str.length()-3) != 'x') return 1 + countHi2(str.substring(0,str.length()-1));
        else return 0 + countHi2(str.substring(0,str.length()-1));
    }
    public static void main(String[] args) {
        System.out.println(countHi2("xhihihix"));
    }
}
