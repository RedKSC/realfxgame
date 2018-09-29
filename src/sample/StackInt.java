package sample;
public class StackInt {
    int[] stack;
    int pointer;
    StackInt(int size){
        stack = new int[size];
        pointer = 0;
    }
    int pop(){
        return stack[--pointer];
    }
    void push(int i){
        stack[pointer++] = i;
    }
}
