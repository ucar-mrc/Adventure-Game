import java.util.Random;

public class Monster {

    private String name;
    private int damage;
    private int health;
    private int award;
    private int maxNumber;

    public Monster(String name,int damage,int health,int award, int maxNumber)
    {
        this.name=name;
        this.damage=damage;
        this.health=health;
        this.award=award;
        this.maxNumber=maxNumber;
    }
   /* public Monster(String name,int damage,int health,int award, int maxNumber)
    {
        this.setName(getName());
        this.setDamage(getDamage());
        this.setAward(getAward());
        this.setHealth(getHealth());
        this.setMaxNumber(getMaxNumber());
    }
*/

    public int monsterNumber()
    {
        Random random =new Random();
        return random.nextInt(this.maxNumber)+1;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAward() {
        return award;
    }

    public void setAward(int award) {
        this.award = award;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }
}
