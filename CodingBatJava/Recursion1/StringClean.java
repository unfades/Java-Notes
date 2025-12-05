public class StringClean {
    
    public static String stringClean(String str) {
        if(str.length()<=0) return "";
        if(str.length()==1) return str;
        if(str.length()==2 && str.charAt(0)!=str.charAt(1)){
            return ""+str.charAt(0)+str.charAt(1);
        }
        if(str.charAt(str.length()-1) == str.charAt(str.length()-2)){
            return "" + stringClean(str.substring(0,str.length()-1));
        }else{
            return ""+stringClean(str.substring(0,str.length()-1))+str.charAt(str.length()-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(stringClean("aaaabbcccxyzabc")); //gg
    }
}
