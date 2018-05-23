public class Alien
{
    //Initializing variables
    public static int healthAlien = 0;
    public static int damageDealt = 0;
    
    public Alien(int healthAlien, int damageDealt)
    {
        this.healthAlien = healthAlien;
        this.damageDealt = damageDealt;
    }
    
    public int getHealthAlien()
    {
        return this.healthAlien;
    }
    
    public int getDamageDealt()
    {
        return this.damageDealt;
    }
}
  