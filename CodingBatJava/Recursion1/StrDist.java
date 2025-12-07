public class StrDist {
    
    public static int strDist(String str, String sub) {
        if(sub.length()>str.length()) return 0;
        if(str.length() == 0) return 0;
        if(!str.substring(0,sub.length()).equals(sub)) return strDist(str.substring(1,str.length()),sub);
        if(!str.substring(str.length()-sub.length(),str.length()).equals(sub)) return strDist(str.substring(0,str.length()-1),sub);
        if(str.substring(0,sub.length()).equals(sub) && str.substring(str.length()-sub.length(),str.length()).equals(sub)) return str.length();
        return str.length();
    }
    public static void main(String[] args) {
        System.out.println(strDist("abccatcowcatcatxyz", "cat"));
    }
}
