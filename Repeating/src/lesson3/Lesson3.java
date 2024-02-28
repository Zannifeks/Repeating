package lesson3;

public class Lesson3 {
    public static void main(String[] args) {
        // task 1
        int n0 = 0;
        int n1 = 1;
        int n2 = 2;
        int n3 = 3;
        int n4 = 4;
        int n5 = 5;
        int n6 = 6;
        int n7 = 7;
        int n8 = 8;
        int n9 = 9;
        int sum = (n0 + n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9) / 10;
        System.out.println(sum);

        // task 2
        int a = 1000;
        int b = 500;
        int c = 10;
        int sum2 = ((a + b) / 100) * c;
        int share = (a + b) - sum2;
        System.out.println(share);
        System.out.println(sum2 + " is 10% discount");

        // task 3 SKIP

        // task 4
        for (int y = 1; y < 10; y++) {
            int z = y % 2;
            int r = y % 3;
            System.out.println("The remainder of division " + y + " by 2 will be : " + z);
            System.out.println("The remainder of division " + y + " by 3 will be : " + r);
        }

        // task 5
        int x = 3;
        x += x++;
        System.out.println(x);
    }
}
