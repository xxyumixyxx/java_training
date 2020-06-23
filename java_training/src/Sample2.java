// // サンプル2　データ型と算術演算子
// import java.util.Scanner;

// public class Sample2 {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);

//         // // 台形の面積を計算する
//         // double jotei, katei, takasa, menseki;
//         // System.out.print("上底を入力してください = ");
//         // jotei = scn.nextDouble();
//         // System.out.print("下底を入力してください = ");
//         // katei = scn.nextDouble();
//         // System.out.print("高さを入力してください = ");
//         // takasa = scn.nextDouble();
//         // menseki = (jotei + katei) * takasa / 2.0;
//         // System.out.println("面積 = " + menseki);
//         // // printlnに引数がないときは、改行する
//         // System.out.println();

//         // 改造:三角形の面積を求める
//         double tate, yoko, menseki;
//         System.out.print("縦の長さを入力してください = ");
//         tate = scn.nextDouble();
//         System.out.print("横の長さを入力してください = ");
//         yoko = scn.nextDouble();
//         menseki = tate * yoko / 2.0;

//         System.out.println("面積 = " + menseki);
//         System.out.println();

//         // // お菓子の余りを求める
//         // int okasi, kodomo, amari;
//         // System.out.print("お菓子の数を入力してください = ");
//         // okasi = scn.nextInt();
//         // System.out.print("子供の人数を入力してください = ");
//         // kodomo = scn.nextInt();
//         // // 余りを計算したいときは"%" 整数の時のみ使える
//         // amari = okasi % kodomo;
//         // System.out.println("余り = " + amari);
//         // System.out.println();

//         // 改造:グループ人数を指定し、何人余るかを計算
//         int member, groupSize, group, residue;

//         System.out.print("全体の人数を入力してください = ");
//         member = scn.nextInt();
//         System.out.print("1グループあたりの人数を入力してください = ");
//         groupSize = scn.nextInt();

//         group = member / groupSize;
//         residue = member % groupSize;

//         System.out.println("グループは" + group + "グループできます。" );
//         System.out.println( residue + "人余ります。");
//         System.out.println();


//         // 残金の計算をする
//         int zankin, nyukin;
//         System.out.print("先月の残金を入力してください = ");
//         zankin = scn.nextInt();
//         System.out.print("今月の入金を入力してください = ");
//         nyukin = scn.nextInt();
//         zankin += nyukin;
//         System.out.println("更新後の残金 = " + zankin);
//     }
// }