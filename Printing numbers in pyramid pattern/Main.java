import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //Taking noOfRows value from the user
      
        int noOfRows = sc.nextInt();
        //Initializing rowCount with 1
        int rowCount = 1;
        
        //Implementing the logic
        for (int i = 1; i <= noOfRows; i++)
        {
            //Printing i spaces at the beginning of each row
            for (int j = 1; j <= noOfRows-i; j++)
            {
                System.out.print(" ");
            }
            //Printing 'rowCount' value 'rowCount' times at the end of each row
            for (int j = 1; j <= i; j++)
            {
                System.out.print(rowCount+" ");
                rowCount++;
            }
            
            System.out.println();
            //Incrementing the rowCount
            
        }
    }
}