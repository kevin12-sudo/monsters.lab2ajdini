/** Project: Monsters lab 2
 * Purpose Details: An assignment
 * Course: IST 242
 * Author: Kevin Ajdini
 * Date Developed: 2/5/2026
 * Last Date Changed: 2/8/2026
 * Rev: 2/8/2026

 */
package monsters;
/** titan monster class, direct reference to attack on titan monsters*/
public final class Titan extends Monsters {
    /** constructors */
    public Titan(String name, Hands hands, String teeth, String horns, String eyes, String skin) {
        super(name, hands, teeth, horns, eyes, skin);
    }
    /** attack behavior for titans using special powers*/
    @Override
    public void Attack() {
        System.out.println("The titans attack and special power is: " +getSpecialPowers());

    }
}
