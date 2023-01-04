public class sirket extends musteriler {

    private String vergiDairesi;

    private int vergiNo;

    public sirket(String isim, String telelfonNo, String vergiDairesi, int vergiNo) {
        super(isim, telelfonNo);
        this.vergiDairesi = vergiDairesi;
        this.vergiNo = vergiNo;
        System.out.println("Şirket Girişi Sağlandı.");
    }
}

