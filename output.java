import java.util.Date;
import java.util.Random;

interface output {
    private static void main() {
        Currentdate();
        TaskRandom();
        sum1();
        sum2();
    }

    private static void Currentdate() {
        Date now = new Date();
        System.out.println(now);
    }

    private static void TaskRandom() {
        Random r = new Random();
        String[] random = new String[]{"りんご", "ばなな", "メロン"};
        int index = r.nextInt(random.length);
        System.out.println(random);
    }

    private static void sum1() {
        for (int i = 0; i <= 100; i = i + 2) {
            System.out.println(i);
        }
    }

    private static void sum2() {
        for (int x = 2; x < 100; x = x + 2) {
            System.out.println(x);
        }
    }
}
