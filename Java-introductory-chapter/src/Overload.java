// overloadを使えば同じ名前のメソッドをいくつも作れる(引数を変える必要あり)
// 返り値を変更してもだめ。

public class Overload {
    public static void methodA(){
        System.out.println("引数はありません");    
    }
    public static void methodA(int a){
        System.out.println(a+"を受け取りました");    
    }
    public static void methodA(int a, int b){
        System.out.println(a+"と"+b+"を受け取りました");    
    }
    public static void methodA(double d){
        System.out.println(d+"を受け取りました");    
    }
    public static void methodA(String s){
        System.out.println(s+"を受け取りました");    
    }

    public static void main(String[] args){
        methodA();
        methodA(1);
        methodA(2,3);
        methodA(3.5);
        methodA("hogehoge");
    }
}
