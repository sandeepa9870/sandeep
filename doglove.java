class dog {

    String name;
    int weight;
    double height;
    //constrcer:-

    dog(String name, int weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;

    }

    //setmethod

    public void setA(String name, int weight, double height) {

        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    //getmethod


    public String getname() {
        return name;
    }

    public int getweight() {
        return weight;
    }

    public double getheight() {
        return height;

    }

    //method

    public void display() {

        System.out.println("print the name" + getname());
        System.out.println("print the name" + getheight());
        System.out.println("print the name" + getweight());


    }
}

public class doglove {
    public static void main(String[] args){

        dog E=new dog("sandeep", 34 ,33);

        System.out.println(E.getweight());

        E.setA("raju" , 36,  32.23);

        System.out.println(E.getweight());



    }



}






































//
//
//class cat{
//    int a;
//    String b;
//
//    //set create
//    public void setCat (int a,String b){
//        this.a=a;
//        this.b=b;
//    }
//    //get
//    public int getA() {
//        return a;
//    }
//    public String getB() {
//        return b;
//    }
//}
// //create object
//class catLog {
//     public static void main(String[] args) {
//
//         cat E = new cat();
//
//         E.setCat(12, "sandeep");
//
//         System.out.println(E.getA());
//         System.out.println(E.getB());
//     }
// }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////class Cardata{
////    int a;
////    int b;
////    String c;
////
////    Cardata (int a ,int b,String c){
////       this.a=a;
////         this.b=b;
////         this.c=c;
////
////
////    }
////    //method
////    void display(){
////        System.out.println("re:"+ a);
////        System.out.println("re:"+ b);
////        System.out.println("re:"+ c);
////
////    }
////
////}
////
////public class Car{
////    public static void main(String[] args){
////
////        Cardata car=new Cardata(1,5,"sandeep");
////        System.out.println(car);
////        car.display();
////
////    }
////
////
////}
////
//
//
//
//
//
//
//
