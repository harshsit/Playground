import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      System.out.println(greatest(n1,n2,n3));
	}
  public static int greatest(int n1,int n2,int n3)
  {
    int g;
     if((n1>n2)&&(n1>n3))
       g=n1;
    else if((n2>n1)&&(n2>n3))
      g=n2;
    else
      g=n3;
    return g;
}
}