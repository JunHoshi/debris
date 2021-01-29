import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;


public class Output {
    public static void main(String[] args) {
        Currentdate();
        TaskRandom();
        sum1();//奇数
        sum2();//偶数
    }
    private static void Currentdate(){
        Date now = new Date();
        System.out.println(now);
    }
    private static void TaskRandom(){
        List<String> list = Arrays.asList("りんご","メロン","バナナ");//３つの要素を持つリスト
        int index = new Random().nextInt(list.size());//ランダムに選択された0以上3未満の整数
        String result = list.get(index);

        System.out.println(result);

    }
    public static void sum1() {
        int s=0;

        for(int x = 1; x < 100; x++){
        if (x % 2 != 0){
            s += x;
        }
    }
        System.out.println(s);
    }
    private static void sum2(){
        int z= 0;
        for(int y = 0; y <= 100; y++) {
            if (y % 2 == 0){
                z += y;
            }
        }
        System.out.println(z);
    }
}