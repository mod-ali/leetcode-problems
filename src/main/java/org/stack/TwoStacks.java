package org.stack;

//You can either divide array in two halves or start stacks at extreme ends.
//We'll use the second technique to solve this problem.
//Top of Stack 1 start from extreme left of array i.e top1 = 0;
//Top of Stack 2 start from extreme right of array i.e top2 = size - 1
public class TwoStacks<V> {
    private int maxSize;
    private int top1, top2; //Store top value indices of Stack 1 and Stack 2
    private V[] array;

    @SuppressWarnings("unchecked")
    public TwoStacks(int max_size) {
        this.maxSize = max_size;
        this.top1 = -1;
        this.top2 = max_size;
        array = (V[]) new Object[max_size]; //type casting Object[] to V[]
    }

    //insert at top of first stack
    public void push1(V value) {
        if (top1 < top2 - 1) {
            array[++top1] = value;
        }
    }

    //insert at top of second stack
    public void push2(V value) {
        if (top1 < top2 - 1) {
            array[--top2] = value;
        }
    }

    //remove and return value from top of first stack
    public V pop1() {
        if (top1 > -1) {
            return array[top1--];
        }
        return null;
    }

    //remove and return value from top of second stack
    public V pop2() {
        if (top2 < maxSize) {
            return array[top2++];
        }
        return null;
    }

    void printArr() {
        for (V v : array) {
            System.out.println(v);
        }
    }

    public static void main(String[] args) {
        TwoStacks<Integer> twoStacks = new TwoStacks<>(5);
        twoStacks.push1(1);
        twoStacks.push1(2);
        twoStacks.push1(3);
        twoStacks.push2(4);
        twoStacks.push2(5);

        twoStacks.printArr();
    }
}
