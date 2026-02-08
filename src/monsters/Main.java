package monsters;


public class Main {

    public static void main(String[] args){
        Monsters colossal_titan = new Titan("Armin", Hands.TWO);
        System.out.println("Monster 1 name: " + colossal_titan.getName());
        Monsters dragon1 = new Dragon("Kalamet", Hands.CLAWS);
        System.out.println("Monster 3 name: " + dragon1.getName());
        Monsters yokai1 = new Yokai("Mizuki",Hands.SIX);
        System.out.println("Monster 5 name: " + yokai1.getName());


        colossal_titan.setSpecialPowers(SpecialPowers.HOT_STEAM_SKIN);
        dragon1.setSpecialPowers(SpecialPowers.FIRE_BREATH);
        yokai1.setSpecialPowers(SpecialPowers.SOUL_HAUNT);





        colossal_titan.Attack();
        dragon1.Attack();
        yokai1.Attack();


    }
}
