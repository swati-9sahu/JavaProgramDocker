import java.util.Scanner;

public class FindSum{
	public static void main(String[] args){
           Scanner sc = new Scanner(System.in);

	   System.out.println("Enter first number:");
	   int num1 = sc.nextInt();

	   System.out.println("Enter second number:");
	   int num2 = sc.nextInt();

	   System.out.println("Enter third number:");
	   int num3 = sc.nextInt();

	   int smallest = Math.min(num1, Math.min(num2, num3));
	   int largest = Math.max(num1, Math.max(num2, num3));
	   int sum = smallest + largest;

	   System.out.println("sum of smallest and largest:" + sum);
	   
	}
}
