import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int c=0;
      while(n>=10)
      {int n1=n/10;
       int n2=n%10;
      n=n1;
      c=n2;
      }

      System.out.println(c);
    }
}