public class Months{

	public static void main(String[] args){

		String month = new String(args[0]);
		switch(args[0]){
			case "february":
			case "march":
			case "april":
			System.out.println("Spring Season");
			break;
			case "may":
			case "june":
			case "july":
			System.out.println("Summer Season");
			break;
			case "august":
			case "september":
			System.out.println("Fall Season");
			break;
			
			case "january":
			case "october":
			case "november":
			case "december":
			System.out.println("Winter Season");
			break;

		}
	}

}