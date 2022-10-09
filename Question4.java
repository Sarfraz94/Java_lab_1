//Sarfraz soomro
//Question 4
// How to find cpn



import java.util.*;

class Question4{

public static void main(String[] args) {

Scanner ob= new Scanner(System.in);
			
System.out.println("Entet the mtric  Marks");
			
double a=ob.nextDouble();
			
System.out.println("Enter the Intermediate Marks");
		
double b=ob.nextDouble();
			
System.out.println("Enter the test Marks");
		
double c=ob.nextDouble();
			
double total=(a/850*100)*0.1+(b/1100*100)*0.3+(c/100*100)*0.6;
			
System.out.println("your CPN is :");
			
System.out.println(total);
		
	}
}