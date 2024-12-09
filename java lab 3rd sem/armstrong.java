import java.util.Scanner;
class armstrong{
public static void main(String[] args)
{r
Scanner scanner=new Scanner(System.in);
System.out.println("enter a number:");
int number=scanner.nextInt();
int originalNumber=number;
int result=0;
int numberOfDigits=String.valueOf(number).length();
while(number!=0){
int digit=number%10;
result+=Math.pow(digit,numberOfDigits);
}
if(result==originalNumber){
System.out.println(originalNumber+"is an armstrong number");
}
else {
System.out.println(originalNumber+"is not an armstrong number");
}
scanner.close();
}
}