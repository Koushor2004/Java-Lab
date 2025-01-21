import java.util.*;
class koushor{
	public static void main(String[] args){
		Scanner inp=new Scanner(System.in);
		System.out.print("Enter Total miles driven per day : " );
		double a=inp.nextDouble();
		System.out.print("Enter Cost per gallon of gassoline :" );
		double b=inp.nextDouble();
		System.out.print("Average miles per gallon :" );
		double c=inp.nextDouble();
		System.out.print("Enter parking fees per day :" );
		double d=inp.nextDouble();
		System.out.print("Enter Tolls per day :" );
		double e=inp.nextDouble();
		
		double result=(a/c*b)+d+e;
		System.out.println("The total cost is : "+result);
	}
}
