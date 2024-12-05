public class Concert 
{
	//Harrison Boone
	
    // Attributes
    private String bandName;
    private int capacity;
    private int ticketsSoldByPhone;
    private int ticketsSoldAtVenue;
    private double priceByPhone;
    private double priceAtVenue;

    // Default Constructor
    public Concert() 
    {
        this.bandName = "No name yet";
        this.capacity = 0;
        this.ticketsSoldByPhone = 0;
        this.ticketsSoldAtVenue = 0;
        this.priceByPhone = 0.0;
        this.priceAtVenue = 0.0;
    }

    // Constructor with parameters (bandName, capacity, priceByPhone, priceAtVenue)
    public Concert(String bandName, int capacity, double priceByPhone, double priceAtVenue) 
    {
        this.bandName = bandName;
        this.capacity = capacity;
        this.ticketsSoldByPhone = 0;
        this.ticketsSoldAtVenue = 0;
        this.priceByPhone = priceByPhone;
        this.priceAtVenue = priceAtVenue;
    }

    // Constructor with parameters (bandName, capacity, ticketsSoldByPhone, ticketsSoldAtVenue, priceByPhone, priceAtVenue)
    public Concert(String bandName, int capacity, int ticketsSoldByPhone, int ticketsSoldAtVenue, 
    		double priceByPhone, double priceAtVenue) 
    {
        this.bandName = bandName;
        this.capacity = capacity;
        this.ticketsSoldByPhone = ticketsSoldByPhone;
        this.ticketsSoldAtVenue = ticketsSoldAtVenue;
        this.priceByPhone = priceByPhone;
        this.priceAtVenue = priceAtVenue;
    }

    // Accessors and Mutators for each variable
    public String getBandName() 
    {
        return bandName;
    }

    public void setBandName(String bandName) 
    {
        this.bandName = bandName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) 
    {
        if (capacity >= 0) 
        {
            this.capacity = capacity;
        }
    }

    public int getTicketsSoldByPhone() 
    {
        return ticketsSoldByPhone;
    }

    public void setTicketsSoldByPhone(int ticketsSoldByPhone) 
    {
        if (ticketsSoldByPhone >= 0) 
        {
            this.ticketsSoldByPhone = ticketsSoldByPhone;
        }
    }

    public int getTicketsSoldAtVenue() 
    {
        return ticketsSoldAtVenue;
    }

    public void setTicketsSoldAtVenue(int ticketsSoldAtVenue) 
    {
        if (ticketsSoldAtVenue >= 0) 
        {
            this.ticketsSoldAtVenue = ticketsSoldAtVenue;
        }
    }

    public double getPriceByPhone() 
    {
        return priceByPhone;
    }

    public void setPriceByPhone(double priceByPhone) 
    {
        if (priceByPhone >= 0) 
        {
            this.priceByPhone = priceByPhone;
        }
    }

    public double getPriceAtVenue() 
    {
        return priceAtVenue;
    }

    public void setPriceAtVenue(double priceAtVenue) 
    {
        if (priceAtVenue >= 0) 
        {
            this.priceAtVenue = priceAtVenue;
        }
    }

    // Method to calculate the total number of tickets sold
    public int totalNumberOfTicketsSold() 
    {
        return ticketsSoldByPhone + ticketsSoldAtVenue;
    }

    // Method to calculate the tickets remaining
    public int ticketsRemaining() 
    {
        return capacity - totalNumberOfTicketsSold();
    }

    // Method to buy tickets at the venue
    public void buyTicketsAtVenue(int numberOfTickets) 
    {
        if (ticketsRemaining() >= numberOfTickets && numberOfTickets > 0) 
        {
            ticketsSoldAtVenue += numberOfTickets;
        }
    }

    // Method to buy tickets by phone
    public void buyTicketsByPhone(int numberOfTickets) 
    {
        if (ticketsRemaining() >= numberOfTickets && numberOfTickets > 0) 
        {
            ticketsSoldByPhone += numberOfTickets;
        }
    }

    // Method to calculate total sales
    public double totalSales() 
    {
        return (ticketsSoldAtVenue * priceAtVenue) + (ticketsSoldByPhone * priceByPhone);
    }
}
                                                                              






