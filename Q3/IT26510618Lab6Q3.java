import java.util.Scanner;
public class IT26510618Lab6Q3{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		int num;
		int count = 0;
		double sum = 0;
		
		System.out.println("Enter positive integers (terminate with -99):");
		
		while(true) {
			System.out.print("Enter a number: ");
			num = input.nextInt();
			
			if(num == -99) {
				break;
			}
			if(num < 0) {
				
				System.out.println("Invalid input.Please enter a positive intergers(terminate with -99to terminate");
				
				continue;
			}
			sum = sum + (double) num * num ;
			count++;
			
		}
		
		if (count > 0) {
			double rms =
			Math.sqrt(sum / count);
			System.out.println("The Root Mean Square (RMS) is: " + rms);
		}else{
			System.out.println("No numbers were entered.");
		}
		input.close();
	}
}