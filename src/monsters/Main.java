package monsters;


public class Main {

    public static void main(String[] args){
        Monsters m1 = new Titan("Eren", Hands.TWO);
        System.out.println("Monster 1 name: " + m1.getName());
        Monsters m2 = new Mecha("Homelander", Hands.FOUR);
        System.out.println("Monster 2 name: " + m2.getName());
        Monsters m3 = new Dragon("Kalamet", Hands.CLAWS);
        System.out.println("Monster 3 name: " + m3.getName());
        Monsters m4 = new Yokai("Mizuki",Hands.SIX);
        System.out.println("Monster 5 name: " + m4.getName());
        Monsters m5 = new Undead("Straizo",Hands.TWO);
        System.out.println("Monster 5 name: " + m5.getName());


        m1.Attack();
        m2.Attack();
        m3.Attack();
        m4.Attack();
        m5.Attack();

    }
}
