import java.lang.Math;

public class Assignment2part3{
	public static void main(String[] args){
		int p = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		double h;
		h = Math.sqrt( Math.pow(p,2) + Math.pow(b,2) );
		System.out.println(h);
	}


}