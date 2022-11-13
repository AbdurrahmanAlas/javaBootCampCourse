package lesson27_immutableClassess_DateandTime;

public class C02_StringPool
{

    public static void main(String[] args) {

        String str1= "Java";
        String str2="Java";
        String str3=new String("Java");

        String str4="";
        str4="Java";
        String str5="Ja";
        str5=str5.concat("va");


        System.out.println(str1.equals(str2)); //true
        System.out.println(str1 == str2); //true
        System.out.println(str1.equals(str3));//true

        System.out.println(str1==str3); //False



    }
}
