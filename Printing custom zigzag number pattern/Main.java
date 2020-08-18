import java.util.Scanner;
class Main{ 
public static void main(String[] args)
{
    Scanner in=new Scanner(System.in);
    int rows=in.nextInt();
  for (int row = 0; row < rows; row++) {
     for (int col = 0; col < rows ; col++) {
        int number = 0;
        if (row % 2 == 0) {
           number = col < rows-1 ? row + 1 : row + 2;
        } else {
           number = col == 0 ? row + 2 : row + 1;
        }
        System.out.print(number);
     }
     System.out.println();
  }
}}