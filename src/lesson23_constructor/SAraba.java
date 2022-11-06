package lesson23_constructor;

public class SAraba {
    // bir proje olusturulurken tum classlarda main method olmasina gerek yoktur
    // cogu class obje olusturularak kullanilmak uzere hazirlanmis depolardir
    // Biz de bu class'i araba objeleri icin bir depo olarak dizayn edelim


    // Her class olusturuldugunda java o class'dan obje olusturulabilmesi icin
    // default bir constructor olusturur
    // Bu default constructor gorunmez
    // default constructor parametresizdir ve bize standart bir obje olusturur

    String marka="Marka belirtilmedi";
    String model="Model belirtilmedi";
    String yakit;
    int yil;
    int fiyat;


    public String toString() {
        return "Araba Ozellikleri " +
                "\nmarka : " + marka +
                "\nmodel : " + model +
                "\nyakit : " + yakit +
                "\nyil : " + yil +
                "\nfiyat : " + fiyat ;
    }


    public int maxHiz(String yakit){
        int maxHiz=120;

        if(yakit.equalsIgnoreCase("dizel")){
            maxHiz=200;
        } else if (yakit.equalsIgnoreCase("benzin")) {
            maxHiz=230;
        } else if (yakit.equalsIgnoreCase("elektrikli")) {
            maxHiz=180;
        }
        return maxHiz;
    }

    public  SAraba(String mrk,String mdl,String ykt,int yl,int fyt){

        marka=mrk;
        model=mdl;
        yakit=ykt;
        yil=yl;
        fiyat=fyt;

    }
    //gözle görünür herhangi bir constructor oluşturulduğumuzda
    //java defalt constructor u siler
    //Bu durumda daha once olusturulmus olan objelerin sorun olmaması için
    //claassa parametresiz bir constructor eklememiz faydali olur


    public  SAraba(){

        //gözle görünür herhangi bir constructor oluşturulduğumuzda
        //java defalt constructor u siler
        //Bu durumda daha once olusturulmus olan objelerin sorun olmaması için
        //claassa parametresiz bir constructor eklememiz faydali olur


        // parametresiz constructor'in body'sinde kod yoksa
        // default constructor ile ayni islevi gorur
        // ama yine de gorunur durumdaysa default cons. denmez





    }


    public  SAraba(String mrk,String mdl,int yl){

        // istersek parametreleri azaltarak da constructor olusturabiliriz

        marka=mrk;
        model=mdl;
        yil=yl;

    }
}
