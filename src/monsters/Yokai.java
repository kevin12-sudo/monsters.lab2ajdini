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
    public String getSoul_type() {
        return soul_type;
    }

    public void setSoul_type(String soul_type) {
        this.soul_type = soul_type;
    }

    private String soul_type;
    /** constructors*/
    public Yokai(String name, Hands hands, String teeth, String horns, String eyes, String skin, String soul_type) {
        super(name, hands, teeth, horns, eyes, skin);
        this.soul_type = soul_type;
    }
    /** uses special powers to implement yokais attacks*/
    @Override
    public void Attack() {
        System.out.println("The yokai's attack and special power is: " + getSpecialPowers());
    }
}