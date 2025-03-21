class Lecture45Division{
	public static void main(String[] args){
		
		try{
			int a = Integer.parseInt(args[0]); //NumberFormatException, ArithmeticException, ArrayIndexOutOfBoundsException
			int b = Integer.parseInt(args[1]);
			int c = a/b;
			System.out.println("Div is " +c);
		}catch(Exception e){
            System.out.println(e.getMessage());
			System.out.println(e); 
            e.printStackTrace();
		}
	}
}


