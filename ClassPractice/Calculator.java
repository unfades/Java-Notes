public class Calculator{

	public static void main(String[] args){
		switch(args[1]){
		case("+"):
			System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[2]));
			break;
		case("-"):
			System.out.println(Integer.parseInt(args[0]) - Integer.parseInt(args[2]));
			break;
		case("/"):
			System.out.println(Double.parseDouble(args[0]) / Double.parseDouble(args[2]));
			break;
		case("*"):
			System.out.println(Integer.parseInt(args[0]) * Integer.parseInt(args[2]));
			break;
		case("%"):
			System.out.println(Integer.parseInt(args[0]) % Integer.parseInt(args[2]));
			break;
		default:
			System.out.println("Wrong format Try again using this method -> operand operator operand");
			break;
		}
		
	}

}