class Insurance{

    public static void main(String[] args){
        int age = Integer.parseInt(args[0]);
        String gender = args[1];
        String status = args[2];
        if(args[2].equalsIgnoreCase("married"))
            System.out.println("Insurance given");
        else if(gender.equalsIgnoreCase("male") && age>35)
            System.out.println("Insurance given");
        else if(gender.equalsIgnoreCase("female") && age > 30)
            System.out.println("Insurance Given");
        else
            System.out.println("Insurance Not Given");
    }
}