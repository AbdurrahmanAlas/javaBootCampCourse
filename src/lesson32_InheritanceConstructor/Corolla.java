package lesson32_InheritanceConstructor;

public class Corolla extends  BToyota {


    Corolla(int pc){
            super(5);
            System.out.println("Parametreli Corolla construtor");

    }
    Corolla(){

        }

        Corolla(String str){
        this();
            System.out.println("String parametreli corolla cons.");


        }


    public static void main(String[] args) {

        Corolla corolla3=new Corolla("Alas");
        /*
        Parametresiz Araba constructor
        Parametresiz Toyota constructor
      String parametreli corolla cons.

         */







        System.out.println( "---------");
        Corolla corolla1=new Corolla();

        //Parametresiz Araba constructo
        //Parametresiz Toyota constructor
        System.out.println( "---------");

        Corolla corolla2=new Corolla(3);



    }
}
