package sorter.impl;

import sorter.Sorter;

import java.util.ArrayList;
import java.util.List;

public class ObjectCountingSorter implements Sorter<Integer[]> {

    @Override
    public void sort(Integer[] inputArray) {
        List<Integer>[] quantityNumber=new ArrayList[365];
        for (int i = 0; i < 365; i++) {
            quantityNumber[i]=new ArrayList<>();    
        }
        for (int i = 0; i < inputArray.length; i++) {
            quantityNumber[inputArray[i]].add(inputArray[i]);
        }
        int pt=0;
        for (int i = 0; i < quantityNumber.length; i++) {
            List<Integer> integers = quantityNumber[i];
            for (int j = 0; j < integers.size(); j++) {
                inputArray[pt]= integers.get(j);
                pt+=1;
            }

        }

    }
}