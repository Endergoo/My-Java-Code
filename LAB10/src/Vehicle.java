public class Vehicle 
{
	//Harrison Boone
	
	
    // Attributes
    private String manufacturerName;
    private int numberOfCylinders;
    private String ownerName;

    // Default constructor
    public Vehicle() 
    {
        this.manufacturerName = "Unknown";
        this.numberOfCylinders = 1;
        this.ownerName = "Unknown";
    }

    // Parameterized constructor
    public Vehicle(String manufacturerName, int numberOfCylinders, String ownerName) 
    {
        setManufacturerName(manufacturerName);
        setNumberOfCylinders(numberOfCylinders);
        setOwnerName(ownerName);
    }

    // Accessors
    public String getManufacturerName() 
    {
        return manufacturerName;
    }

    public int getNumberOfCylinders() 
    {
        return numberOfCylinders;
    }

    public String getOwnerName() 
    {
        return ownerName;
    }

    // Mutators with validation
    public void setManufacturerName(String manufacturerName) 
    {
        this.manufacturerName = manufacturerName;
    }

    public void setNumberOfCylinders(int numberOfCylinders) 
    {
        if (numberOfCylinders > 0) 
        {
            this.numberOfCylinders = numberOfCylinders;
        } 
        else 
        {
            throw new IllegalArgumentException("Number of cylinders must be greater than 0.");
        }
    }

    public void setOwnerName(String ownerName) 
    {
        this.ownerName = ownerName;
    }

    // equals method
    public boolean equals(Object obj) 
    {
        if (obj instanceof Vehicle) 
        {
            Vehicle other = (Vehicle) obj;
            return this.manufacturerName.equals(other.manufacturerName) &&
                   this.numberOfCylinders == other.numberOfCylinders &&
                   this.ownerName.equals(other.ownerName);
        }
        return false;
    }

    // toString method
    public String toString() 
    {
        return "Manufacturer's Name: " + manufacturerName + "\n" +
               "Number Of Cylinders: " + numberOfCylinders + "\n" +
               "Owner's Name: " + ownerName;
    }
}
