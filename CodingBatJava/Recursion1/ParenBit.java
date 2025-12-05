public class ParenBit {
    
    /*public static String parenBit(String str) {
        // hint trim inwards the string and if both ends are () ret
        if (str.charAt(str.length() - 1) == '(') return "(";
        return "" + parenBit(str.substring(0, str.length() - 1)) + str.charAt(str.length() - 1);
    }*/
    public String parenBit(String str) {
        // hint trim inwards the string and if both ends are () ret
        //if the first char isnt ( trim front
        //if last char isnt ) trim the back else ret ()
        if(str.length()<=1) return "";
        if(str.charAt(0) == '(' && str.charAt(str.length()-1) == ')') return str;
        if(str.charAt(0) !='(') return parenBit(str.substring(1,str.length()));
        else if(str.charAt(str.length()-1) !=')') return parenBit(str.substring(0,str.length()-1));
        return parenBit(str.substring(1,str.length()-1));
    }

    public static void main(String[] args) {
        System.out.println();   
    }
}
