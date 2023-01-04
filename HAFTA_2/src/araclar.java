
public abstract class araclar {
    public araclar(){
    }
    private String markaModel; //Dacia Duster, Kia sportage
    private int tip; //kullanıcı tipi 1 vatandas 2 şirket
    private int yil;//2022 model
    private boolean durumu;// müsaitlik durumu
    private String renk;//arac rengi

    private double gunluk1 = 300;
    private double gunluk2 = 250;
    private double gunluk3 = 200;

    private double aylik1 = 300;
    private double aylik2 = 250;
    private double aylik3 = 200;

    public araclar(String markaModel, int tip, int yil, boolean durumu, String renk) {
        this.markaModel = markaModel;
        this.tip = tip;
        this.yil = yil;
        this.durumu = durumu;
        this.renk = renk;
    }

    public String getMarkaModel() {
        return markaModel;
    }

    public void setMarkaModel(String markaModel) {
        this.markaModel = markaModel;
    }

    public int getTip() {
        return tip;
    }

    public void setTip(int tip) {
        this.tip = tip;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }

    public boolean isDurumu() {
        return durumu;
    }

    public void setDurumu(boolean durumu) {
        this.durumu = durumu;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public double getGunluk1() {
        return gunluk1;
    }

    public void setGunluk1(double gunluk1) {
        this.gunluk1 = gunluk1;
        System.out.println("Fiyat "+getGunluk1()+"₺ olarak değiştirildi.");
    }

    public double getGunluk2() {
        return gunluk2;
    }

    public void setGunluk2(double gunluk2) {
        this.gunluk2 = gunluk2;
        System.out.println("Fiyat "+getGunluk2()+"₺ olarak değiştirildi.");
    }

    public double getGunluk3() {
        return gunluk3;
    }

    public void setGunluk3(double gunluk3) {
        this.gunluk3 = gunluk3;
        System.out.println("Fiyat "+getGunluk3()+"₺ olarak değiştirildi.");
    }

    public double getAylik1() {
        return aylik1;
    }

    public void setAylik1(double aylik1) {
        this.aylik1 = aylik1;
        System.out.println("Fiyat "+getAylik1()+"₺ olarak değiştirildi.");
    }

    public double getAylik2() {
        return aylik2;
    }

    public void setAylik2(double aylik2) {
        this.aylik2 = aylik2;
        System.out.println("Fiyat "+getAylik2()+"₺ olarak değiştirildi.");
    }

    public double getAylik3() {
        return aylik3;
    }

    public void setAylik3(double aylik3) {
        this.aylik3 = aylik3;
        System.out.println("Fiyat "+getAylik3()+"₺ olarak değiştirildi.");
    }

    public void kiralama() {
        if (getTip() == 1 && durumu == true) {
            System.out.println("Araçlar :  ");
        } else {
            System.out.println("Araçlar :  ");
        }
    }

    public double gunlukHesaplama(int tip) {
        double sonuc = 0.0;
        switch (tip) {
            case 1:
                sonuc = gunluk1;
                break;
            case 2:
                sonuc = gunluk2;
                break;
            case 3:
                sonuc = gunluk3;

                break;
        }
        return sonuc;
    }

    public double aylikHesaplama(int tip) {
        double sonuc = 0.0;

        switch (tip) {
            case 1:
                sonuc = aylik1;
                break;
            case 2:
                sonuc = aylik2;
                break;
            case 3:
                sonuc = aylik3;
                break;
        }
        sonuc *= 30;
        return sonuc;
    }

    public double kdvHesapla(double tutar) {
        tutar *= 0.18;
        return tutar;
    }
}
