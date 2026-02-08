package monsters;

public class Mecha extends Monsters{

    public Mecha(String name, Hands hands) {
        super(name, hands,SpecialPowers.LAZER_EYES);

    }

    @Override
    public void Attack() {
        System.out.println("The mechas attack and special power is: " +getSpecialPowers());
    }
}
