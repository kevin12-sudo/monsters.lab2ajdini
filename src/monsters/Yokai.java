package monsters;

public final class Yokai extends Monsters {

    public Yokai(String name, Hands hands, String teeth, String horns, String eyes, String skin) {
        super(name, hands, teeth, horns, eyes, skin);
    }

    @Override
    public void Attack() {
        System.out.println("The yokai's attack and special power is: " + getSpecialPowers());
    }
}