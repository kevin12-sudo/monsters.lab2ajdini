package monsters;

public class Main {

    public static void main(String[] args){
        Monsters c1 = new Grass("Chikorita");
        Monsters c2 = new Fire("Charizard");

        System.out.println("Monster 1 name: " + c1.getName());
        System.out.println("Monster 1 name: " + c2.getName());

    }
}
