import java.util.Scanner;

public class toolStore extends normalLocation{

    Game game=new Game();
    toolStore(Player player)
    {
        super(player, "Mağaza");
    }

    public boolean getLocation() {
        System.out.println("Para: "+player.getMoney());
        System.out.println("1- Silahlar ");
        System.out.println("2- Zırhlar ");
        System.out.println("3- Çıkış ");

        System.out.println("Bir seçim yapınız: ");
        int sellection=scanner.nextInt();
        int sellectItemID;
            switch (sellection)
            {
                case 1:
                    sellectItemID= weaponMenu();
                    buyWeapon(sellectItemID);
                    break;

                case 2:
                    sellectItemID= armorMenu();
                    buyArmor(sellectItemID);
                    break;

                case 3:
                    System.out.println("Çıkış yapılıyor ...");
                    game.gamestart();
                    break;

            }


        return true;
    }




    public int weaponMenu()
    {
        System.out.println("1- Tabanca \t Hasar: 2 \t Ücret: 25");
        System.out.println("2- Kılıç \t Hasar: 3 \t Ücret: 35");
        System.out.println("3- Tüfek \t Hasar: 7 \t Ücret: 45");
        System.out.println("4-Çıkış ");
        System.out.println("Silah seçiniz: ");
        int selectWeapon=scanner.nextInt();
        return selectWeapon;
    }

    public void buyWeapon(int itemID)
    {
        int damege=0,price=0;
        String weaponName = null;
        switch (itemID)
        {
            case 1:
                weaponName="Tabanca";
                damege=2;
                price=25;
                break;
            case  2:
                weaponName="Kılıç";
                damege=3;
                price=35;
                break;
            case 3:
                weaponName="Tüfek";
                damege=7;
                price=45;
                break;
            case 4:
                System.out.println("Çıkış yapılıyor...");
                getLocation();
                break;
            default:
                System.out.println("Geçersiz işlem !");
                getLocation();
                break;
        }
       if(price>0)
       {
           if(player.getMoney()>=price )
           {
               player.getInventory().setDamege(damege);
               player.getInventory().setWeaponName(weaponName);
               player.setMoney(player.getMoney()-price);
               System.out.println(weaponName+" alındı !!! Önceki hasar:"+player.getDamage()+",Yeni hasar: "+(player.getDamage()+player.getInventory().getDamege()));
               System.out.println("Kalan para: "+player.getMoney());
           }
           else
           {
               System.out.println("Yetersiz para !!!");
           }
       }

    }

    public int armorMenu()
    {
        System.out.println("1- Hafif Zırh \t Hasar engelleme: 1 \t Ücret: 15");
        System.out.println("2- Orta Zırh \t Hasar engelleme: 3 \t Ücret: 25");
        System.out.println("3- Ağır Zırh \t Hasar engelleme: 5 \t Ücret: 40");
        System.out.println("4-Çıkış ");
        System.out.println("Zırh seçiniz: ");
        int selectArmor=scanner.nextInt();
        return selectArmor;
    }

    public void buyArmor(int itemID)
    {
        int armor=0,price=0;
        String armorName=null;
        switch (itemID)
        {
            case 1:
                armorName="Hafif Zırh";
                armor=1;
                price=15;
                break;
            case 2:
                armorName="Orta Zırh";
                armor=3;
                price=25;
                break;
            case 3:
                armorName="Ağır Zırh";
                armor=5;
                price=40;
                break;
            case 4:
                getLocation();
                break;

            default:
                System.out.println("Geçersiz işlem !!!");
                break;
        }
        if (price>0)
        {
            if (player.getMoney()>=price)
            {
                player.getInventory().setArmor(armor);
                player.getInventory().setArmorName(armorName);
                player.setMoney(player.getMoney()-price);
                System.out.println(armorName+" aldınız"+",Engellenen hasar:"+player.getInventory().getArmor());
                System.out.println("Kalan para: "+player.getMoney());
            }
            else
            {
                System.out.println("Yetersiz para !!!");
            }
        }
    }



}
