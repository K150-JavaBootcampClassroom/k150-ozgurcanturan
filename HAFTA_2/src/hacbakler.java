import java.util.ArrayList;

public class hacbakler extends araclar {

    private ArrayList<String> hacbakler = new ArrayList<>();

    public hacbakler(String markaModel, int tip, int yil, boolean durumu, String renk) {
        super(markaModel, tip, yil, durumu, renk);
        hacbakler.add("Kia Ceed");
    }

    public ArrayList<String> getHacbakler() {
        return hacbakler;
    }

    public void setHacbakler(String markaModel) {
        hacbakler.add(markaModel);
        System.out.println("Mevcut Araçlar:\n ");
        System.out.println(getHacbakler());
    }

    @Override
    public void kiralama() {
        super.kiralama();
        System.out.println(getHacbakler());
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
