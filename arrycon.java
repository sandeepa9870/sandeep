import java.util.Scanner;

public class arrycon {
    public static void main(String[] args){
      //array
//
//      //int[] i = new int[10];
//
//      //this one way
////      i[0] = 12;
////        i[1] = 22;
////        i[2] = 32;
////        i[3] = 42;
////        i[4] = 52;
////        i[5] = 62;
//        //scound way
//
//        int[] j ={12,34,56,12,46};
//
//        //System.out.println("size:"+ j.length);
////
////        for (int i=0; i<j ; i++) {
////
////            System.out.println("size:" +i);
////        }
////
////        System.out.println("rool number:" +j[3]);
//
//        for (int value : j) {
//            System.out.println("value: " + value);
//        }
      int[]  D={11,43,30,340,750};

//      for(int i=3;i<D.length;i++){//
//          System.out.println("size:"+D[i]);
//       }

        for(int i=2;i<D.length;i++)

            System.out.println("size:"+ D[i]);
        System.out.println("size row :"+ D[2]);


        int[]  sandeep = {12,34,23,56,78};

        for(int i=0;i<sandeep.length;i++) {

            System.out.println("value:" +sandeep[4] );
        }
      //array in scanner


        Scanner sc=new Scanner(System.in);

        int deepu = sc.nextInt();

        double[] array =new double[deepu];

        for(int i=0;i<array.length;i++);{
            int i=0;
            System.out.println("size:"+ i +";");
            array[i] = sc.nextDouble();
        }

        for(int e =0;e<array.length;e++)
            System.out.println("value:" + e++);

        }

//        //take the arraay size;
//        System.out.println("array size");
//        int deepu=sc.nextInt();
//
//        //crete the array
//
//        int[] array=new int[deepu];
//
//        //step 3 conedition:
//
//        for (int i =0;i<array.length;i++){
//
//            System.out.println("size"+i+":");
//            array[i]=sc.nextInt();
//
//            //print array elements
//
//            System.out.println("array elemets");
//            for (int e = 0; e < array.length; e++) {
//                System.out.println(array[e]);




        }





