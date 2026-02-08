package monsters;

public class Yokai extends Monsters {
    public Yokai(String name, Hands hands) {
        super(name, hands, SpecialPowers.SOUL_HAUNT); // Yokai's power
    }

    @Override
    public void Attack() {
        System.out.println("The yokai's attack and special power is: " +getSpecialPowers());
    }
}