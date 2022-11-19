package lesson_Encapsulation;

public class EChild extends DParent {

    /*
    javadaki ınheritancein insanlardan en büyük farkı :
    insanlarda parent child edilebilir ama child parent edilemez
    javada tam tersidir.
        - Siz bir class oluşturduğunuzad daha önce oluşturulmuş classlardan
        tüm özellikleri inherit etmek istediğiniz classı PARENT EDEBİLİRSİNİZ.
      - Bir classs başka bir Classı inherit etmek istediğnde extends keyword ile bunu deklare eder


     */

    public static void main(String[] args) {

     EChild child1=new EChild();
     child1.yas=30;
     child1.isim="Alas";
     child1.isEnough=false;
    }


}
