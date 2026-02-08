package monsters;


public class Main {

    public static void main(String[] args){
        Monsters colossal_titan = new Titan("Armin", Hands.TWO,"Rock teeth","none","brown","Dark red muscles");
        Monsters dragon1 = new Dragon("Kalamet", Hands.CLAWS,"Metal teeth","Metal horns","Brown eyes","Red scales");
        Monsters yokai1 = new Yokai("Ao Oni",Hands.FOUR,"Sharp teeth","Bone-like","Dark red eyes","Purple flesh");
        Monsters dragon2 = new Dragon("Sinh",Hands.PAWS,"Jagged teeth","Flesh like","Blue eyes","Green scales");
        Monsters armor_titan = new Titan("Reiner",Hands.TWO,"Rock teeth","none","Yellow eyes","Yellow metal");


        colossal_titan.setSpecialPowers(SpecialPowers.HOT_STEAM_SKIN);
        dragon1.setSpecialPowers(SpecialPowers.FIRE_BREATH);
        yokai1.setSpecialPowers(SpecialPowers.SOUL_HAUNT);
        dragon2.setSpecialPowers(SpecialPowers.POISON_BREATH);
        armor_titan.setSpecialPowers(SpecialPowers.WALL_BREAK);


        System.out.println("Monster 1 details:");
        System.out.println("name " + colossal_titan.getName());
        System.out.println("hands: " + colossal_titan.getHands());
        System.out.println("teeth: " +colossal_titan.getTeeth());
        System.out.println("horns: " + colossal_titan.getHorns());
        System.out.println("eyes: " + colossal_titan.getEyes());
        System.out.println("skin: " + colossal_titan.getSkin());
        colossal_titan.Attack();

        System.out.println("Monster 2 details:");
        System.out.println("name: " + dragon1.getName());
        System.out.println("hands: " + dragon1.getHands());
        System.out.println("teeth: " + dragon1.getTeeth());
        System.out.println("horns: " + dragon1.getHorns());
        System.out.println("eyes: " + dragon1.getEyes());
        System.out.println("skin: " + dragon1.getSkin());
        dragon1.Attack();

        System.out.println("Monster 3 details:");
        System.out.println("name: " + yokai1.getName());
        System.out.println("hands: " + yokai1.getHands());
        System.out.println("teeth: " + yokai1.getTeeth());
        System.out.println("horns: " + yokai1.getHorns());
        System.out.println("eyes: " + yokai1.getEyes());
        System.out.println("skin: " + yokai1.getSkin());
        yokai1.Attack();

        System.out.println("Monster 4 details:");
        System.out.println("name: " + dragon2.getName());
        System.out.println("hands: " + dragon2.getHands());
        System.out.println("teeth: " + dragon2.getTeeth());
        System.out.println("horns: " + dragon2.getHorns());
        System.out.println("eyes: " + dragon2.getEyes());
        System.out.println("skin: " + dragon2.getSkin());
        dragon2.Attack();

        System.out.println("Monster 5 details:");
        System.out.println("name: " + armor_titan.getName());
        System.out.println("hands: " + armor_titan.getHands());
        System.out.println("teeth: " + armor_titan.getTeeth());
        System.out.println("horns: " + armor_titan.getHorns());
        System.out.println("eyes: " + armor_titan.getEyes());
        System.out.println("skin: " + armor_titan.getSkin());
        armor_titan.Attack();

        System.out.println("All monsters special powers:");
        System.out.println(colossal_titan.getName());
        colossal_titan.Attack();
        System.out.println(dragon1.getName());
        dragon1.Attack();
        System.out.println(yokai1.getName());
        yokai1.Attack();
        System.out.println(dragon2.getName());
        dragon2.Attack();
        System.out.println(armor_titan.getName());
        armor_titan.Attack();







    }
}
