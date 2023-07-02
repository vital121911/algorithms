package searcher.impl;

import searcher.Searcher;

public class BinarySearcher implements Searcher {
    // 1,2,3,4,5,6,7,8    3
    @Override
    public Integer index(int[] sortedItems, int element) {
        int start = 0;
        int end = sortedItems.length;
        while (start <= end) {
            int midl = (int) ((long) start + end) / 2;
            int midlItem = sortedItems[midl];
            if (midlItem == element) {
                return midl;
            }
            if (midlItem > element) {
                end = midl - 1;
                continue;
            }
            start = midl + 1;
        }
        return null;
    }
}
