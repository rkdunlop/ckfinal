public class MyProgram extends ConsoleProgram
{
    //initializing variables
    private int steps = 0;
    private int maxStepsPerDay = 0;
    private String response = "";
    private int totalDistance = 0;
    private int max = 0;
    private int min = 0;
    private int low = 0;
    private int high = 0;
    private int weaponNum = 0;
    public int age = 0;
    public String name = "";
    public String code = "";
    public boolean isThrown;
    public int numAliens;
    private double critChance = 0;
    private int alien1Health = 0;
    private int alien2Health = 0;
    private int alien1Damage = 0;
    private int alien2Damage = 0;
    private static int quantity = 0;
    private static int ammo = 0;
    private static int damage = 0;
    private static String weaponName = "";
    
    //run()
    public void run()
    {
        //checks for Cheat Codes
        code = readLine("Any cheat codes? ");
        CheatCodeChecker.distanceCheatChecker(code);
        CheatCodeChecker.inventoryCheatChecker(code);
        CheatCodeChecker.thrownWeaponCheatChecker(code);
        CheatCodeChecker.handWeaponCheatChecker(code);
        CheatCodeChecker.healthCheatChecker(code);
     
        if(CheatCodeChecker.inventoryCheatChecker(code))
        {
            System.out.println("Extra Inventory Cheat: ACTIVE");
        }
    
        else if(CheatCodeChecker.distanceCheatChecker(code))
        {
            System.out.println("Show Distance Cheat: ACTIVE");
        }
     
        else if(CheatCodeChecker.thrownWeaponCheatChecker(code))
        {
            System.out.println("Extreme Thrown Weapon Cheat: ACTIVE");
            System.out.println("Tactical Nuke: ACTIVATED");
        }
       
        else if(CheatCodeChecker.handWeaponCheatChecker(code))
        {
            System.out.println("Extreme Hand Weapon Cheat: ACTIVE");
            System.out.println("Railgun: ACTIVATED");
        }
        
        else if(CheatCodeChecker.healthCheatChecker(code))
        {
            System.out.println("Extra Health Cheat: ACTIVE");
        }
        
        else
        {
            System.out.println("No Cheat Codes Activated. Game will progress normally.");
        }
        
        //starts game and asks for player name
        name = readLine("Hello voyager! What is your name? ");
        System.out.println("Hello " + name);
        
        //asks for player age
        age = readInt("How old are you? ");
        
        //creates the player object
        Person player = new Person(name, age, 100);
        
        //checks for cheat codes
        if(isChild()==true)
        {
            if(CheatCodeChecker.inventoryCheatChecker(code))
            {
                Inventory childInventory = new Inventory(1000,1000);
            }
            
            else
            {
                Inventory childInventory = new Inventory(400,200);
            }
            System.out.println("Ok.");
        }
        else
        {
            if(CheatCodeChecker.inventoryCheatChecker(code))
            {
                Inventory adultInventory = new Inventory(1000,1000);
            }
            
            else
            {
                Inventory adultInventory = new Inventory(200,100);
            }
            System.out.println("Ok.");
        }
        
        //starts the plot of the game
        System.out.println("I don't know how best to say this, but you have been in a coma for 142 years.");
        System.out.println("You probably have amnesia from the crash landing.");
        
        //determines which mode of the game to play
        if(isChild()==true)
        {
            maxStepsPerDay = 50;
            childGame();
        }
       
        else
        {
            maxStepsPerDay = 100;
            adultGame();
        }
    }
    
    public boolean isChild()
    {
        //tests to see if player is a child
        if(Person.age<0)
        {
            System.out.println("Please input a valid age.");
            run();
        }
       
        if(Person.age<=20 && Person.age>0)
        {
            return true;
        }
        
        else
        {
            return false;
        }
        
    }
    
    public void childGame()
    {
        //intro to planet
        System.out.println("You are on the planet Aquarius.");
        System.out.println("Aquarius is part of a Binary Star System.");
        System.out.println("That means there are two stars that it orbits!");
        System.out.println("One side of Aquarius is a pertpetual desert.");
        System.out.println("The other side is a frozen wasteland.");
        System.out.println("You are currently in one of two parts of your crashed spaceship. This part is on the desert side.");
        System.out.println("The other side of the ship has one functioning escape pod. Maybe you could use that to get off this planet!");
        System.out.println("Let's head for the other half of the ship!");
        String response = readLine("Are you ready for the journey? ");
        
        //sets Aliens
        numAliens = 1;
        
        //checks response
        if(response.equals("yes") || response.equals("Yes"))
        {
            System.out.println("Excellent! Lets get started!");
            travelDesert();
        }
        
        else
        {
            System.out.println("Ok...goodbye...");
            death();
        }
    }
    
    public void adultGame()
    {
        //intro to planet
        System.out.println("You are on the planet Aquarius.");
        System.out.println("Aquarius is part of a Binary Star System.");
        System.out.println("That means there are two stars that it orbits!");
        System.out.println("One side of Aquarius is a pertpetual desert.");
        System.out.println("The other side is a frozen wasteland.");
        System.out.println("You are currently in one of two parts of your crashed spaceship. This part is on the desert side.");
        System.out.println("The other side of the ship has one functioning escape pod. Maybe you could use that to get off this planet!");
        System.out.println("Let's head for the other half of the ship!");
        String response = readLine("Are you ready for the journey?");
        
        //Sets Aliens
        numAliens = 1;
        
        //checks response
        if(response.equals("yes") || response.equals("Yes"))
        {
            System.out.println("Excellent! Lets get started! ");
            travelDesert();
        }
        
        else
        {
            System.out.println("Ok...goodbye...");
            death();
        }
    }
    
    public void endGame()
    {
       //finds weapon
        //finds dead bodies
        //Spawns numAliens number of aliens to fight
        //realizes that the aliens are trying to escape the planet
        //player can either sacrifice themselves or the player is KO'd and wake up right as the pod filled with aliens lands on earth (endGame)
    } 
    
    
    public void searchTheShip()
    {
        //Advances the plot
        System.out.println("Hey that looks like the other part of the ship over there!");
        System.out.println("We made it!");
        System.out.println("But what's all this slime all over the floor?");
        System.out.println("Keep your eyes open...anything could have happened here...");
        
        //Checks User response 
        response = readLine("The hallway of the ship forks in two directions. Which way do you want to go? Right or Left? ");
        rightOrLeft();
    }
    
    
    
    public void shipRight()
    {
        //has option to search the medical compartment or the crew compartment
        System.out.println("Looks like there might be electricity in this part of the ship!");
        System.out.println("There we go! The lights are working now!");
        System.out.println("Oh my god...theres blood all over the walls...something very bad happened here.");
        System.out.println("There are two compartments in this half of the ship.");
        response = readLine("Do you want to search the Medical compartment or the Crew compartment? ");
        
        if(response.equals("Medical") || response.equals("Medical Compartment") || response.equals("medical"))
        {
            medical();
        }
        
        if(response.equals("Crew") || response.equals("Crew Compartment") || response.equals("crew"))
        {
            crew();
        }
        
        else
        {
            System.out.println("Well I didn't quite catch that so lets just got the medical compartment.");
            medical();
        }
    }
    
    public void medical()
    {
        System.out.println("Ok. I found something for you!");
        System.out.println("Looks like its a weapon!");
        weaponNum = Randomizer.nextInt(1,3);
        System.out.println("I found " + Weapon.name + " .");
        System.out.println("It does: " + Weapon.damage + " .");
        
        if(isThrown)
        {
            System.out.println("You have " + Weapon.quantity + " of them.");
        }
        
        else
        {
            System.out.println("You have " + Weapon.ammo + " ammunition for it.");
        }
        
        System.out.println("Lets go search the other compartment!");
        System.out.println("Wait what was that noise!");
        System.out.println("What IS that?!");
        numAliens *= 2;
        combat();
    }
    
    public void crew()
    {
        System.out.println("Ok. I found something for you!");
        System.out.println("Looks like its a weapon!");
        weaponNum = Randomizer.nextInt(2,5);
        System.out.println("I found " + Weapon.name + " .");
        System.out.println("It does: " + Weapon.damage + " .");
        
        if(isThrown)
        {
            System.out.println("You have " + Weapon.quantity + " uses for them.");
        }
        
        else
        {
            System.out.println("You have " + Weapon.ammo + " ammunition for it.");
        }
        
        System.out.println("Lets go search the other compartment!");
        System.out.println("Wait what was that noise!");
        System.out.println("What IS that?!");
        combat();
    }
    
    public void armory()
    {
        System.out.println("Ok. I found something for you!");
        System.out.println("Looks like its a weapon!");
        weaponNum = Randomizer.nextInt(1,5);
        System.out.println("I found " + Weapon.name + " .");
        System.out.println("It does: " + Weapon.damage + " .");
        
        if(isThrown)
        {
            System.out.println("You have " + Weapon.quantity + " of them.");
        }
        
        else
        {
            System.out.println("You have " + Weapon.ammo + " ammunition for it.");
        }
        
        System.out.println("Lets go search the other compartment!");
        System.out.println("Wait what was that noise!");
        System.out.println("What IS that?!");
        numAliens *= 2;
        combat();
    }
    
    public void security()
    {
        System.out.println("Ok. I found something for you!");
        System.out.println("Looks like its a weapon!");
        weaponNum = Randomizer.nextInt(1,4);
        System.out.println("I found " + Weapon.name + " .");
        System.out.println("It does: " + Weapon.damage + " .");
        
        if(isThrown)
        {
            System.out.println("You have " + Weapon.quantity + " of them.");
        }
        
        else
        {
            System.out.println("You have " + Weapon.ammo + " ammunition for it.");
        }
        
        System.out.println("Lets go search the other compartment!");
        System.out.println("Wait what was that noise!");
        System.out.println("What IS that?!");
        combat();
    }
    
    public void shipLeft()
    {
        System.out.println("Looks like there might be electricity in this part of the ship!");
        System.out.println("There we go! The lights are working now!");
        System.out.println("Oh my god...theres blood all over the walls...something very bad happened here.");
        System.out.println("There are two compartments in this half of the ship.");
        response = readLine("Do you want to search the Medical compartment or the Crew compartment? ");
        
        if(response.equals("Armory") || response.equals("Armory Compartment") || response.equals("armory"))
        {
            armory();
        }
        
        if(response.equals("Security") || response.equals("Security Compartment") || response.equals("security"))
        {
            security();
        }
        
        else
        {
            System.out.println("Well I didn't quite catch that so lets just go to the armory.");
            armory();
        }
    }
    
    public void combat()
    {
        if(numAliens == 2)
        {
            
            Alien alien1 = new Alien(45,5);
            Alien alien2 = new Alien(50,10);
            alien1Health = alien1.getHealthAlien();
            alien2Health = alien2.getHealthAlien();
            alien1Damage = alien1.getDamageDealt();
            alien2Damage = alien2.getDamageDealt();
        }
        
        else
        {
            Alien alien1 = new Alien(50,10);
            alien1Health = alien1.getHealthAlien();
            alien1Damage = alien1.getDamageDealt();
        }
        
        if(isThrown && weaponNum == 4)
        {
            critChance = Randomizer.nextInt(1,99);
            
            if(critChance == 16 || critChance == 80 || critChance == 8 || critChance == 32 || critChance == 40 || critChance == 93 || critChance == 92)
            {
                ThrownWeapon rockCrit = new ThrownWeapon(1000,1,"Critical Hit Rock");
                damage = ThrownWeapon.getDamage();
                quantity = ThrownWeapon.getQuantity();
                weaponName = ThrownWeapon.getName();
            }
            
            else
            {
            }
        }
        
        else
        {
        }
        
        if(numAliens == 2)
        {
            System.out.println("Lets fight the Aliens!");
            System.out.println("The first Alien does: " + alien1Damage + " damage per hit.");
            System.out.println("The other Alien does: " + alien2Damage + " damage per hit.");
            
            for(int i = 100; i>0; i--)
            {
                alien1Health -= damage;
                System.out.println("You hit the Aliens for: " + damage + " points of damage!");
                if(isThrown)
                {
                    System.out.println("You have: " + quantity + " " + weaponName + " left.");
                    
                    if(quantity == 0)
                    {
                        System.out.println("You ran out of " + weaponName + " ! The Aliens devoured you!");
                        death();
                        break;
                    }
                    
                    else
                    {
                        Person.playerHealth -= alien1Damage;
                        Person.playerHealth -= alien2Damage;
                        System.out.println("The Aliens hit you for 20 points of damage!");
                        System.out.println("Your health is now: " + Person.playerHealth + ".");
                    }
                }
                
                else
                {
                    System.out.println("You have: " + ammo + " " + name + " ammunition left.");
                    Person.playerHealth -= alien1Damage;
                    Person.playerHealth -= alien2Damage;
                    System.out.println("The Aliens hit you for 20 points of damage!");
                    System.out.println("Your health is now: " + Person.playerHealth + ".");
                }
                
                //Checks for success or death
                if(alien1Health <= 0)
                {
                    System.out.println("You killed one of the aliens!");
                }
                
                if(alien2Health <= 0)
                {
                    System.out.println("You killed both of the aliens!");
                    endGame();
                    break;
                }
                
                if(Person.playerHealth<=0)
                {
                    death();
                    break;
                }
                
                else
                {
                }
            }
        }
        
        else
        {
            System.out.println("Lets fight the Alien!");
            System.out.println("The Alien does: " + alien1Damage + " damage per hit.");
            for(int i = 100; i>0; i--)
            {
                alien1Health -= damage;
                System.out.println("You hit the Aliens for: " + damage + " points of damage!");
                if(isThrown)
                {
                    System.out.println("You have: " + quantity + " " + weaponName + " left.");
                    if(quantity == 0)
                    {
                        death();
                        break;
                    }
                    
                    else
                    {
                        Person.playerHealth -= alien1Damage;
                        System.out.println("The Alien hit you for 10 points of damage!");
                        System.out.println("Your health is now: " + Person.playerHealth + ".");
                    }
                }
                
                else
                {
                    System.out.println("You have: " + ammo + " " + weaponName + " ammunition left.");
                    Person.playerHealth -= alien1Damage;
                    System.out.println("The Alien hit you for 10 points of damage!");
                    System.out.println("Your health is now: " + Person.playerHealth + ".");
                }
                
                //Checks for success or death
                if(alien1Health <= 0)
                {
                    System.out.println("You killed the Alien!");
                    endGame();
                    break;
                }
                
                if(Person.playerHealth<=0)
                {
                    death();
                    break;
                }
                
                else
                {
                }
            }
        }
    }
    
    public void rightOrLeft()
    {
        if(response.equals("right") || response.equals("Right"))
        {
            System.out.println("Ok.");
            shipRight();
        }
        
        if(response.equals("left") || response.equals("Left"))
        {
            System.out.println("Ok.");
            shipRight();
        }
        
        else
        {
            System.out.println("Just choose a direction. Right or Left?");
            rightOrLeft();
        }
    }
    
    public void randomWeapon()
    {
        //Randomizes the boolean to randomly get weapon while searching
        isThrown = Randomizer.nextBoolean();
        
        if(isThrown && weaponNum == 1)
        {
            ThrownWeapon axes = new ThrownWeapon(3,Randomizer.nextInt(2,4),"Axes");
            damage = ThrownWeapon.getDamage();
            quantity = ThrownWeapon.getQuantity();
            weaponName = ThrownWeapon.getName();
        }
        
        if(isThrown && weaponNum == 2)
        {
            ThrownWeapon throwingStars = new ThrownWeapon(2,Randomizer.nextInt(1,3),"Throwing Stars");
            damage = ThrownWeapon.getDamage();
            quantity = ThrownWeapon.getQuantity();
            weaponName = ThrownWeapon.getName();
        }
        
        if(isThrown && weaponNum == 3)
        {
            ThrownWeapon grenade = new ThrownWeapon(5,Randomizer.nextInt(1,2),"Grenades");
            damage = ThrownWeapon.getDamage();
            quantity = ThrownWeapon.getQuantity();
            weaponName = ThrownWeapon.getName();
        }
        
        if(isThrown && weaponNum == 4)
        {
            //1 in 100 chance to insta kill
            ThrownWeapon rock = new ThrownWeapon(1,1,"Rock");
            damage = ThrownWeapon.getDamage();
            quantity = ThrownWeapon.getQuantity();
            weaponName = ThrownWeapon.getName();
        }
        
        if(isThrown && weaponNum == 5)
        {
            ThrownWeapon throwingKnife = new ThrownWeapon(4,3,"Throwing Knife");
            damage = ThrownWeapon.getDamage();
            quantity = ThrownWeapon.getQuantity();
            weaponName = ThrownWeapon.getName();
        }
        
        if(!isThrown && weaponNum == 1)
        {
            HandWeapon rifle = new HandWeapon(8,5,"Rifle");
            damage = ThrownWeapon.getDamage();
            ammo = ThrownWeapon.getAmmo();
            weaponName = ThrownWeapon.getName();
        }
        
        if(!isThrown && weaponNum == 2)
        {
            HandWeapon shotgun = new HandWeapon(10,3,"Shotgun");
            damage = ThrownWeapon.getDamage();
            ammo = ThrownWeapon.getAmmo();
            weaponName = ThrownWeapon.getName();
        }
       
        if(!isThrown && weaponNum == 3)
        {
            HandWeapon club = new HandWeapon(5,10,"Club");
            damage = ThrownWeapon.getDamage();
            ammo = ThrownWeapon.getAmmo();
            weaponName = ThrownWeapon.getName();
        }
       
        if(!isThrown && weaponNum == 4)
        {
            HandWeapon plasmaSword = new HandWeapon(10,10,"Plasma Sword");
            damage = ThrownWeapon.getDamage();
            ammo = ThrownWeapon.getAmmo();
            weaponName = ThrownWeapon.getName();
        }
      
        if(!isThrown && weaponNum == 5)
        {
            HandWeapon smg = new HandWeapon(3,20,"SMG");
            damage = ThrownWeapon.getDamage();
            ammo = ThrownWeapon.getAmmo();
            weaponName = ThrownWeapon.getName();
        }
      
        if(CheatCodeChecker.handWeaponCheatChecker(code))
        {
            HandWeapon railgun = new HandWeapon(15,100,"Railgun");
            damage = ThrownWeapon.getDamage();
            ammo = ThrownWeapon.getAmmo();
            weaponName = ThrownWeapon.getName();
        }
       
        if(CheatCodeChecker.thrownWeaponCheatChecker(code))
        {
            ThrownWeapon tacticalNuke = new ThrownWeapon(10000,100,"Tactical Nuke");
            damage = ThrownWeapon.getDamage();
            quantity = ThrownWeapon.getQuantity();
            weaponName = ThrownWeapon.getName();
        }
       
        else
        {
            HandWeapon fists = new HandWeapon(1,100,"Fists");
            damage = ThrownWeapon.getDamage();
            ammo = ThrownWeapon.getAmmo();
            weaponName = ThrownWeapon.getName();
        }
    }
    
    public void travelDesert()
    {
        //sets Total Distance of the Desert
        min = 35;
        max = 100;
        totalDistance = Randomizer.nextInt(min, max);
        
        //starts walking
        walking();
    }
    
    public void walking()
    {
        //Chooses a random number of miles the player is allowed to walk
        if(isChild()==true)
        {
            low = 5;
            high = 20;
        }
        //ConnorKaminskaFinalProject
        else
        {
            low = 10;
            high = 40;
        }
        
        //For loop for traveling distance
        for(int i = Inventory.water/2;i>0;i-=2)
        {
            maxStepsPerDay = Randomizer.nextInt(low, high);
        
            //Warning
            System.out.println("Make sure you dont run out of food or water!");
            System.out.println("You currently have: " + Inventory.water + " water & " + Inventory.food + " food.");
            
            //Cheat code thing
            if(CheatCodeChecker.distanceCheatChecker(code))
            {
                System.out.println(totalDistance + " miles to go!");
            }
            
            
            //The walking process
            System.out.println("You can walk: " + maxStepsPerDay + " miles today.");
            steps = readInt("How many miles do you want to walk today? ");
            if(steps>maxStepsPerDay)
            {
                System.out.println("You can't walk that far today!");
                System.out.println("You died of exhaustion!");
                death();
                break;
            }
            
            //Checking for running out of supplies
            if((Inventory.water-(2*steps))<0 || (Inventory.food-steps)<0)
            {
                death();
                break;
            }
            
            //Taking away supplies
            if((Inventory.water-(2*steps))>=0 || (Inventory.food-steps)>=0)
            {
                Inventory.food -= steps;
                Inventory.water -= (2*steps);
                totalDistance -= steps; 
                if(totalDistance == 16)
                {
                    hiddenOasis();
                    break;
                }
                else if(totalDistance <= 0)
                {
                    searchTheShip();
                    break;
                }
                else
                {
                    System.out.println("Not there yet!");
                }
            }
        }
    }
    
    public void hiddenOasis()
    {
        //Plot development
        System.out.println("The ground is collapsing!");
        System.out.println("It looks like you fell into some kind of oasis!");
        
        //Gets user response for waterOrFood method
        response=readLine("Want to search for water or food first? ");
        waterOrFood();
        
        //Gets user response for treeOrVine method
        System.out.println("You should try to get out of here now.");
        response=readLine("Do you want to try and climb the vines or the tree? ");
        treeOrVine();
    }
    
    public void treeOrVine()
    {
        //Checks response
        if(response.equals("tree"))
        {
            System.out.println("You escaped the oasis!");
            searchTheShip();        
        }
        else if(response.equals("vines"))
        {
            System.out.println("The vine snaps as you are halfway up...");
            death();
        }
        else
        {
            System.out.println("Give me a straight answer. Tree or Vines?");
            treeOrVine();;
        }
    }
    
    public void waterOrFood()
    {
       //Checks responses    
       if(response.equals("water"))
        {
            Inventory.water = 400;
            System.out.println("You found: " + Inventory.water + " water!");
            System.out.println("Lets seach for food now!");
            Inventory.food = 200;
            System.out.println("You found: " + Inventory.food + " food!");
        }
        else if(response.equals("food"))
        {
            Inventory.food = 200;
            System.out.println("You found: " + Inventory.food + " food!");
            System.out.println("Lets search for water now!");
            Inventory.water = 400;
            System.out.println("You found: " + Inventory.water + " water!");
        }
        else
        {
            System.out.println("C'mon which one? Water or Food?");
            waterOrFood();
        }
    }
    
    public void death()
    {
        //Happens when the player runs out of food, water, or other reason
        System.out.println("YOU HAVE DIED!");
        System.out.println("Please start the game over.");
        run();
    }
}
