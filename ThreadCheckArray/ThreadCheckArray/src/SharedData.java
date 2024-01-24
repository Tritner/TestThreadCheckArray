import java.util.ArrayList;

/**
 * The {@code SharedData} class represents shared data in a multi-threaded environment.
 * It encapsulates an array list, a boolean array, a flag, and a constant integer.
 */
public class SharedData {

    /** The array list for storing integers. */
    private ArrayList<Integer> array;

    /** The boolean array used for a specific purpose. */
    private boolean[] winArray;

    /** The flag indicating a specific state. */
    private boolean flag;

    /** The constant integer value. */
    private final int b;

    /**
     * Constructs a new {@code SharedData} instance with the specified array and constant integer.
     *
     * @param array The array list to be used.
     * @param b     The constant integer value.
     */
    public SharedData(ArrayList<Integer> array, int b) {
        this.array = array;
        this.b = b;
    }

    /**
     * Gets the boolean array used for a specific purpose.
     *
     * @return The boolean array.
     */
    public boolean[] getWinArray() {
        return winArray;
    }

    /**
     * Sets the boolean array with the specified array.
     *
     * @param winArray The boolean array to be set.
     */
    public void setWinArray(boolean[] winArray) {
        this.winArray = winArray;
    }

    /**
     * Gets the array list containing integers.
     *
     * @return The array list.
     */
    public ArrayList<Integer> getArray() {
        return array;
    }

    /**
     * Gets the constant integer value.
     *
     * @return The constant integer.
     */
    public int getB() {
        return b;
    }

    /**
     * Gets the current value of the flag.
     *
     * @return The flag value.
     */
    public boolean getFlag() {
        return flag;
    }

    /**
     * Sets the flag with the specified value.
     *
     * @param flag The flag value to be set.
     */
    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
