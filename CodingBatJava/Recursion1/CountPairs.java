public class CountPairs {

    public static int countPairs(String str) {
        if(str.length()<=2) return 0;
        if(str.length()>=3 && str.charAt(str.length()-1) == str.charAt(str.length()-3))
            return 1 + countPairs(str.substring(0,str.length()-1));
        else return countPairs(str.substring(0,str.length()-1)) + 0;
    }
    public static void main(String[] args) {
        System.out.println(countPairs("abaxyzabcb"));
        System.out.println(countPairs("axax"));
        System.out.println(countPairs("axa"));
    }
}
