package monsters;

public final class Titan extends Monsters {

    public Titan(String name, Hands hands, String teeth, String horns, String eyes, String skin) {
        super(name, hands, teeth, horns, eyes, skin);
    }

    @Override
    public void Attack() {
        System.out.println("The titans attack and special power is: " +getSpecialPowers());

    }
}
