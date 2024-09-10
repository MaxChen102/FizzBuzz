public class Multiples {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        for (int k = 1; k < 1001; k++) {
            boolean divisibleby3 = k % 3 == 0;
            boolean divisibleby5 = k % 5 == 0;
            if (divisibleby3) {
                i++;
            }
            if (divisibleby5) {
                j++;
            }
        }
        System.out.println(i);
        System.out.println(j);
    }
}
