package sample;

public class FibonacciSequencerNolan {
    public static void main(String[] args){
        int[] fib = new int[10];
        int a = 1;
        int b = 1;
        int c;
        int tick = 0;
        while(tick < 10){
            c = a + b;
            a = b;
            b = c;
            tick++;
            fib[tick] = c;
            System.out.println(c);
        }
    }
}
