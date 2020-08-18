import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
       Scanner in =new Scanner(System.in);
      int num=in.nextInt();
      int c=0;
      int temp=num;
     while(num>0)
     {
     int a=num%10;
       num=num/10;
       c=c+(a*a*a);
     }
      if(temp==c)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
    }}