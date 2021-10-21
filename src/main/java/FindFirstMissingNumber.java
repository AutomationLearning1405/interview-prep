public class FindFirstMissingNumber {

    public static void main(String args[]) {
        float totalCount = 6;
        float num[] = {1, 3, 4, 5, 6};
        float expSum = totalCount * ((totalCount + 1) / 2);
        float actualSum = 0;
        for (float i : num) {
            actualSum += i;
        }
        System.out.println("The missing number --> " + (expSum - actualSum));
    }
}
