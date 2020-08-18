import java.util.Scanner;
class Main
{
  public static int square(int n)
  {
    int a=n*n;
    return a;}
	public static void main (String[] args)
    {
	 // Type your code here 
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int b=square(n1);
      System.out.print(b);
	} 
}