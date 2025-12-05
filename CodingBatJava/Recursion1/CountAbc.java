public class CountAbc {
    
    public static int countAbc(String str) {
        if(str.length()<=2) return 0;
        if((""+str.charAt(str.length()-3)+str.charAt(str.length()-2)+str.charAt(str.length()-1)).equals("abc") ||
        (""+str.charAt(str.length()-3)+str.charAt(str.length()-2)+str.charAt(str.length()-1)).equals("aba")){
            return 1+countAbc(str.substring(0,str.length()-1));
        }else{
            return 0 + countAbc(str.substring(0,str.length()-1));
        }
    }

    public static void main(String[] args) {
        System.out.println(countAbc("abaxyzabcabc"));
    }
}
