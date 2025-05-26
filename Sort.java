import java.util.*;

public class Sort {
    public static int[] frequencySort(int[] nums) {
        // Count frequency of each element
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Convert array to Integer array for sorting with custom comparator
        Integer[] arr = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }

        // Sort by frequency descending, then by value ascending
        Arrays.sort(arr, (a, b) -> {
            int freqCompare = freqMap.get(b).compareTo(freqMap.get(a));
            if (freqCompare == 0) {
                return a.compareTo(b);
            }
            return freqCompare;
        });

        // Convert back to int array
        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }
        return nums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array");
        n = sc.nextInt();
        int[] input = new int[n];
        for(int i=0;i<n;i++){
            input[i]=sc.nextInt();
        }
        int[] sorted = frequencySort(input);
        if(sorted.length==0){
            System.out.println("The input array is empty");
        }
        else{
            System.out.println(Arrays.toString(sorted));
        }
        
    }
}
