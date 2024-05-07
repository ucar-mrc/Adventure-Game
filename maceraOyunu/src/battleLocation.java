public abstract class battleLocation extends Location{
   protected Monster monster;
   protected String award;

    battleLocation(Player player , String name , Monster monster,String award) {
        super(player);
        this.name=name;
        this.monster=monster;
        this.award=award;
    }

    public boolean getLocation()
    {
        int monsterNumber= monster.monsterNumber();
        System.out.println("Şu anda burdasınız:"+this.getName());
        System.out.println("Dikkatli ol burada "+monsterNumber+" tane "+monster.getName()+" yaşıyor");
        System.out.println("s- Savaş");
        System.out.println("k- Kaç");
        String sellect=scanner.nextLine();
        if(sellect.equals("s"))
        {

            if(combat(monsterNumber))
            {
                System.out.println(this.getName()+" bölgesindeki tüm düşmanları temizlediniz !");
                if(this.award.equals("Food")  && player.getInventory().isFood() == false)
                {
                    System.out.println(this.award + " kazandınız! ");
                    player.getInventory().setFood(true);
                }
                else if (this.award.equals("Water") && player.getInventory().isWater() == false )
                {
                    System.out.println(this.award + " kazandınız! ");
                    player.getInventory().setWater(true);
                }
                else if (this.award.equals("Firewood") && player.getInventory().isFirewood() == false)
                {
                    System.out.println(this.award + " kazandınız! ");
                    player.getInventory().setFirewood(true);
                }
                return true;

            }
            if(player.getHealthy()<=0)
            {
                System.out.println("Öldün !!!");
                return false;
            }
        }

        return true;
    }

    public boolean combat(int monsterNumaber)
    {
        for(int i=0; i<monsterNumaber ; i++ )
        {
            int defmonsterHealth = monster.getHealth();
            playerStats();
            monsterStats();
            while (player.getHealthy() > 0 && monster.getHealth() > 0 )
            {
                System.out.println("v- vur");
                System.out.println("k- kaç");


                String sellect=scanner.nextLine();
                if(sellect.equals("v"))
                {
                    System.out.println("Canavarı yaraladın!!!");
                    monster.setHealth(monster.getHealth()-player.getTotalDamage());
                    afterHit();
                    System.out.println();
                    if(monster.getHealth() > 0)
                    {
                        System.out.println("Canavar size vurdu!!!");
                        player.setHealthy(player.getHealthy() - (monster.getDamage()-player.getInventory().getArmor()));
                        afterHit();
                    }
                }
                else
                {
                    return  false;
                }
            }
            if(monster.getHealth()<=0 && player.getHealthy() > 0)
            {
                System.out.println("Düşmanı yendiniz !!!");
                player.setMoney(player.getMoney()+monster.getAward());
                System.out.println("Güncel paranız: " + player.getMoney());
                monster.setHealth(defmonsterHealth);

            }
            else
            {
                return false;
            }

        }
        return true;
    }

    public void playerStats()
    {
        System.out.println("Oyuncu Bilgileri \n******************");
        System.out.println("Can: "+player.getHealthy());
        System.out.println("Hasar: "+player.getDamage());
        System.out.println("Para: "+player.getMoney());
        if(player.getInventory().getDamege()>0)
        {
            System.out.println("Silah: "+player.getInventory().getWeaponName());
        }
        if(player.getInventory().getArmor()>0)
        {
            System.out.println("Zırh: "+player.getInventory().getArmorName());
        }




    }
    public void monsterStats()
    {
        System.out.println("\n"+monster.getName()+" bilgileri: \n******************");
        System.out.println("Can: "+monster.getHealth());
        System.out.println("Hasar: "+monster.getDamage());
        System.out.println("Ödül: "+monster.getAward());

    }

    public void afterHit()
    {
        System.out.println("Oyuncu canı: "+player.getHealthy());
        System.out.println(monster.getName()+"canı: "+monster.getHealth());
    }


}

