package sample;
public class StackIntTest {
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