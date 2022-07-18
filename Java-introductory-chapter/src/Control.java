// for, while, switch, break, continue, 変数スコープ

public class Control{
    public static void main(String[] args){
        // if else for
        int age_a = 2;
        int age_b = 12;
        int age_c = 25;
        String person = "";
        int age;

        for(int i=0;i<3;i++){
            if(i == 0){
                age = age_a;
                person = "aさん";
            }else if(i == 1){
                age = age_b;
                person = "bさん";
            }else{
                age = age_c;
                person = "cさん";
            }

            if(age < 4){
                System.out.println(person+"は入場料は無料です");
            }else if(age < 13){
                System.out.println(person+"は子供料金です");
            }else{
                System.out.println(person+"は大人料金です");
            }
        }

        // switch
        // breakを入れないと次のケースを実行する。
        int score = 3;
        switch(score){
            case 1:
                System.out.println("もっと頑張りましょう");
                break;
            case 2:
                System.out.println("頑張りましょう");
                break;
            case 3:
                System.out.println("普通です");
                break;
            case 4:
                System.out.println("よくできました");
                break;
            case 5:
                System.out.println("大変良くできました");
                break;
            default:
                System.out.println("想定外の点数です");
                break;
        }
        System.out.println("switchブロックを抜けました");

        // 3項演算子
        // 条件式 ? a : b 
        // trueならa, falseならb
        int a = (age_a > age_b) ? age_a : age_b;
        System.out.println(a);
        int b = (age_a < age_b) ? age_a : age_b;
        System.out.println(b);

    }
}