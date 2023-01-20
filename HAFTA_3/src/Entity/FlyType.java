package Entity;

public enum FlyType {
    DOMESTIC("yurtici"),
    INTERNATIONAL("yurtdisi");
    private String flyType;

    FlyType(String flyType) {
        this.flyType = flyType;
    }

    public String getFlyType() {
        return flyType;
    }
}
