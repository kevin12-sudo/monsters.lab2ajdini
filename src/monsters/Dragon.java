package monsters;

public class Dragon extends Monsters{

    public Dragon(String name, Hands hands) {
        super(name, hands);
    }

    @Override
    public void SpecialPowers() {
        System.out.println("Breathe fire");

    }
}
