
import java.util.ArrayList;

public class Bins {
    //declare variables
    private Integer minRoll;
    private Integer maxRoll;
    int[] binArray;

    //instantiated
    public Bins(int minRoll, int maxRoll){
        this.maxRoll = maxRoll;
        this.minRoll = minRoll;
        binArray = new int[maxRoll];



    }
    //
    public void incrementBin(int result){
        binArray[result-2]++;
    }
    public Integer getBin(int binId)
    {
        return binArray[binId];
    }

    public Integer getBinMin(){
        return minRoll;
    }
    public Integer getBinMax(){
        return maxRoll;
    }
}

