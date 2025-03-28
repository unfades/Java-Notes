class Lecture45Division{
	public static void main(String[] args){
		
		try{
			int a = Integer.parseInt(args[0]); //NumberFormatException, ArithmeticException, ArrayIndexOutOfBoundsException
			int b = Integer.parseInt(args[1]);
			int c = a/b;
			System.out.println("Div is " +c);
		}catch(Exception e){
            System.out.println(e.getMessage()); //1
			System.out.println(e); //2
            e.printStackTrace(); //3
		}
	}
}


