public class CheatCodeChecker
{
    public static String code;
    
    public CheatCodeChecker(String code)
    {
        this.code = code;
    }
    
    public String getCode()
    {
        return this.code;
    }
    
    public static boolean inventoryCheatChecker(String code)
    {
        if(code.equals("Extra Inventory"))
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
    
    public static boolean distanceCheatChecker(String code)
    {
        if(code.equals("Show Distance"))
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
    
    public static boolean thrownWeaponCheatChecker(String code)
    {
        if(code.equals("Thrown Weapon"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public static boolean handWeaponCheatChecker(String code)
    {
        if(code.equals("Hand Weapon"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public static boolean healthCheatChecker(String code)
    {
        if(code.equals("Extra Health"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    
}    
    
