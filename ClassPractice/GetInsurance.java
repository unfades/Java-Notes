public class GetInsurance{
	public static void main(String[] args){

	int age = Integer.parseInt(args[0]);
	boolean isMarried = Boolean.parseBoolean(args[1]);
	String mf = new String(args[2]);	
	if(isMarried){
		System.out.println("You get insurance");
	}else if(!isMarried && age>35 && mf.equalsIgnoreCase("Male")){
		System.out.println("You get insurance");
	}else if(!isMarried && age>30 && mf.equalsIgnoreCase("female")){
		System.out.println("You get insurance");
	}else{
		System.out.println("You don't get insurance");
	}

	}

}

/*
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
Sir ka^^


public class GetInsurance{
	public static void main(String[] args){

	int age = Integer.parseInt(args[0]);
	boolean isMarried = Boolean.parseBoolean(args[1]);
	String mf = new String(args[2]);	
	if(isMarried){
		System.out.println("You get insurance");
	}else if(!isMarried && age>35 && mf.equalsIgnoreCase("Male")){
		System.out.println("You get insurance");
	}else if(!isMarried && age>30 && mf.equalsIgnoreCase("female")){
		System.out.println("You get insurance");
	}else{
		System.out.println("You don't get insurance");
	}

	}

}

Mera^^
*/