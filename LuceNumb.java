import java.lang.Math;

public class LuceNumb {

    private int _number;
    private long _val;

    /**
     * Construct a number of Luce's sequence
     * with his value and №.
     * @param val value of Luce number
     * @param number № in sequence
     */
    LuceNumb(long val,int number){
        _val = val;
        _number = number;
    }

    /**
     * Getter for value
     * @return value
     */
    long getVal(){
        return this._val;
    }

    /**
     * Getter for number
     * @return № of number
     */
    int getNumber(){
        return this._number;
    }

    /**
     * Function sets N Lucas's numbers
     * with their value, and № in sequence
     * @param luceNumbers array of objects LuceNumb class
     */
    static public void setLucasNums(LuceNumb [] luceNumbers){
        luceNumbers[0] = new LuceNumb(2,1);
        if(luceNumbers.length >= 2) {
            luceNumbers[1] = new LuceNumb(1,2);
            for (int i = 2; i < luceNumbers.length; ++i) {
                long newVal = 0; int newNumber;

                newVal = luceNumbers[i-1]._val + luceNumbers[i-2]._val;
                newNumber = i + 1;
                luceNumbers[i] = new LuceNumb(newVal,newNumber);
            }
        }
    }
    /**
     * Prints numbers that passed the condition:
     * value = w^2 - 1.
     * @param luceObjects array of objects LuceNumb class
     */
    static void printCorrectNumbs(LuceNumb [] luceObjects){
        int counter = 0;
        for(int i = 0;i < luceObjects.length;i++){
            double temp = Math.sqrt(luceObjects[i]._val+1);
            if(temp % 1.0 == 0){
                System.out.println((counter + 1) +") Value:"+luceObjects[i]._val +" - № "+luceObjects[i]._number +"\tCondition: "+luceObjects[i]._val + " = "+(int)temp +"^2 - 1" );
                counter++;
            }

        }
        if(counter == 0){
            System.out.println("\nNo such numbers:");
        }
    }
}
