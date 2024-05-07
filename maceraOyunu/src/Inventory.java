public class Inventory {

    private boolean water;
    private boolean food;
    private boolean firewood;
    private String weaponName;
    private String armorName;
    private int damege;
    private int armor;

    Inventory()
    {
        this.setWater(false);
        this.setFood(false);
        this.setFirewood(false);
        this.setWeaponName(null);
        this.setArmorName(null);
        this.setDamege(0);
        this.setArmor(0);

    }

    public boolean isWater() {
        return water;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public boolean isFirewood() {
        return firewood;
    }

    public void setFirewood(boolean firewood) {
        this.firewood = firewood;
    }



    public int getDamege() {
        return damege;
    }

    public void setDamege(int damege) {
        this.damege = damege;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public String getArmorName() {
        return armorName;
    }

    public void setArmorName(String armorName) {
        this.armorName = armorName;
    }
}
