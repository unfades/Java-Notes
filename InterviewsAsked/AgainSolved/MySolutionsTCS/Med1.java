package MySolutions;

public class Med1 {
    public static void main(String[] args) {
        //this one is sliding window...
        //slide the window n-1
        String str = "9743";
        int n = 3;
        StringBuilder sb = new StringBuilder();
        // sb.append("1");
        // sb.append(" ");
        // sb.append("0");
        // sb.append("0");
        // sb.append("2");
        int j = 0;
        while(n>1){
            sb.append(str.charAt(j++));
            sb.append(" ");
            n--;
        }
        String mine = str.substring(j,str.length());
        sb.append(mine);
        System.out.println(sb);
        String[] arr = sb.toString().split(" ");
        System.out.println(java.util.Arrays.toString(arr));
        int max = arr[0].length();
        for(int i = 0; i<arr.length; i++){
            if(arr[i].length()>max) max = arr[i].length();
        }
        n = max;
        for(int i = 0; i<str.length()-n; i++){
            if(Integer.parseInt(str.substring(i,i+n))>max) max = Integer.parseInt(str.substring(i,i+n));
        }
        System.out.println(max);
    }
}
