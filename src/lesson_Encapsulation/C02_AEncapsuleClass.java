package lesson_Encapsulation;

public class C02_AEncapsuleClass {

    public void setHastaUcreti(int hastaUcreti) {
        this.hastaUcreti = hastaUcreti;
    }

    public String getHastaneIsmi() {
        return hastaneIsmi;
    }

    private  String hastaneIsmi="Yıldız Hastanesi";
    //hastane ismi görülebilsin ama degiştirilemesin
    //getter methodu lazım


    private  int hastaUcreti;
    //hasta ücreti girilebilsin ama ücreti sigortadan alınacağı için
    //personel hasta ücretini göremesin
    //setter methodu lazım


    private String hemsireIsmi;
    private String hemsireAdresi;
    //bu Instance variable lara herkes ulasabisin
    //bu durumda  public yapmak ilk akla gelen
    //bu variable ları public yapmak yerine
    //privat yapıp GETTER VE SETTER oluşturmak da
    //aynı işlevi gorur


    public String getHemsireIsmi() {
        return hemsireIsmi;
    }

    public void setHemsireIsmi(String hemsireIsmi) {
        this.hemsireIsmi = hemsireIsmi;
    }

    public String getHemsireAdresi() {
        return hemsireAdresi;
    }

    public void setHemsireAdresi(String hemsireAdresi) {
        this.hemsireAdresi = hemsireAdresi;
    }
}
