import java.util.Scanner;
class Main
{
  public static int square(int n)
  {
    int sum=0;
    if(n==0)
    return n;
  else
  {
    return(n*(n+1)/2);
  }
  
  }
	public static void main (String[] args)
    {
	 // Type your code here 
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int b=square(n1);
      System.out.print(b);
	} 
}