import java.util.ArrayList;

public class suvlar extends araclar {

    private ArrayList<String> suvAraclar = new ArrayList<>();

    public suvlar(String markaModel, int tip, int yil, boolean durumu, String renk) {
        super(markaModel, tip, yil, durumu, renk);
        suvAraclar.add("Kia Sportage");
    }
    public ArrayList<String> getsuvAraclar(){
        return suvAraclar;
    }

    public ArrayList<String> getSuvAraclar() {
        return suvAraclar;
    }

    public void setSuvAraclar(String markaModel) {
        suvAraclar.add(markaModel);
        System.out.println("Mevcut Araçlar:\n ");
        System.out.println(getSuvAraclar());
    }

    @Override
    public void kiralama() {
        super.kiralama();
        System.out.println(getsuvAraclar());
    }

    @Override
    public double gunlukHesaplama(int tip) {
        return super.gunlukHesaplama(tip);
    }

    @Override
    public double aylikHesaplama(int tip) {
        return super.aylikHesaplama(tip);
    }
}
