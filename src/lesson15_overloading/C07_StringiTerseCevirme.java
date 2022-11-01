package lesson15_overloading;

public class C07_StringiTerseCevirme {

    public static void main(String[] args) {
        //Soru 3- While loop kullanarak verilen bir String’i terse cevirip,
        // bu halini bize donduren bir method olusturun.

        String str= "Java Candir";

        String tersStr= stringiTersCevir(str);
        System.out.println(tersStr);

    }

    public static String stringiTersCevir(String str) {

        String tersStr="";
        int index=str.length()-1;

        while(index>=0){
            tersStr+=str.substring(index,index+1);
            index--;
        }

        return tersStr;
    }
}
