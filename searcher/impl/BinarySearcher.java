package searcher.impl;

import searcher.Searcher;

public class BinarySearcher implements Searcher {
    // 1,2,3,4,5,6,7,8    3
    @Override
    public Integer index(int[] sortedItems, int searchingItem) {
        int right = 0;
        int left = sortedItems.length;
        while (right <= left) {
            int midlIndex = (int) ((long) right + left) / 2;
            int midlItem = sortedItems[midlIndex];
            if (midlItem == searchingItem) {
                return midlIndex;
            }
            if (midlItem > searchingItem) {
                left = midlIndex - 1;
                continue;
            }
            right = midlIndex + 1;
        }
        return null;
    }
}
