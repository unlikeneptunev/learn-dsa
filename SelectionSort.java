import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {

        int[] numbers = new int[5];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(numbers));
        selectionSort(numbers);
        System.out.println(Arrays.toString(numbers));

    }

    private static void selectionSort(int[] numbers) {
        int length = numbers.length;

        for (int i = 0; i < length - 1; i++) {
            int min = numbers[i];
            int indexOfMin = i;
            for (int j = i + 1; j < length; j++) {
                if (numbers[j] < min) {
                    min = numbers[j];
                    indexOfMin = j;
                }
            }
            swap(numbers, i, indexOfMin);
        }
    }
    private static void swap(int[] numbers, int a, int b) {
        int temp = numbers[a];
        numbers[a] = numbers[b];
        numbers[b] = temp;
    }
}

/*
Step-by-step explanation:

1. Generate an array of random numbers:
   int[] numbers = new int[5];
   for (int i = 0; i < numbers.length; i++) {
       numbers[i] = random.nextInt(10);
   }
   // This creates an array of 5 random integers between 0 and 9.

2. Print the original array:
   System.out.println(Arrays.toString(numbers));

3. Sort the array using selection sort:
   selectionSort(numbers);

4. Print the sorted array:
   System.out.println(Arrays.toString(numbers));

5. How selectionSort works:
   - For each position i in the array (from 0 to length-2):
     for (int i = 0; i < length - 1; i++) {
         int min = numbers[i];
         int indexOfMin = i;
         // Find the smallest value in the rest of the array
         for (int j = i + 1; j < length; j++) {
             if (numbers[j] < min) {
                 min = numbers[j];
                 indexOfMin = j;
             }
         }
         // Swap the smallest value found with the value at position i
         swap(numbers, i, indexOfMin);
     }

6. How swap works:
   private static void swap(int[] numbers, int a, int b) {
       int temp = numbers[a];
       numbers[a] = numbers[b];
       numbers[b] = temp;
   }
   // This exchanges the values at positions a and b in the array.
*/
