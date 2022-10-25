package class1021;

public class Stack01 {

    private int[] arr = new int[10000];
    private int pointer = 0; // -1 은 비어있는 상태

    public Stack01() {
    }

    public Stack01(int size) {
        this.arr = new int[size];
    }

    public void push(int value) {
        this.arr[this.pointer] = value;
        this.pointer ++;
    }

    public int pop() {
        // push에서 pointer ++ 를 하기 때문에 넣은건 index[1]까지인데
        // test 돌릴 땐 index[2]로 생각하기 때문에 '-1' 를 꼭 해줘야함
        int value = this.arr[this.pointer-1];
        this.pointer--;
        return value;

    }

    public int[] getArr(){
        return arr;
    }
}
