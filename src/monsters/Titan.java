package monsters;

public class Titan extends Monsters {

    public Titan(String name, Hands hands) {
        super(name, hands,SpecialPowers.SUPERHUMAN_CRUSH);
    }

    @Override
    public void Attack() {
        System.out.println("The titans attack and special power is: " +getSpecialPowers());

    }
}
