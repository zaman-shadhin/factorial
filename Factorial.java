import java.util.Scanner ;
public class Factorial {
public static void main(String[]args){
Scanner input = new Scanner(System.in);
System.out.print("Enter any number :");
int fact=1;
int i;
int n=input.nextInt();

for(i=1;i<=n;i++){
    fact= fact*i;
}
System.out.println("factorial of "+n+" is : "+fact);

  }  
}
