// Program to generate id for employees

import java.security.SecureRandom;

public class IDGeneration
{
    String id = "PMS";
    SecureRandom sr = null;
    
    // method
    public String getID()
    {
        sr = new SecureRandom();
        int num = 100 + sr.nextInt(1000);
        
        return id.concat(Integer.toString(num));
    }
    
}