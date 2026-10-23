import java.util.Scanner;
public class IT26510618Lab6Q2C{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		int i = 1;
		int num;
		int sum = 0;
		
		System.out.println("Please enter 10 numbers:");
		
		while (i <=10){
			System.out.print("Enter number" + i + ":");
			num = input.nextInt();
			sum = sum + num;
			i++;
		}
		double average = sum / 10.0;
		
		System.out.println("sum of the number:" + sum);
		System.out.println("Average of the numbers:" + average);
		 
		
		input.close();
	}
}