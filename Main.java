import searcher.Searcher;
import searcher.impl.BinarySearcher;

public class Main {

    public static void main(String[] args) {

        int[] array={2,3,4,5,6,7,8};
        int item=7;
        Searcher searcher=new BinarySearcher();
        Integer index = searcher.index(array, item);
        System.out.println(index);

    }

}
