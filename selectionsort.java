
import java.util.Arrays;


public class selectionsort {
    public static void selection(int numbers[]) {
        for(int i = 0; i < numbers.length - 1; i++) {
            int minpos = i;

            for(int j = i + 1; j < numbers.length; j++) {
                if(numbers[minpos] > numbers[j]) {
                    minpos = j;  // ✅ Correct: store index, not value
                }
            }

            // Swap numbers[i] and numbers[minpos]
            int temp = numbers[minpos];
            numbers[minpos] = numbers[i];
            numbers[i] = temp;
        }
    }

    public static void print(int numbers[]) {
        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static void main(String args[]) {
        int numbers[] = {2, 5, 6, 4, 1};
        Arrays.sort(numbers);
        print(numbers);
    }
}
