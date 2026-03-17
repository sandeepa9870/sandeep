import java.util.Scanner;

public class arrayScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Program 2: Sum and Average of Array Elements

        //intger value

        int a = sc.nextInt();

        //2nd step create array//

        int[] arr = new int[a];

        //read the integer value:

        for (int i = 0; i < arr.length; i++) {
            System.out.println("size:" + i + ":");
            arr[i] = sc.nextInt();

            //print the value;

            for (int value : arr) {
                System.out.println(value);


            }


        }
    }
}
