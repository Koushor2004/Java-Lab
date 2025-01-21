import java.util.*;
class koushor{
	public static void main(String[] args){
		Scanner inp=new Scanner(System.in);
		System.out.print("Enter the first number :" );
		int a=inp.nextInt();
		System.out.print("Enter the second number :" );
		int b=inp.nextInt();
		if(a>b){
			System.out.println(a+" is Large");
		}
		else if(a<b){
			System.out.println(b+" is Large");
		}
		else{
			System.out.println("These numbers are equal");
		}
		
	}
}
