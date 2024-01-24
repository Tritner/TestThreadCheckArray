import java.util.ArrayList;

/**
 *  @code SharedData 
 * Sapir Isaac, Vlad Tritner
 */
public class SharedData {

    
    private ArrayList<Integer> array;
    private boolean[] winArray;
    private boolean flag;
    private final int b;

    /**
     * Constructs a new {@code SharedData} instance with the specified array and constant integer.
     *
     * @param list holds the
     * @param b The constant integer value.
     */
    public SharedData(ArrayList<Integer> array, int b) {
        this.array = array;
        this.b = b;
    }

    /**
     * @return The boolean array.
     */
    public boolean[] getWinArray() {
        return winArray;
    }

    /**
     * Sets the boolean array.
     *
     * @param winArray
     */
    public void setWinArray(boolean[] winArray) {
        this.winArray = winArray;
    }

    /**
     * Gets the array list containing integers.
     * @return The array list.
     */
    public ArrayList<Integer> getArray() {
        return array;
    }

    /**
     * Gets constant integer value.
     * @return The constant integer.
     */
    public int getB() {
        return b;
    }

    /**
     * Gets  current value of the flag.
     * @return The flag value.
     */
    public boolean getFlag() {
        return flag;
    }

    /**
     * Sets the flag with value.
     * @param flag .
     */
    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
