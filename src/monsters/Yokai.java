/** Project: Monsters lab 2
 * Purpose Details: An assignment
 * Course: IST 242
 * Author: Kevin Ajdini
 * Date Developed: 2/5/2026
 * Last Date Changed: 2/8/2026
 * Rev: 2/8/2026

 */

package monsters;
/** yokai monster class*/
public final class Yokai extends Monsters {
    /** constructors*/
    public Yokai(String name, Hands hands, String teeth, String horns, String eyes, String skin) {
        super(name, hands, teeth, horns, eyes, skin);
    }
    /** uses special powers to implement yokais attacks*/
    @Override
    public void Attack() {
        System.out.println("The yokai's attack and special power is: " + getSpecialPowers());
    }
}