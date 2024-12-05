
public class Car extends Vehicle 
{
    // Attributes specific to Car
    private double gasMileage;
    private int numberOfPassengers;

    // Default constructor
    public Car() 
    {
        super();  // Calls Vehicle's default constructor
        this.gasMileage = 0.0;
        this.numberOfPassengers = 0;
    }

    // Parameterized constructor
    public Car(String manufacturerName, int numberOfCylinders, String ownerName, double gasMileage, int numberOfPassengers) 
    {
        super(manufacturerName, numberOfCylinders, ownerName);  // Calls Vehicle's parameterized constructor
        setGasMileage(gasMileage);
        setNumberOfPassengers(numberOfPassengers);
    }

    // Accessors
    public double getGasMileage() 
    {
        return gasMileage;
    }

    public int getNumberOfPassengers() 
    {
        return numberOfPassengers;
    }

    // Mutators with validation
    public void setGasMileage(double gasMileage) 
    {
        if (gasMileage >= 0) 
        {
            this.gasMileage = gasMileage;
        } 
        else 
        {
            throw new IllegalArgumentException("Gas mileage must be non-negative.");
        }
    }

    public void setNumberOfPassengers(int numberOfPassengers) 
    {
        if (numberOfPassengers >= 0) {
            this.numberOfPassengers = numberOfPassengers;
        } 
        else 
        {
            throw new IllegalArgumentException("Number of passengers must be non-negative.");
        }
    }

    // equals method
    public boolean equals(Object obj) 
    {
        if (obj instanceof Car && super.equals(obj)) 
        {
            Car other = (Car) obj;
            return this.gasMileage == other.gasMileage &&
                   this.numberOfPassengers == other.numberOfPassengers;
        }
        return false;
    }

    // toString method
    public String toString() 
    {
        return super.toString() + "\n" +
               "Gas Mileage: " + gasMileage + " gallons\n" +
               "Number of Passengers: " + numberOfPassengers;
    }
}
