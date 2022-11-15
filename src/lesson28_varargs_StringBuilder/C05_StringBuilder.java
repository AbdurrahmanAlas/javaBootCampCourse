package lesson28_varargs_StringBuilder;

public class C05_StringBuilder {
    public static void main(String[] args) {


        StringBuilder sb=new StringBuilder("Java candır");
        System.out.println(sb.capacity()); //16+12=28

        System.out.println(sb.length()); //12

        System.out.println(sb.reverse()); //.ridnac avaJ

        sb.replace(1,2,"yaaaaa");
        System.out.println(sb);


    }
}
