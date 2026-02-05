package monsters;

public class Main {

    public static void main(String[] args){
        Monsters m1 = new Grass("Chikorita");
        Monsters m2 = new Curse("Sukuna");

        System.out.println("Monster 1 name: " + m1.getName());
        System.out.println("Monster 1 name: " + m2.getName());

    }
}
