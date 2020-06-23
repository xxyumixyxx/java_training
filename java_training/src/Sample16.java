// // Employeeクラスの定義
// class Employee {
//     private String name;
//     private int salary;
//     private int number;
//     // フィールドの値を表示する
//     public void show(){
//         System.out.println("私の名前は" + this.name + "です");
//         System.out.println("私の給与は" + this.salary + "です");
//         System.out.println("私の社員番号は" + this.number + "です");
//         System.out.println();

//     }
//     //コンストラクタ(フィールド変数の初期値の指定)
//     //引数はクラスのフィールド変数と同じ名前でなくてはならない
//     public Employee (String name,int salary,int number){
//         // "this.name"はフィールド変数(メンバ変数)のname
//         this.name = name;
//         this.salary = salary;
//         this.number = number;
//     }

// }

// // Employeeクラスを呼びだしてテスト
// public class Sample16 {
//     public static void main(String[] args){
//         //インスタンスする
//         Employee tanaka = new Employee("田中",200000,120);
//         Employee koike = new Employee("小池",300000,220);

//         tanaka.show();
//         koike.show();
//     }
    

// }