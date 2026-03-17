import java.util.Scanner;

public class nestedLoop {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int rows =sc.nextInt();
        int col = sc.nextInt();

        //create arry;

        int[][] arr=new int[rows][col];

        //read the data

        for(int i =0 ;i <arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
            arr[i][j]=sc.nextInt();}

        }

       //print the data

        for (int i=0;i<arr.length;i++)
            for(int j =0;j<arr[i].length;j++){
                System.out.println(arr[i][j] +" ");
            }

        System.out.println();







    }
}
