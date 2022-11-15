package lesson28_varargs_StringBuilder;

public class C01_Varargs {

    public static void main(String[] args) {


        topla(5,6);
        topla(5,4,7);
        topla(4,5,7,8);

        //parametre sayısı degiştikçe bizden yeni method oluşturmamızı ister


    }

    private static void topla(int sayi1, int sayi2, int sayi3, int sayi4) {

        System.out.println("4 sayının toplamı : "+ (sayi1+sayi2+sayi3+sayi4));

    }

    private static void topla(int sayi1, int sayi2, int sayi3) {
        System.out.println("3 sayının toplamı : "+ (sayi1+sayi2+sayi3));

    }

    private static void topla(int sayi1, int sayi2) {

        System.out.println("2 sayının toplamı : "+ (sayi1+sayi2));

    }

}
