// import java.lang.*; は自動的に行われている(*でパッケージ内のクラスをすべてインポートしている)
import java.util.Random;
// java.utilとjava.util.zipは別パッケージとして扱われるので、個々にimportする必要がある。
import java.util.*; 
import java.util.zip.*;

public class Ch1{
    public static void main(String[] args){
        Random rand = new Random();
        System.out.println("Random() = " + rand);
        System.out.println("rand.nextDouble() = " + rand.nextDouble());

        // Stringクラスについて
        // Stringオブジェクトの生成方法による違い
        String s1 = new String("hello");
        String s2 = new String("hello");
        // 変数はそれぞれ異なるインスタンスを参照してその値を表示している
        System.out.println("s1 = " + s1 + ", s2 = " + s2);
        System.out.println(s1 == s2);

        String str1 = "hello";
        String str2 = "hello";
        // こちらは単純に変数に格納された値の比較をしているだけ
        System.out.println("str1 = " + str1 + ", str2 = " + str2);
        System.out.println(str1 == str2);

        // Stringクラスのメソッド==========================================================
        // length()
        String str = "Study java";
        System.out.println("study java の文字列の長さ"+str.length());
        // indexOf(String str)
        // 配列の番地のように数えている。何文字目が起点かを返している。
        System.out.println("単純にaを知らべた："+str.indexOf("a"));
        System.out.println("indexOf(\"java\");"+str.indexOf("java"));
        System.out.println("先頭は何文字目なのか："+str.indexOf("S"));
        System.out.println("小文字と大文字を区別するのか："+str.indexOf("s"));
        System.out.println("含まれない文字なら："+str.indexOf("9"));
        // boolean contains(CharSequence s)
        // 引数で指定された文字列を含むときにTrueを返す
        System.out.println("avaを含む？"+ str.contains("ava"));
        System.out.println("含まない文字："+ str.contains("-"));
        // replace(CharSequence target, CharSequence replacement)
        // targetで指定した文字列が内部に含まれる場合は、その文字列をreplacementに置換した結果を返す（別に変数の中身に代入されるわけじゃない）
        System.out.println("javaをじゃばに置き換えた："+str.replace("java", "じゃば"));
        System.out.println("文字列がなかったら？"+str.replace("banana", "ばなな"));
        // String[] split(String regex)
        // 引数に指定された正規表現に一致する位置で文字列を分割し、結果を文字列の配列で返す
        // スペースなんかを正規表現とすると当たり前のようにスペースが消えて格納されていくのがわかるけど、2なんかを分割のための正規表現にすると2がなくなってなんか不自然だね。
        String willSplit = "2022/12/24";
        System.out.println("今から分割していく文字列は、"+willSplit);
        String[] splited1 = willSplit.split("/");
        String[] splited2 = willSplit.split("2");
        for(int i=0;i<splited1.length;i++){
            System.out.println("sprited["+ i +"] = " + splited1[i]);
        }
        for(int i=0;i<splited2.length;i++){
            System.out.println("sprited["+ i +"] = " + splited2[i]);
        }

        // Mathクラス==========================================================
        // java.langパッケージのクラス
        
    }
}