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
    public static class stackIntTest {
        public static void main(String[] args) {
            StackInt s = new StackInt(3);
            int i;
            for ( i=1; i < 5; i++) {
                try {
                    s.push(i);
                } catch (stackException e) {
                    System.out.println("pushed to much");
                }
            }
            for ( i=0; i < 5; i++) {
                try {
                    System.out.printf("%d%n",  s.pop());
                } catch (stackException e) {
                    System.out.println("popped to much");
                }
            }
        }
    }
}