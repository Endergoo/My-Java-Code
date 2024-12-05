
public class Truck extends Vehicle 
{
    // Attributes specific to Truck
    private double loadCapacity;
    private double towingCapacity;

    // Default constructor
    public Truck() 
    {
        super();  // Calls Vehicle's default constructor
        this.loadCapacity = 0.0;
        this.towingCapacity = 0.0;
    }

    // Parameterized constructor
    public Truck(String manufacturerName, int numberOfCylinders, String ownerName, double loadCapacity, double towingCapacity) 
    {
        super(manufacturerName, numberOfCylinders, ownerName);  
        setLoadCapacity(loadCapacity);
        setTowingCapacity(towingCapacity);
    }

    // Accessors
    public double getLoadCapacity() 
    {
        return loadCapacity;
    }

    public double getTowingCapacity() 
    {
        return towingCapacity;
    }

    // Mutators with validation
    public void setLoadCapacity(double loadCapacity) 
    {
        if (loadCapacity >= 0) 
        {
            this.loadCapacity = loadCapacity;
        } 
        else 
        {
            throw new IllegalArgumentException("Load capacity must be non-negative.");
        }
    }

    public void setTowingCapacity(double towingCapacity) 
    {
        if (towingCapacity >= 0) 
        {
            this.towingCapacity = towingCapacity;
        } 
        else 
        {
            throw new IllegalArgumentException("Towing capacity must be non-negative.");
        }
    }

    // equals method
    public boolean equals(Object obj) 
    {
        if (obj instanceof Truck && super.equals(obj)) 
        {
            Truck other = (Truck) obj;
            return this.loadCapacity == other.loadCapacity &&
                   this.towingCapacity == other.towingCapacity;
        }
        return false;
    }

    // toString method
    @Override
    public String toString() 
    {
        return super.toString() + "\n" +
               "Load Capacity: " + loadCapacity + "\n" +
               "Towing Capacity: " + towingCapacity;
    }
}
