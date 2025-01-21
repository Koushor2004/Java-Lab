import java.util.*;
class koushor{
	public static void main(String[] args){
		Scanner inp=new Scanner(System.in);
		System.out.print("Enter the first number :" );
		int a=inp.nextInt();
		System.out.print("Enter the second number :" );
		int b=inp.nextInt();
		if(a%b==0){
			System.out.println(a+" is a multiple of "+b);
		}
		
		else{
			System.out.println(a+" is a not a multiple of "+b);
		}
		
	}
}
