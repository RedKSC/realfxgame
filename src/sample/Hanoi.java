package sample;

public class Hanoi{
    private static int x = 8;
    //choice of eac
    private static StackInt stack1;
    private static StackInt stack2;
    private static StackInt stack3;
    //creates an array of stacks with data type stackInt to hold the other stacks, all of class stackInt
    static StackInt stacks[];
    static {
        stack1 = new StackInt(x);
        stack2 = new StackInt(x);
        stack3 = new StackInt(x);
        stacks = new StackInt[]{stack1, stack2, stack3};
    }
    public static void move(int n, int src, int dest) {
        int destination = dest - 1;
        int source = src - 1;
        //to avoid confusion because arrays start from 0, but the towers(column) start from 1
        if (n == 1) {
            System.out.println("Move disk " + n + " from column " + src + " to column " + dest + ".");
            stacks[destination].push(stacks[source].pop());
        } else {
            move(n - 1, src, (6 - src - dest));
                /*if n>1, then run the function again for n-1 and so on recursively, changing the source and the
                destination and finding the solution for the tower that is one piece smaller, and starting from 1. It
                moves tower n-1 to column two.*/
            System.out.println("Move disk " + n + " from column " + src + " to column " + dest + ".");
            stacks[destination].push(stacks[source].pop());
            move(n - 1, (6 - src - dest), dest);
                //this repeats the pattern above, but moves the tower of n-1 from column two to column three.
        }
    }
        public static void main(String[] args) {
            for(int i=x; i>0; i--){
                stack1.push(i);
                //creates the tiles in column 1
            }
            move(x, 1, 3);
            for(int y=0; y<x; y++) {
                System.out.println(stack3.stack[y]);
                //counts off each of the tiles in column 3 when finished
            }
        }
}
