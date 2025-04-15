class ProgramSCP55{

    //String Const Pool and String object in the HEAP
    public static void main(String[] args) {
        String s = "hav";
        String s2 = "hav";
        System.out.println(s == s2);
        String s3 = new String("hav");
        System.out.println(s3 == s);
    }
}