import java.util.Scanner;
class EvenOrOdd{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number you want to check : ");
		int num=sc.nextInt();
		sc.close();
		if(num%2==0){
			System.out.println("The number you have entered is an even number");
		}
		else{
			System.out.println("The number you have enered is an odd number");
		}
	}
}
		