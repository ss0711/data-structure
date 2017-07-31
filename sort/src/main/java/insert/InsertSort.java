package insert;

import base.AbstractSort;

/**
 * ≤Â»Î
 */
public class InsertSort  extends AbstractSort {

    @Override
    public void sort(int[] data) {
        int j;
        for(int i=1;i<data.length;i++){
            int temp = data[i];
            j = i;

            while( j > 0 && data[j-1] >= temp){
                data[j] = data[j-1];
                -- j;
            }

            data[j] = temp;
        }
    }

    public static void main(String[] args){
        int[] data = new int[]{1,23,56,10,8};
        InsertSort insertSort = new InsertSort();
        insertSort.sort(data);
        insertSort.display(data);
    }
}
