package lesson28_varargs_StringBuilder;

public class C03_Varargs {
    public static void main(String[] args) {


        method1(3,4,6,5,7);

    }
    public static void method1(int a,int b,int c, int... sayilar){

    }
    // public static void method1(int... sayilar, int s, int t){
    // method'da parametre olarak varargs varsa, son parametre olmasi ZORUNLUDUR
    // bu durumda bir method'da 2 varargs parametre OLAMAZ
    // }

}
