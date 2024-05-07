import java.util.Scanner;

public class Player {
    private int damage;
    private int money;
    private int healthy;
    private int realhealthy;
    private String playerName;
    private String CaracterName;
    private Inventory inventory;

    Scanner scan = new Scanner(System.in);

    public Player(String playerName) {

        this.setPlayerName(playerName);
        this.inventory=new Inventory();
    }

    public void selectCaracter() {
        switch (caracterMenu()) {
            case 1:
                setCaracterName("Samuray");
                setDamage(5);
                setHealthy(21);
                setMoney(15);
                setRealhealthy(15);
                break;
            case 2:
                setCaracterName("Okçu");
                setDamage(7);
                setHealthy(18);
                setMoney(20);
                setRealhealthy(18);
                break;
            case 3:
                setCaracterName("Şövalye");
                setDamage(8);
                setHealthy(24);
                setMoney(5);
                setRealhealthy(24);
                break;
        }

        System.out.println("karakter:" + getCaracterName() + "\tHasar:" + getDamage() + "\tSağlık:" + getHealthy() + "\tPara:" + getMoney());
    }

    public int caracterMenu() {
        System.out.println("Lütfen bir karakter seç: ");
        System.out.println("Karakter menüsü: ");
        System.out.println("1- Samuray \t Hasar: 5 \tSağlık: 21 \tPara: 15");
        System.out.println("2- Okçu \t Hasar: 7 \tSağlık: 18 \tPara: 20");
        System.out.println("3- Şövalye \t Hasar: 8 \tSağlık: 24 \tPara: 5");
        System.out.print("Seçimin: ");
        int caracterId = scan.nextInt();

        while (caracterId <= 0 || caracterId > 3) {
            System.out.print("Lütfen geçerli bir karakter seçiniz: ");
            caracterId = scan.nextInt();
        }

        return caracterId;

    }

    public int getTotalDamage()
    {
        return this.getDamage()+this.getInventory().getDamege();  //anlamadım
    }

    public void initPlayer(String caracterName,int damage,int healthy,int money)
    {
        setCaracterName(caracterName);       //anlamadım
        setDamage(damage);
        setHealthy(healthy);
        setMoney(money);
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }


    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public String getCaracterName() {
        return CaracterName;
    }

    public void setCaracterName(String caracterName) {
        CaracterName = caracterName;
    }

    public int getRealhealthy() {
        return realhealthy;
    }

    public void setRealhealthy(int realhealthy) {
        this.realhealthy = realhealthy;
    }
}
