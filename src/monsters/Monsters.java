package monsters;

public abstract sealed class Monsters permits Dragon, Yokai, Titan {
    private String name;
    private Hands hands;
    private SpecialPowers specialPowers;
    private String teeth;
    private String horns;
    private String eyes;
    private String skin;

    public Monsters(String name, Hands hands, String teeth, String horns, String eyes, String skin) {
        this.name = name;
        this.hands = hands;
        this.teeth = teeth;
        this.horns = horns;
        this.eyes = eyes;
        this.skin = skin;
    }

    // Getters
    public String getName() {
        return name;
    }

    public Hands getHands() {
        return hands;
    }

    public SpecialPowers getSpecialPowers() {
        return specialPowers;
    }

    public String getTeeth() {
        return teeth;
    }

    public String getHorns() {
        return horns;
    }

    public String getEyes() {
        return eyes;
    }

    public String getSkin() {
        return skin;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setHands(Hands hands) {
        this.hands = hands;
    }

    public void setSpecialPowers(SpecialPowers specialPowers) {
        this.specialPowers = specialPowers;
    }

    public void setTeeth(String teeth) {
        this.teeth = teeth;
    }

    public void setHorns(String horns) {
        this.horns = horns;
    }

    public void setEyes(String eyes) {
        this.eyes = eyes;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public abstract void Attack();
}