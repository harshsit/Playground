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
  { int g=0;
    while(n1!=n2){
     if(n1>n2)
     {n1=n1-n2;
      g=n1;}
      else 
        n2=n2-n1;
      g=n2;
    if(g>n3)
    {
    g=g-n3;
    }
      else
        n3=n3-g;
    
      
    

}
return g;  }
}