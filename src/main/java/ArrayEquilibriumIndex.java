public class ArrayEquilibriumIndex {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 2, 1}; // Example array

        int equilibriumIndex = findEquilibriumIndex(arr);

        if (equilibriumIndex != -1) {
            System.out.println("Equilibrium index found at: " + equilibriumIndex);
        } else {
            System.out.println("No equilibrium index found.");
        }
    }

    public static int findEquilibriumIndex(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i]; // Now totalSum is the right sum for index i

            if (leftSum == totalSum) {
                return i; // Equilibrium index found
            }

            leftSum += arr[i];
        }

        return -1; // No equilibrium index found
    }
}
