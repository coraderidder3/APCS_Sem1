import java.util*;

public class StepTracker{
    
    private int days;
    private int aDays;
    private int totalSteps;
    private int goal;
    
    
    public StepTracker(int goal){
        this.goal = goal;
    }
    
    public int activeDays(){
        if (addDailySteps>goal){
            aDays++;
        }
        return aDays;
    }
    
    public double averageSteps(){
        return totalSteps/days;
    }
    
    public void addDailySteps(){
        totalSteps=totalSteps+addDailySteps;
        days++;
    }
}