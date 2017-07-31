package insert;

import base.SortAbstract;

/**
 *
 */
public class Test extends SortAbstract{

    @Override
    public void sort(int[] data) {
        for(int i=1;i<data.length;i++){
            int temp = data[i];
            int j = i;

            while (j>0 && data[j-1] >= temp){
                data[j] = data[j-1];
                --j;
            }

            data[j] = temp;
        }
    }

    public static void main(String[] args){
        int[] data = new int[]{1,23,56,10,8};
        Test insertSort = new Test();
        insertSort.sort(data);
        insertSort.display(data);
    }
}
