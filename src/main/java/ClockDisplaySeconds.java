package src.main.java;

public class ClockDisplaySeconds
{
    //Implement a private String for the display
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private NumberDisplay seconds;
    private String display;
    
    public ClockDisplaySeconds(){
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
        updateDisplay();
        }
    
    public ClockDisplaySeconds(int hour, int minute, int second){
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
        setTimeSeconds(hour, minute, second);
    }
    
    public void timeTickSeconds(){
        seconds.increment();
        
        if(seconds.getValue() == 0){
            minutes.increment();
        }
        if(minutes.getValue() == 0){
            hours.increment();
        }
        
        updateDisplay();
        }
    
    public void setTimeSeconds(int hour, int minute, int second){
        seconds.setValue(second);
        minutes.setValue(minute);
        hours.setValue(hour);
        updateDisplay();
    }
    
    public String getTimeSeconds(){
        return display;
    }

        public void updateDisplay(){
        String output = "";
        
        output = hours.getDisplayValue();
        output += ":";
        output += minutes.getDisplayValue();
        output += ":";
        output += seconds.getDisplayValue();
        
        display = output;
    }
}
