// //入力、演算、出力のサンプル

// import java.util.Scanner; //Scanner:キーボード入力するapi(import)

// public class Sample1 {
//     public static void main(String[] args){
//         //キーボード入力するための準備
//         //System.inは通常キーボードで標準入力するということ。
//         Scanner scn = new Scanner(System.in);
//         double a, b, wa, sa, seki, sho;

//         //キーボードから2つの値を入力する
//         //printlnではなくprintだけだと改行されない
//         System.out.print("1つ目の値を入れてください = ");
//         //next'変数の型'()メソッドは、キーボード入力した値を変数に格納するためのメソッド
//         a = scn.nextDouble();
//         System.out.print("2つ目の値を入れてください = ");
//         b = scn.nextDouble();

//         //四則計算する
//         wa = a + b;
//         sa = a - b;
//         seki = a * b;
//         sho = a / b;

//         //演算結果をconsoleに表示
//         System.out.println("加算結果は" + wa);
//         System.out.println("減算結果は" + sa);
//         System.out.println("乗算結果は" + seki);
//         System.out.println("除算結果は" + sho);
//     } 
// }



//BMIを求めるプログラム

import java.util.Scanner; //Scanner:キーボード入力するapi(import)

public class Sample1 {
    public static void main(String[] args){
        //キーボード入力するための準備
        //System.inは通常キーボードで標準入力するということ。
        Scanner scn = new Scanner(System.in);
        double bodyHeight, bodyWeight, conversion, bmi;

        //キーボードから2つの値を入力する
        //printlnではなくprintだけだと改行されない
        System.out.print("身長を入力してください = ");
        //next'変数の型'()メソッドは、キーボード入力した値を変数に格納するためのメソッド
        bodyHeight = scn.nextDouble();
        System.out.print("体重を入力してください = ");
        bodyWeight = scn.nextDouble();

        //体重÷身長(m)÷身長(m)
        //'bodyHeight = bodyHeight / 100'でbodyHeightを上書きした方が良い
        //上記のような、同じ変数に上書きする場合は、'bodyHeight /= 100'と省略して記述できる
        conversion = bodyHeight / 100;
        bmi = bodyWeight / conversion / conversion;

        //演算結果をconsoleに表示
        System.out.println("BMIは" + bmi);
    } 
}