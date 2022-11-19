package lesson32_InheritanceConstructor;

import java.util.Calendar;

public class DCamry extends  BToyota{

    DCamry(String pc){

        super("Ahmet");
        System.out.println("String parametreli camry");

    }

    DCamry(){

    }

    public static void main(String[] args) {
        DCamry camry2=new DCamry("senem");








        //Eger kullanılan argumente uygun bir
        //constructor parent classda yoksa CTE olur

        System.out.println("=======");
        DCamry camry1=new DCamry();

    }
}
