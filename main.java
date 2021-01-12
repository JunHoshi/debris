import test.date;
import test.guusuu;
import test.kisuu;
import test.random;

public class main {
    public static void main(String[] args){
        date.day();
        random.ran();
//        kisuu.warusan();voidを使った呼び出し方（戻り値なし）
        System.out.println(kisuu.warusan());//return文を使用した呼び出し方（戻り値あり）
        guusuu.waruni();
        //↑クラス呼び出しの皆さん
    }
}
//import文を書くことimport文はプロジェクトを見て判断する
//main文はパッケージ外に書くこと