package sample;
public class StackInt {
    int[] stack;
    int stackPointer;
    int max;
    StackInt(int i) {
        System.out.printf("Creating Object %d%n", i);
        stack = new int[i];
        stackPointer = 0;
        max = i;
        return;
    }
    int pop() throws stackException {
        if (stackPointer == 0) {
            throw (new stackException() );
        }
        return (stack[--stackPointer]);
    }
    void push(int i) throws stackException {
        if (stackPointer == max ) {
            throw ( new stackException() );
        }
        stack[stackPointer++] = i;
    }
}
