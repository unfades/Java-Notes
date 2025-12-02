public class ChangePi {

    public static String changePi(String str) {
        if(str.length() <= 0) return "";
        String c = ""+str.charAt(str.length()-1);
        if(str.length()==1) return str;
        if(str.charAt(str.length()-1) == 'i' && str.charAt(str.length()-2) == 'p'){ 
            c = "3.14"; return changePi(str.substring(0,str.length()-2)) + c;
        }
        return changePi(str.substring(0,str.length()-1)) + c;
    }
    public static void main(String[] args) {
        System.out.println(changePi("pipipi"));
    }
}
