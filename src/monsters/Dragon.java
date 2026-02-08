/** Project: Monsters lab 2
 * Purpose Details: An assignment
 * Course: IST 242
 * Author: Kevin Ajdini
 * Date Developed: 2/5/2026
 * Last Date Changed: 2/8/2026
 * Rev: 2/8/2026

 */
package monsters;
/** dragon monster type*/
public final class Dragon extends Monsters {
    /** constructor */
    public Dragon(String name, Hands hands, String teeth, String horns, String eyes, String skin) {
        super(name, hands, teeth, horns, eyes, skin);
    }
    /** uses the special powers to attack for this specific monster*/
    @Override
    public void Attack() {
        System.out.println("The dragon's attack and special power is: " + getSpecialPowers());
    }
}