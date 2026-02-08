package monsters;

public class Undead extends Monsters{

    public Undead(String name, Hands hands) {
        super(name, hands,SpecialPowers.BITE);
    }

    @Override
    public void Attack() {
        System.out.println("The undead's attack and special power is: " +getSpecialPowers());

    }
}
