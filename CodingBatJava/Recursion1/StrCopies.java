public class StrCopies {
    public static boolean strCopies(String str, String sub, int n) {
        if(str.length() < sub.length()){
            if(n <= 0) return true;
            else return false;
        }
        if(str.length() == sub.length() && str.equals(sub)) return strCopies("", sub, n-1);
        if(str.substring(str.length()-sub.length(),str.length()).equals(sub))
            return strCopies(str.substring(0,str.length()-1), sub, n-1);
        else return strCopies(str.substring(0,str.length()-1), sub, n);
    }
    public static void main(String[] args) {
        
    }
}