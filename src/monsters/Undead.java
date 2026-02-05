package monsters;

public class Undead extends Monsters{

    public Undead(String name, Hands hands) {
        super(name, hands);
    }

    @Override
    public void SpecialPowers() {
        System.out.println("Stop time");

    }
}
