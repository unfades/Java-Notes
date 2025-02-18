
import java.lang.Math;

class Circle{

	private int radius;

	public void setRadius(int x){
		radius = x;
	}

	public void calculateArea(){
		System.out.println("The area of the Circle is: " + Math.PI*Math.pow(radius,2));		
	}

	public void calculateCircumference(){
		System.out.println("The circumference of the Circle is:" + 2*Math.PI*radius);
	}

}