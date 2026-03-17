public class arrayWithoutsca {
    public static void main(String[] args){

       int [] a = {12,23,24,25,29};

//        //print
//        System.out.println("/n=========All number===========");
//        System.out.println("SIZE:" +a.length);
//        System.out.println("result:" +a[2]);
//        System.out.println("sum:" +a[2]/2);
//
////
////       //2nd way to write the code:-
//        int[] b = new int[3];
//        b[0] = 2;
//        b[1] = 5;
//        b[2] = 9;
//
//        System.out.println("sum:" + (a[1]*=b[2]));
//        System.out.println("avarage:" + b.length);
//
//        //print the  number and values;
//
//        for(int i=0;i<b.length;i++){
//
//            System.out.println("resu:" + i + ":" +b[i]);

            //for each;
           //System.out.println("print for each");

           //for(int x: a)

               //System.out.println(x);

        //Program 2: Sum and Average of Array Elements

//             double[] fruits = {22.40 , 23.56, 34.56, 67.89};
//
//             double total = 0;
//
//             //sum of total
//
//            for(int i=0;i<fruits.length;i++){
//
//                //System.out.println("size:" + fruits[i]  );
//                //print total
//                total=total+fruits[i];
//
//                System.out.println("result:" +total);
//
//                double avarage = total/ fruits.length;
//
//                for(double number :fruits){
//                    System.out.println(fruits);
//                }
//                 System.out.println("xyztotal" + total);
//                System.out.println("xytotal" + avarage);
//

                //max value and min value

                int[]  cd={1,3,6,7,9,10,11};

                int max = 0;
                int min = 0;

                for(int i=0;i<cd.length;i++)
                {
                    if(cd[i]>max){
                    max=cd[i];

                }
                    if (cd[i]<min){
                        min=cd[i];
                    }
                  System.out.println(max);
                    System.out.println(max);




            }




        }

    }



