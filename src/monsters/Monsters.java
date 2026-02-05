package monsters;

public abstract class Monsters {

    public Monsters(String name, Hands hands) {
        this.name = name;
        this.hands = hands;
    }

    private void hands() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Hands getHands() {
        return hands;
    }

    public void setHands(Hands powers) {
        this.hands = powers;
    }

    private Hands hands;


}
