package Entity;

public abstract class Fruits {
    private String name;
    private double kg;

    public String getName() {
        return name;
    }

    public double getKg() {
        return kg;
    }

    public void setKg(double kg) {
        this.kg = kg;
    }

    public Fruits(String name, double kg) {
        this.name = name;
        this.kg = kg;
    }
}
