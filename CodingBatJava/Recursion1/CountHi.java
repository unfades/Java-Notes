public class CountHi {

    public static int countHi(String str){
        int num = 0;
        if(str.length()<2) return 0;
        if(str.length()>=2 && str.charAt(str.length()-1) == 'i' && str.charAt(str.length()-2) == 'h') num = 1;
        return countHi(str.substring(0,str.length()-1)) + num;
    }
    public static void main(String[] args) {
        System.out.println("yuh" + 'a');
    }
}

/*
Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.

countHi("xxhixx") → 1
countHi("xhixhix") → 2
countHi("hi") → 1

*/