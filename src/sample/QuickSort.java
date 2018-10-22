package sample;
import java.lang.Math;
public class QuickSort {
    static int number  = 20;
    static int[] i;
    static void run(int min, int max) {
        System.out.println("max: " + max + " min:" + min);
        if (max - min > 1){
            boolean done = false;
            int high = max;
            int low = min + 1;
            int comp = i[min];
            System.out.println("compare value: " + comp);
            for (int x = 0; x < number; x++) {
                System.out.print(i[x]);
            }
            System.out.println("");
            while (!done) {
                System.out.println("high (" + high +  ") is at: " + i[high] + " | low (" + low +") is at: " + i[low]);
                if (i[low] <= comp & i[low] > comp) {
                    int b = i[high];
                    i[high] = i[low];
                    i[low] = b;
                    high--;
                    low++;
                }
                else if (i[high] < comp & i[low] <= comp) {
                    low++;
                }
                else if (i[high] > comp & i[low] >= comp) {
                    high--;
                }
                else{
                    low++;
                    high--;
                }
                if (high <= low) {
                    done = true;
                    if (high < low) {
                        high++;
                    }
                    low--;
                    int c = i[low];
                    i[low] = i[min];
                    i[min] = c;
                    for (int x = 0; x < number; x++) {
                        System.out.print(i[x]);
                    }
                    System.out.println("");
                    run(min, low);
                    run(low, max);
                }
            }
        }
        else if(max-min==1){
            if (i[min] >= i[max]){
                int d = i[min];
                i[min] = i[max];
                i[max] = d;
            }
            else{

            }
        }
    }

    public static void main(String args[]) {
        i = new int[number];
        for (int x = 0; x < number; x++) {
            i[x] = (int) Math.round(Math.random() * 10);
        }
        run(0, number-1);
    }
}

