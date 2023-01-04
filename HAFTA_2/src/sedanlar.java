import java.util.ArrayList;

public class sedanlar extends araclar {
    private ArrayList<String> sedanList =new ArrayList<>();
    public sedanlar(String markaModel, int tip, int yil, boolean durumu, String renk) {
        super(markaModel, tip, yil, durumu, renk);
        sedanList.add("Kia Cerato");
    }


    public ArrayList<String> getSedanList() {
        return sedanList;
    }

    public void setSedanList(String markaModel) {
        sedanList.add(markaModel);
        System.out.println("Mevcut Araçlar:\n ");
        System.out.println(getSedanList());
    }

    @Override
    public void kiralama() {
        super.kiralama();
        System.out.println(getSedanList());
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
