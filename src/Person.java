public class Person 
{
   public static int age;
   public String name;
   public static int playerHealth;
   
   public Person(String name, int age, int playerHealth)
   {
       this.name = name;
       this.age = age;
       this.playerHealth = playerHealth;
   }
   
   public String getName()
   {
       return this.name;
   }
   
   public int getAge()
   {
       return this.age;
   }
   
   public int getHealth()
   {
       return this.playerHealth;
   }
}
