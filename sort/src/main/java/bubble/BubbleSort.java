package bubble;

import base.AbstractSort;

/**
 * ц╟ещ
 */
public class BubbleSort extends AbstractSort {

    public BubbleSort(){}

    @Override
    public void sort(int[] data) {
        for(int i=0;i<data.length-1;i++){
            for(int j=i+1;j<data.length;j++){
                if(data[i]>data[j]){
                    swap(data,i,j);
                }
            }
        }
    }

    private void swap(int[] data ,int i, int j) {
        int tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }

    public static void main(String[] args){
        int[] data = new int[]{1,23,56,10,8};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(data);
        bubbleSort.displayReverse(data);
    }
}
