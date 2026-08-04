class twoStacks {
    int[] arr = new int[100];
    int size = 100;
    int top1, top2;

    twoStacks() {
        top1 = -1;
        top2 = size;
    }

    // Push element in stack 1
    void push1(int x) {
        if (top1 < top2 - 1) {
            arr[++top1] = x;
        }
    }

    // Push element in stack 2
    void push2(int x) {
        if (top1 < top2 - 1) {
            arr[--top2] = x;
        }
    }

    // Pop element from stack 1
    int pop1() {
        if (top1 == -1)
            return -1;

        return arr[top1--];
    }

    // Pop element from stack 2
    int pop2() {
        if (top2 == size)
            return -1;

        return arr[top2++];
    }
}

