package leetcode;

public class L2037_MinMovesToSeatAll {
    public static void main(String[] args) {
      int[]  seats = {3,1,5};
      int[] students = {2,7,4};

        int len = seats.length;
        int[] sortedSeats = countingSort(seats);
        int[] sortedStudents = countingSort(students);

        int res = 0;
        for(int i = 0; i< len ; i++){
            res += Math.abs(sortedSeats[i] - sortedStudents[i]);
        }

        System.out.println(res);
    }

    private static int[] countingSort(int[] arr){
        int[] freq = new int[101];
        for(int i : arr){
            freq[i]++;
        }

        for(int i = 1 ; i< freq.length; i++){
            freq[i] += freq[i-1];
        }

        int[] res = new int[arr.length];
        for(int i : arr){
            res[freq[i]-1]  = i;
            freq[i]--;
        }

        return res;
    }
}
