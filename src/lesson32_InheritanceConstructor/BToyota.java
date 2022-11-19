package lesson32_InheritanceConstructor;

public class BToyota extends  Araba {

    BToyota(){

        System.out.println("Parametresiz Toyota constructor");
    }
    BToyota(int pt){

        System.out.println("Parametreli Toyota constructor");
    }

    BToyota(String pt2){


        super("mehmet");
        System.out.println("String parametreli toyota");
    }

}
