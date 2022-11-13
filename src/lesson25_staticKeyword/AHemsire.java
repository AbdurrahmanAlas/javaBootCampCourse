package lesson25_staticKeyword;

public class AHemsire {

    static String hastaneIsmi="Sistem Hastanesi";
    static String hastaneAdresi="Kocasinan / Kayseri";
    static String bashekimIsmi="Dr Mehmet Yilmaz";

    String personelIsim="Isim belirtilmedi";
    String personelAdresi="Adres belirtilmedi";
    String personelTelefon="Telefon belirtilmedi";
    @Override
    public String toString() {
        return "AHemsire{" +
                "personelIsim='" + personelIsim + '\'' +
                ", personelAdresi='" + personelAdresi + '\'' +
                ", personelTelefon='" + personelTelefon + '\'' +
                ", \n hastaneIsmi='" + hastaneIsmi + '\'' +
                ",  hastaneAdresi='" + hastaneAdresi + '\'' +
                ",  bashekimIsmi='" + bashekimIsmi + '\'' +
                '}';
    }





}
