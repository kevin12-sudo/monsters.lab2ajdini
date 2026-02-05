package monsters;

public class Main {

    public static void main(String[] args){
        Monsters m1 = new Titan("Eren", Hands.TWO);
        Monsters m2 = new Curse("Sukuna", Hands.FOUR);

        System.out.println("Monster 1 hands: " + m1.getHands());
        System.out.println("Monster 2 hands: " + m2.getHands());

    }
}
