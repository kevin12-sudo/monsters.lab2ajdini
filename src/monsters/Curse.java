package monsters;

public class Curse extends Monsters{

    public Curse(String name, Hands hands) {
        super(name, hands);

    }

    @Override
    public void SpecialPowers() {
        System.out.println("Domain expansion");
    }
}
