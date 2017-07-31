package select;

import base.AbstractSort;

/**
 * —°‘Ò≈≈–Ú
 */
public class SelectSort extends AbstractSort {

    @Override
    public void sort(int[] data) {

        for(int i=0;i<data.length-1;i++){
            int min = i;
            for(int j=i+1;j<data.length;j++){
                if(data[min] > data[j]){
                    min = j;
                }

                swap(data,i,min);

            }
        }
    }

    @Override
    public void display(int[] data) {
        super.display(data);
    }

    public void displayReverse(int[] data){
        super.displayReverse(data);
    }

    private void swap(int[] data ,int i, int j) {
        int tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }

    public static void main(String[] args){
        int[] data = new int[]{1,23,56,10,8};
        SelectSort selectSort = new SelectSort();
        selectSort.sort(data);
        selectSort.display(data);
    }
}
