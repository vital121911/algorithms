import searcher.Searcher;
import searcher.impl.BinarySearcher;
import sorter.Sorter;
import sorter.impl.InsertionSorter;
import sorter.impl.SelectionSorter;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array={90,2,3,23,4,89,5,90,6,7,8,90};
        int item=7;
        Sorter sorter= new InsertionSorter();
        sorter.sort(array);
        System.out.println(Arrays.toString(array));
        Searcher searcher=new BinarySearcher();
        Integer index = searcher.index(array, item);
        System.out.println(index);

    }

}
