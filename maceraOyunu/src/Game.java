import java.util.Scanner;

public class Game {
    Player player;
    Location location;
    Scanner scan = new Scanner(System.in);
    public void login()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Macera oyununa hoş geldiniz");
        System.out.print("oyuna başlamadan önce isminizi giriniz:");
        String playername=scan.nextLine();
        System.out.println("Hoşgeldin " + playername);

        this.player =  new Player(playername);
        player.selectCaracter();
        gamestart();
    }
    public void gamestart()
    {
       while (true)
       {
           System.out.println();
           System.out.println("******************************************************");
           System.out.println();

           System.out.println("Eylem gerçekleştirmek için bir yer seçiniz:");
           System.out.println("1- Güvenli ev -->  Size ait güvenli bir sığınak düşman yok !!!");
           System.out.println("2- Mağara --> Dikkatli ol burada zombilerle karşılaşabilirsin !!!");   //Gidilebilecek bölgelerin seçim menüsü
           System.out.println("3- Orman --> Dikkatli ol burada vampirlerle karşılaşabilirsin !!!");
           System.out.println("4- Nehir --> Dikkatli ol burada ayılarla karşılaşabilirsin !!!");
           System.out.println("5- Market --> Burada ihtiyacın olan ekipmanları alabilirisin .");
           System.out.println();
           int selectlocation=scan.nextInt();
           while (selectlocation <= 0 || selectlocation > 5)
           {
               System.out.println("Geçerli bir yer seçiniz :");
               selectlocation=scan.nextInt();
           }


           switch (selectlocation)
           {
               case 1:
                   location=new safeHause(player);
                   break;
               case  2:
                   location=new Cave(player);
                   break;
               case 3:
                   location=new Forest(player);
                   break;
               case 4:
                   location=new River(player);
                   break;
               case 5:
                   location=new toolStore(player);
                   break;
               default:
                   location=new safeHause(player);

           }


           if(location.getClass().getName().equals("safeHause"))
           {
               if(player.getInventory().isFood() && player.getInventory().isWater() && player.getInventory().isFirewood())
               {
                   System.out.println("Tebrikler oyunu kazandınız !!!");
                   break;
               }

           }
           if(!location.getLocation())
           {
               System.out.println("Oyun bitti !!!");
               break;
           }


       }


    }


}
