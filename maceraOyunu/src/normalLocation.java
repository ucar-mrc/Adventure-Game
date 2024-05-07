public abstract class normalLocation extends Location {
    normalLocation(Player player,String name)
    {
        super(player);
        this.name=name;
    }

    public boolean getLocation()
    {
        return true;
    }
}
