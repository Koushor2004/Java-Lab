import java.util.*;
class koushor{
	public static void main(String[] args){
		Scanner inp=new Scanner(System.in);
		System.out.print("Enter weight in kg :" );
		double a=inp.nextDouble();
		System.out.print("Enter height in meters :" );
		double b=inp.nextDouble();
		double BMI=a/(b*b);
		System.out.println("The BMI IS : "+BMI);
	}
}
