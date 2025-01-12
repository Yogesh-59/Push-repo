public class RandomNumberStats {
    //method to generate Digit Random Array
    public static int[] generateDigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            // Generate random number between 1000 and 9999
            randomNumbers[i] = (int) (Math.random() * 9000) + 1000; 
        }
        return randomNumbers;
    }
    //method to find Average Min Max
    public static double[] findAverageMinMax(int[] numbers) {
        double[] result = new double[3]; //  create array to store average, min, max
        double sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        result[0] = sum / numbers.length; // calculate average
        result[1] = Math.min(numbers); // find minimum
        result[2] = Math.max(numbers); // find maximum

        return result;
    }

    public static void main(String[] args) {
        int size = 5; // Generate 5 random numbers
       //call method generateDigitRandomArray
        int[] randomNumbers = generateDigitRandomArray(size);

        System.out.print("Generated 4-digit random numbers: ");
        for (int number : randomNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        double[] stats = findAverageMinMax(randomNumbers);

        System.out.println("Average: " + stats[0]);
        System.out.println("Minimum: " + stats[1]);
        System.out.println("Maximum: " + stats[2]);
    }
}