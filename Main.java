package com.company;
import java.util.Date;
import java.util.Random;

//お題
public class Main {

    public static void main(String[] args) {
//今日の日付を年月日で出力する
        Date now=new Date();
        System.out.println(now);

//りんご、ばなな、メロンをランダムに出力する
//        String[] names={"りんご、バナナ、メロン"}; 配列でできると思った
//          double randomNum1=Math.random();　とりあえずランダム作った

            Random r=new Random();
            int x=r.nextInt(3);
            System.out.println(x);

            switch (x){
                case 0:
                    System.out.println("りんご");
                    break;
                case 1:
                    System.out.println("ばなな");
                    break;
                case 2:
                    System.out.println("メロン");
                    break;
            }
            //ランダムの出力するにはケースの数字を利用して
            // ランダム関数を使ってランダムに３つの単語を取り出す

//1から100以下の奇数を全て足した結果を出力する
        //forで奇数部分わってそれを足す
        int y=0;
        for(int i=1;i<100;i+=2){
            y+=i;
        }
        System.out.println(y);
//指定された数字（100未満）以上100以下の偶数を全て足した結果を出力する
        int z=0;
        for (int a=0;a<=100;a+=2){
            z+=a;
        }
        System.out.println(z);
    }
}
