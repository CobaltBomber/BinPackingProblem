/* *****************************************************************************
 *  Name:    Ada Lovelace
 *  NetID:   alovelace
 *  Precept: P00
 *
 *  Description:  Prints 'Hello, World' to the terminal window.
 *                By tradition, this is everyone's first program.
 *                Prof. Brian Kernighan initiated this tradition in 1974.
 *
 **************************************************************************** */

import java.util.ArrayList;

public class Bin {

    public int binSize;
    public ArrayList<Integer> items = new ArrayList<Integer>();
    private static int count = 0;
    public int id = 0;

    public Bin(int binSize) {
        this.binSize = binSize;
        count++;
        id = count;


    }

    public int GetBinSize() {
        return binSize;
    }

    public void AddItem(int addItem) {
        items.add(addItem);
        binSize -= addItem;
    }

    public Bin BestFit(int itemSize) {
        if(binSize <= itemSize) {
            return
        }

    }
    //pass in tree and x

    public void WorstFit(int itemSize) {

    }


    public String toString() {
        String myString = "Bin #" + id + ": " + items;
        return myString;
    }
}
