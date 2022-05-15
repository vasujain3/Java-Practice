import java.util.Scanner;

public class Twodarray {
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter No. of rows:");
    int row = sc.nextInt();
    
    System.out.println("Enter No. of columns:");
    int cols = sc.nextInt();
     
    int [][] matrix = new int[row][cols] ; 
    
    System.out.println("Enter the elements");
    for(int i=0;i<row;i++)
    {
          for(int j=0;j<cols;j++)
          {
            matrix[i][j]= sc.nextInt();
          }
      }
      System.out.println("The elements are: ");
      for(int i=0;i<row;i++)
      {
          for(int j=0;j<cols;j++)
          {
             System.out.print(matrix[i][j]+ " ");
          }
          System.out.println("");
      }
      sc.close();
    }

}    

