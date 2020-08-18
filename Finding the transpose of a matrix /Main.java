import java.util.Scanner;
 
class Main
{
   public static void main(String args[])
   {
      int m, n, c, d;
 
      Scanner in = new Scanner(System.in);
      
      m = in.nextInt();
      n = in.nextInt();
 
      int matrix[][] = new int[m][n];
     
      
      for (c = 0; c < m; c++)
         for (d = 0; d < n; d++)
            matrix[c][d] = in.nextInt();
 
      int transpose[][] = new int[n][m];
     
      for (c = 0; c < m; c++)
         for (d = 0; d < n; d++)              
            transpose[d][c] = matrix[c][d];
 
      
 
      for (c = 0; c < n; c++)
      {
         for (d = 0; d < m; d++)
               System.out.print(transpose[c][d]+" ");
 
         System.out.print("\n");
      }
   }
}