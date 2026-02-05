package monsters;

public class Yokai extends Monsters{

    public Yokai (String name, Hands hands) {
        super(name,hands);
    }

    @Override
    public void SpecialPowers() {
        System.out.println("Haunt");

    }
}
