package base;

/**
 *
 */
public abstract class SortAbstract implements Sort{

    private int[] data;

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

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
