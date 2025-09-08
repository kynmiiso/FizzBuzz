package lab1;

public class Multiples {
    public static void main(String[] args) {
        int count = multiples();
        System.out.println(count);
    }

    static int multiples(int n, int a, int b) {
        int i = 1;
        int count = 0;
        while (i < n) {
            if (i % a == 0 || i % b == 0) {
                count++;
                System.out.println(i);
            }
            i++;
        }
        return count;
    }

    public static int multiples() {
        return multiples(1000, 3, 5);
    }
}
