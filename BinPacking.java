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

import edu.princeton.cs.algs4.BST;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

import java.util.ArrayList;
import java.util.Arrays;


public class BinPacking {

    public static ArrayList<Bin> FirstFit(int binSize, int[] itemSizes){
        ArrayList<Bin> bins = new ArrayList<Bin>();
        for (int i = 0; i < itemSizes.length; i++) {
            boolean foundBin = false;
            for(Bin bin : bins) {
                if (bin.GetBinSize() > itemSizes[i]) {
                    bin.AddItem(itemSizes[i]);
                    foundBin = true;
                    break;

                }
            }
            if (foundBin == false) {
                Bin myBin = new Bin(binSize);
                myBin.AddItem(itemSizes[i]);
                bins.add(myBin);
            }
            if (itemSizes[i] > binSize) {
                StdOut.println("ERROR: Item is larger than bin sizes, please change your inputs and try again.");
                System.exit(0);
            }

        }
        return bins;
    }

    public ArrayList<Bin> BestFitDecreasing(int binSize, int[] itemSizes){
        ArrayList<Bin> bins = new ArrayList<Bin>();
        BST best = new BST();
        for (int i = 0; i < itemSizes.length; i++) {


        }


        return bins;
    }

    public void WorstFitDecreasing(){

    }



    public static void main(String[] args) {

        int input = Integer.parseInt(args[0]);
        In readIn = new In(args[1]);
        String myArray[] = readIn.readAllLines();
        int intArray[] = new int[myArray.length];

        for (int i = 0; i < myArray.length; i ++) {
            int add = Integer.parseInt(myArray[i]);
            intArray[i] = add;
        }
        StdOut.println("Array of items to be put into bins and bin size");
        StdOut.println(Arrays.toString(intArray) + ", Bin Size: " + input);

        StdOut.println("Bin packing using First-fit:");
        StdOut.println(FirstFit(input, intArray));

        StdOut.println("Bin packing using BestFitDecreasing:");

        StdOut.println("Bin packing using WorstFitDecreasing:");



    }
}
