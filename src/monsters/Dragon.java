package monsters;

public class Dragon extends Monsters {

    public Dragon(String name, Hands hands) {
        super(name, hands); // Assign Dragon's specific power
    }

    @Override
    public void Attack() {
        System.out.println("The dragons attack and special power is: " + getSpecialPowers());
    }
}