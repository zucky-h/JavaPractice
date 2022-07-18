public class Class {    
    public static void methodA(){
        System.out.println("here is methodA");
        System.out.println("call methodB");
        methodB();
        System.out.println("fin methodA");
    }
    
    public static void methodB(){
        System.out.println("here is methodB");
        System.out.println("fin methodB");
    }

    // 引数ありのメソッド
    public static void countdown(int start){
        System.out.println("here is countdown");
        for(int i=start;i>=0;i--){
            System.out.printf("%d ", i);
        }
        System.out.println("");
    }
    //mainメソッドの引数は、コマンド実行時の引数
    public static void main(String[] args){
        System.out.println("here is main method");
        System.out.println("call methodA");
        methodA();
    
        countdown(3);
        countdown(6);
        System.out.println("fin main method");
    }
}
