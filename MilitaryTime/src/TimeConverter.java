
public class TimeConverter 
{
    // Instance variables
    private int hours;
    private int minutes;
    private int seconds;
    private boolean notPM;

    // Default constructor
    public TimeConverter() 
    {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
        this.notPM = true;
    }

    // Parameterized constructor
    public TimeConverter(int hours, int minutes, int seconds) throws TimeException 
    {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
        convertTo12HourFormat();
    }

    // Accessors 
    public int getHours() 
    { 
    	return hours; 
    }
    public int getMinutes() 
    { 
    	return minutes; 
    }
    public int getSeconds() 
    { 
    	return seconds; 
    }
    public boolean isNotPM() 
    { 
    	return notPM; 
    }

    // Mutators 
    public void setHours(int hours) throws TimeException 
    {
        if (hours < 0 || hours > 23) throw new TimeException();
        this.hours = hours;
    }

    public void setMinutes(int minutes) throws TimeException 
    {
        if (minutes < 0 || minutes > 59) throw new TimeException();
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) throws TimeException 
    {
        if (seconds < 0 || seconds > 59) throw new TimeException();
        this.seconds = seconds;
    }

    // Converts 24-hour time to 12-hour time
    private void convertTo12HourFormat() 
    {
        if (hours == 0) 
        {
            hours = 12;
            notPM = true;
        } 
        else if (hours == 12) 
        {
            notPM = false;
        } 
        else if (hours > 12) 
        {
            hours -= 12;
            notPM = false;
        } 
        else 
        {
            notPM = true;
        }
    }

    public void updateTime(int hours, int minutes, int seconds) throws TimeException 
    {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
        convertTo12HourFormat();
    }

    public void updateTime(String time) throws TimeException 
    {
        try 
        {
            String[] parts = time.split(":");
            int hours = Integer.parseInt(parts[0]);
            int minutes = Integer.parseInt(parts[1]);
            int seconds = Integer.parseInt(parts[2]);
            updateTime(hours, minutes, seconds);
        } 
        catch (NumberFormatException | ArrayIndexOutOfBoundsException e) 
        {
            throw new TimeException("EXCEPTION: Invalid time format or non-numeric input");
        }
    }

    // Display time in 12-hour format
    public void displayTime() 
    {
        String period = notPM ? "AM" : "PM";
        System.out.printf("12-hour clock time → %d:%02d:%02d %s\n", hours, minutes, seconds, period);
    }
}
