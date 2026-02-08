package monsters;

public final class Dragon extends Monsters {

    public Dragon(String name, Hands hands, String teeth, String horns, String eyes, String skin) {
        super(name, hands, teeth, horns, eyes, skin);
    }

    @Override
    public void Attack() {
        System.out.println("The dragon's attack and special power is: " + getSpecialPowers());
    }
}