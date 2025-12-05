public class Count11 {
    
    public int count11(String str) {
        //no overlaps, remember, I should keenly view when I paste my own conditions,
        //I accidentally wrote str.charAt(str.length()-1) == '1' twice it shouldve been -2 the other time
        //dont waste time because your logic is sound, a typo can make you run circles around your own code man...
        if(str.length()<=1) return 0;
        if(str.length() == 2 && (""+str.charAt(0)+str.charAt(1)).equals("11")) return 1;
        if(str.length() == 2 && !(""+str.charAt(0)+str.charAt(1)).equals("11")) return 0;
        if(str.charAt(str.length()-1) == '1' && str.charAt(str.length()-2) == '1'){
            return 1+count11(str.substring(0,str.length()-2));
        }else{
            return 0+count11(str.substring(0,str.length()-1));
        }
    }

    public static void main(String[] args) {
        
    }
}
