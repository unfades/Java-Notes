public class StrCount {
    
    public static int strCount(String str, String sub) {
        int len = str.length()-sub.length();
        if(str.length()<sub.length()) return 0;
        if(str.substring(len,str.length()).equals(sub)){
            return 1 + strCount(str.substring(0,len),sub);
        }else{
            return 0+strCount(str.substring(0,str.length()-1),sub);
        }
    }
    public static void main(String[] args) {
        System.out.println(strCount("catcowcat", "cat"));
    }
}
