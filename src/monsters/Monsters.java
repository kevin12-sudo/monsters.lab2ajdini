/** Project: Monsters lab 2
 * Purpose Details: An assignment
 * Course: IST 242
 * Author: Kevin Ajdini
 * Date Developed: 2/5/2026
 * Last Date Changed: 2/8/2026
 * Rev: 2/8/2026

 */

package monsters;
/** abstract parent class for monsters, it has all characteristics the monsters will need */
/** down here are all the characteristics that define my monster*/
public abstract sealed class Monsters permits Dragon, Yokai, Titan {
    private String name;
    private Hands hands;
    private SpecialPowers specialPowers;
    private String teeth;
    private String horns;
    private String eyes;
    private String skin;
    /** constructors */
    public Monsters(String name, Hands hands, String teeth, String horns, String eyes, String skin) {
        this.name = name;
        this.hands = hands;
        this.teeth = teeth;
        this.horns = horns;
        this.eyes = eyes;
        this.skin = skin;
    }

    /** getters for monsters*/
    public String getName() {
        return name;
    }

    public Hands getHands() {
        return hands;
    }

    public SpecialPowers getSpecialPowers() {
        return specialPowers;
    }

    public String getTeeth() {
        return teeth;
    }

    public String getHorns() {
        return horns;
    }

    public String getEyes() {
        return eyes;
    }

    public String getSkin() {
        return skin;
    }

    /** setters for monsters */
    public void setName(String name) {
        this.name = name;
    }

    public void setHands(Hands hands) {
        this.hands = hands;
    }

    public void setSpecialPowers(SpecialPowers specialPowers) {
        this.specialPowers = specialPowers;
    }

    public void setTeeth(String teeth) {
        this.teeth = teeth;
    }

    public void setHorns(String horns) {
        this.horns = horns;
    }

    public void setEyes(String eyes) {
        this.eyes = eyes;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }
    /** abstract method for monsters to use their special powers and attack */
    /** all the monsters have a special ability and attack thanks to this code*/
    public abstract void Attack();
}