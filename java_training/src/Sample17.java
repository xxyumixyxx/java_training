//メソッドのオーバーロード(多重定義):同じメソッド名で異なる引数を一つのクラスに複数用意して使うこと。
class Employee {
    //newに関係なくメモリ上にある場合には"static"をつける
    //全員が同じ情報を所有したい場合などに使用する。 staticなものとそうでないものを混在できる
    private static int number = 0; //社員数(社員全体が同じ情報を持つ)=Employeeクラス自体が保持してる
    private String name;
    private int salary;
    // フィールドの値を表示する
    public void show(){
        System.out.println("私の名前は" + this.name + "です");
        System.out.println("私の給与は" + this.salary + "です");
        System.out.println();

    }

    //コンストラクタ(フィールド変数の初期値の指定)
    //引数はクラスのフィールド変数と同じ名前でなくてはならない
    public Employee (String name, int salary){
        // "this.name"はフィールド変数(メンバ変数)のname
        this.name = name;
        this.salary = salary;
        //newされた=社員数が増えた　ということなのでnewされるごとにインクリメントしていけば良い
        Employee.number++;
    }

    //社員数を表示するクラスメソッド(privateでフィールド変数を定義してるので、staticのクラスメソッドを作成)
    public static void showNumber(){
        System.out.println("現在の社員数は" + Employee.number + "人です");
    }
}

public class Sample17{
    public static void main(String[] args){
        //初期状態の社員数の確認
        Employee.showNumber();

        Employee tanaka = new Employee("田中", 200000);
        tanaka.show();
        Employee.showNumber();

        Employee yamakawa = new Employee("山川", 200000);
        yamakawa.show();
        Employee.showNumber();
    }
}