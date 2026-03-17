import java.util.Scanner;

public class multifun {
    public static void main(String[] args) {

        int[][] a = {

                {1, 4, 5},
                {3, 5, 2},
                {3, 4, 2}

        };

        for (int i = 0; i < a.length; i++)
        {

            for (int j = 0; j < a[i].length; j++)
            {
                System.out.print(a[i][j] + " ");

            }
            System.out.println();



        }
        //in scanner;

                Scanner sc = new Scanner(System.in);

        //installation rows and colum;

                System.out.print("How many rows? ");
                int rows = sc.nextInt();

                System.out.print("How many columns? ");
                int cols = sc.nextInt();

        //array creation

        int[][] matrix = new int[rows][cols];

                // Taking input
                System.out.println("Enter values:");
                //for condition

                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        System.out.print("matrix[" + i + "][" + j + "] = ");
                        matrix[i][j] = sc.nextInt();
                    }
                }

                // Printing
                System.out.println("\nYour table:");
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        System.out.print(matrix[i][j] + "\t");
                    }
                    System.out.println();
                }

                sc.close();}
    }
