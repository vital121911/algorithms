package sorter.impl.merging;

import sorter.Sorter;

import java.util.Arrays;

public class MergingSorterWithCloningData implements Sorter<int[]> {

    @Override
    public void sort(int[] inputArray) {
        int[] result = sorting(inputArray);
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i]=result[i];
        }
    }
    private int[] sorting(int[] arrayA){
        if (arrayA.length==1){
            return arrayA;
        }
        int midl=arrayA.length>>1;
        return merge(sorting(Arrays.copyOfRange(arrayA,0,midl)
        ), sorting(Arrays.copyOfRange(arrayA,midl,arrayA.length)));
    }

    private int[] merge(int[] arrayA,int[] arrayB){
        int[] mergingResult=new int[arrayA.length+arrayB.length];
        int indexA=0;
        int indexB=0;
        int resultIndex=0;
        while (indexA<arrayA.length||indexB<arrayB.length){
            if (indexA==arrayA.length){
                mergingResult[resultIndex++]=arrayB[indexB++];
                continue;
            }
            if (indexB==arrayB.length){
                mergingResult[resultIndex++]=arrayA[indexA++];
                continue;
            }
            if (arrayA[indexA]<arrayB[indexB]){
                mergingResult[resultIndex++]=arrayA[indexA++];
            }else {
                mergingResult[resultIndex++]=arrayB[indexB++];
            }
        }
        return mergingResult;
    }
}
