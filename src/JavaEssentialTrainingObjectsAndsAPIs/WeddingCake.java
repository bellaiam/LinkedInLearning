package JavaEssentialTrainingObjectsAndsAPIs;

public class WeddingCake extends Cake {
    private String tiers;

    public WeddingCake() {
        super("almond");
    }

    public String getTiers() {
        return tiers;
    }

    public void setTiers(String tiers) {
        this.tiers = tiers;
    }
}
