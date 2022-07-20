//インスタンス変数はインスタンス生成時に実行されるコンストラクタ内で行えるが、
//クラス変数はインスタンスを生成する前から存在するので、フィールドでのクラス変数の宣言と同時に行う。

class Students{
    // クラス変数にはstaticが付き、Students.counterのように呼び出せる
    static int counter = 0;
    int id;
    String name;

    // コンストラクタはインスタンス生成時に自動的に実行される
    // これはthisを省略できる
    Students(int id, String name){
        System.out.println("Studentsクラスのコンストラクタが呼び出された");
        this.id = id;
        this.name = name;
    }

    // コンストラクタのオーバーロード
    Students(){
        System.out.println("引数のないコンストラクタ");
        this.id = 0;
        this.name = "未定";
    }
    Students(int id){
        System.out.println("idのみが引数のコンストラクタ");
        this.id = id;
        this.name = "未定";
    }
    Students(String name){
        System.out.println("nameのみが引数のコンストラクタ");
        this.id = 0;
        this.name = name;
    }

    //インスタンスメソッドの宣言
    // 戻り値の型 メソッド名(引数列){
    //     命令文
    //     return 戻り値;
    // }
    //インスタンスメソッドの場合は受け取る変数がインスタンス変数に限定されるので、thisを省略できる
    //コンストラクタでもインスタンス変数を限定できるなら省略できる
    void printInfo(){
        System.out.println("インスタンスメソッドの実行");
        System.out.println("学籍番号"+ this.id);
        System.out.println("名前"+ this.name);
    }
}

public class Constracter {
    public static void main(String[] args){
        // 他のクラスファイル内に同じクラスが入っててもエラーが出るっぽい！
        // コンストラクタがない場合のインスタンス生成方法
        // StudentCard a = new StudentCard();
        // a.id = 1111;
        // a.name = "hoge";

        // インスタンス生成を簡略化できる
        Students b = new Students(1234, "taro");
        System.out.println(b.id);
        System.out.println(b.name);
        
        Students c = new Students("taro");
        System.out.println(c.id);
        System.out.println(c.name);
        
        Students d = new Students(1234);
        System.out.println(d.id);
        System.out.println(d.name);

        Students e = new Students();
        e.printInfo();
    }
}

