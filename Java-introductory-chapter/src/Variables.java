// 型、型変換、代入

public class Variables {
    public static void main(String[] args){
        int i;
        i = 5;
        System.out.println("i = " + i);
        System.out.printf("i = %d\n", i);
        // 変数の型
        // char (1文字、16ビット、Unicode)
        // boolean (true or false)
        // byte (8ビット、符号付き整数)
        // short (16ビット、符号付き整数)
        // int (32ビット、符号付き整数)
        // long (64ビット、符号付き整数)
        // float (32ビット、符号付き浮動小数点)
        // double (64ビット、符号付き浮動小数点)

        // 型変換
        // 数値の型変換には (型名)変数名
        // double > float > long > int > short > byte
        int a = 1;
        double d = 9.8;
        System.out.println("a = " + a + " d = " + d );
        double b = (double)a;
        System.out.println("b = " + b);

        // String型は文字列
        // 文字列連結は単純に+を使えばいい
        String h = "hello";
        String w = "world";
        String hw = h + w;
        System.out.println(hw);
    }    
}
