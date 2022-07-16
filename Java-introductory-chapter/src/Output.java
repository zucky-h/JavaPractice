public class Output {
    public static void main(String[] args){
        // System(クラス).out(フィールド).println(メソッド)
        // System(クラス).out(フィールド).print(メソッド)
        // System(クラス).out(フィールド).printf(メソッド)
        /* println
            unixコマンドのechoとほぼ同じ

        */
        System.out.println("こんにちは！");
        System.out.println("HelloWorld!!");
        /* print
            unixコマンドのprintと同じ
        */
        System.out.print("こんにちは！");
        System.out.print("HelloWorld!!");
        /* printf
            c言語のprintfと同じ
            フォーマッティングが可能
        */
        System.out.printf("こんにちは！");
        System.out.printf("HelloWorld!!");
    }
}
