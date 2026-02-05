package monsters;

public class Titan extends Monsters {

    public Titan(String name, Hands hands) {
        super(name, hands);
    }

    @Override
    public void SpecialPowers() {
        System.out.println("Bite");

    }
}
