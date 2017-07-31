package base;

/**
 *
 */
public abstract class AbstractSort implements Sort{

    @Override
    public void display(int[] o) {
        for(int item : o){
            System.out.print(item+"\t");
        }
    }

    public void displayReverse(int[] data){
        for(int i=data.length-1;i>=0;i--){
            System.out.print(data[i]+"\t");
        }
    }
}
