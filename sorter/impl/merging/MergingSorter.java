package sorter.impl.merging;

import sorter.Sorter;

import java.util.Arrays;

public class MergingSorter implements Sorter<int[]> {

    @Override
    public void sort(int[] input) {
        int[] buff=new int[input.length];
        sorting(input,0,input.length,buff);
        for (int i = 0; i < input.length; i++) {
            input[i] = buff[i];
        }
    }

    private void sorting(int[] input, int leftPoint, int rightPoint, int[] buff) {
        if (rightPoint - leftPoint <= 1) {
            return;
        }
        int midlPoint = (rightPoint + leftPoint) >>1;
        sorting(input,leftPoint,midlPoint,buff);
        sorting(input,midlPoint,rightPoint,buff);
        merge(input,leftPoint,midlPoint,rightPoint,buff);
    }

    private void merge(int[] array, int left, int midl, int right, int[] buff) {
        int startIndexA=left;
        int startIndexB=midl;
        int buffIndex=0;
        while (startIndexA<midl||startIndexB<right){
            if (startIndexA==midl){
                buff[buffIndex++]=array[startIndexB++];
                continue;
            }
            if (startIndexB==right){
                buff[buffIndex++]=array[startIndexA++];
                continue;
            }
            if (array[startIndexA]<array[startIndexB]){
                buff[buffIndex++]=array[startIndexA++];
            }else {
                buff[buffIndex++]=array[startIndexB++];
            }
        }
        for (int i = left; i <right ; i++) {
            array[i]=buff[i -left];
        }
    }
}
