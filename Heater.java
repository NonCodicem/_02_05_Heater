
/**
 * class Heater - geef hier een beschrijving van deze class
 *
 * @author (jouw naam)
 * @version (versie nummer of datum)
 */
public class Heater
{
    // instance variables - vervang deze door jouw variabelen
    private int temperature;
    private int min;
    private int max;
    private int increment;

    /**
     * Constructor voor objects van class Heater
     */
    public Heater(int min, int max)
    {
        this.min = min;
        this.max = max;
        increment = 5;
        temperature = 15;
    }

    public void increaseTemperature()
    {
        if(temperature + increment > max)
        {
            System.out.println("The temperature exceeds the maximum limit");
        }
        else{
            temperature += increment;
        }
        
    }
    
     public void decreaseTemperature()
    {
        if(temperature - increment < min)
        {
            System.out.println("The temperature exceeds the minimm limit");
        }
        else{
            temperature -= increment;
        }
        
    }
    
    public void setIncrement(int increment)
    {
        this.increment = increment;
    }
    /**
     * Voorbeeld van een method - schrijf hier jouw comment
     *
     * @param  y    deze method krijgt deze parameter mee in de aanroep
     * @return    deze method geeft de som van x en y terug
     */
    public int getTemperature()
    {
        // schrijf hier jouw code
        return temperature;
    }
}
