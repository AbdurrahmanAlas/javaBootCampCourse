package lesson28_varargs_StringBuilder;

public class C02_Varargs2 {
    public static void main(String[] args) {


        topla(5, 6);
        topla(5, 4, 7);
        topla(4, 5, 7, 8);
        topla();
        topla(3,5,6,7,8,6,54,4,5,6);
        //parametre sayısı degiştikçe bizden yeni method oluşturmamızı ister

        /*
        Bir methodda parametre sayisini sinirlandırmak istemezsek standart bir variable yerine varargs kullanırız
        Varargs data türünün yanına 3 nokta konularak deklare edilir.
        int... ==> sayisi belirli olmayan int parametreler alan bir arraydir


         */



    }


    public  static void topla(int... sayilar) {

        int toplamSonucu=0;
        for (int each:sayilar
             ) {
            toplamSonucu+=each;

        }
        System.out.println("Girilen sayiların toplamı : " +toplamSonucu);


    }

}
