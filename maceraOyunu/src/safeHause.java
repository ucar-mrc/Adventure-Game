public class safeHause extends normalLocation{
    safeHause(Player player )
    {
        super(player,"Güvenli ev");
    }


    public boolean getLocation()            //override etti normalLocation'daki metodu
    {
        player.setHealthy(player.getRealhealthy());
        System.out.println("Canınız yenilendi...");
        System.out.println("Güvenli evdesiniz !!!");
        return true;
    }
}
