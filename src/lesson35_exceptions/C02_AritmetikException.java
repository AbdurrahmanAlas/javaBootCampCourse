package lesson35_exceptions;

public class C02_AritmetikException {

    public static void main(String[] args) {


        //Verilen iki sayıyı birbirine bölüp sonucun
        //tam sayı kısmını yazdıırın

        int sayi1=20;
        int sayi2=0;

        try {

            //riskli olduğunu öngördüğümüz kodlar

            System.out.println(sayi1/sayi2);
        } catch (ArithmeticException e) {

            // catch (ArithmeticException e)  ongordugumuz risk
            System.out.println("Sayi sifira bolunemez");
            // catch(0 'den sonraki { } catch blogu denir
            // beklenen risk gerceklesirse calisacak kodlar


 /*
          Bazi exception'lar if else ile handle edilebilir ancak
          tum exception'lar icin if else yeterli olmaz
         */


        }



    }
}
