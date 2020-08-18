import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner scan=new Scanner(System.in);
     String str=scan.nextLine();   
    StringBuilder sb=new StringBuilder(str);  
    sb.reverse();  
    String rev=sb.toString();  
    if(str.equals(rev)){  
        System.out.println("Yes");  
    }else{  
        System.out.println("No");  
    }  
}  
}  
    