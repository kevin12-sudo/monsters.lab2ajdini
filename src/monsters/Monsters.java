package monsters;

public abstract class Monsters {
    private String name;
    private Hands hands;
    private SpecialPowers specialPowers;
    // Changed to enum type

    public Monsters(String name, Hands hands) {
        this.name = name;
        this.hands = hands;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hands getHands() {
        return hands;
    }

    public void setHands(Hands hands) {
        this.hands = hands;
    }

    public SpecialPowers getSpecialPowers() {
        return specialPowers;
    }

    public void setSpecialPowers(SpecialPowers specialPowers) {
        this.specialPowers = specialPowers;
    }

    public abstract void Attack();
}