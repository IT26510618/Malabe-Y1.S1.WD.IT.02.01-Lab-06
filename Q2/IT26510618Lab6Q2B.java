import java.util.Scanner;
public class IT26510618Lab6Q2B{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int i = 1;
		 
		System.out.println("please enter 10 numbers:");
		 while(i <= 10) {
			 System.out.print("Enter number" + i + ": ");
			 int num = input.nextInt();
			 System.out.println(num);
			 i++;
		 }
		 input.close();
	}
}