public class HelloGit {
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 5, 7, 0, -3, 4};
        System.out.println("Average: " + getAverage(arr));
    }

    private static double getAverage(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
           sum += arr[i]; 
        }

        return (double) sum / arr.length;
    }
}

