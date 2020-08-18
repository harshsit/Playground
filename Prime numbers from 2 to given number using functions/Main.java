import java.util.Scanner;
class Main{
	
	    // Type your code here
      public static boolean isPrime(int number){
          
          boolean flgPrime=true;
          for( int i=2; i<=Math.sqrt(number); i++){
              if(number%i==0){
                  flgPrime=false;
                  break;
              }
          }
          return flgPrime;
      }
      public static void main(String args[]){
         
          Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        
          
           
          //run loop from 1 to n
          for(int loop=2; loop<n; ++loop){
              if(isPrime(loop)){
                  System.out.println(loop);
              }
          }
          
      }}
