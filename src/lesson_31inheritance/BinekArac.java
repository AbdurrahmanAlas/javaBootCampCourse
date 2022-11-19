package lesson_31inheritance;

public class BinekArac extends Arac{

    //teker methodunu kendine göre güncel,ler
    //marka ,model ,yıl,hız()

    protected  String marka="Binek araçların markası olur.";
    protected String model="Binek araçların modeli olur";
    protected  int yil=1900;
    protected  void  hiz(String yakıt){

        System.out.println("binek araçların hızı modele göre degişir.");


    }

    protected  void teker(){


        System.out.println("binek araçların 4 tekeri olur");
    }




}
