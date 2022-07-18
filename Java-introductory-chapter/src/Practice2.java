public class Practice2 {
    public static void main(String[] args){
        // 5*3.14
        System.out.println(5 * 3.14);

        // ちょっとした計算の結果はどうなる？
        int i = 2;
        int j = 5;
        j *= i;
        int k = j;
        k /= 2;
        System.out.println(k);

        // 変数に格納された7と2で割り算をして3.5にするには？
        int a = 7;
        int b = 2;
        System.out.println(a/b);
        double c = (double)a / (double)b;
        System.out.println(c);
    }
}
