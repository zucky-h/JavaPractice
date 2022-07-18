public class Practice3 {
    public static void main(String[] args){
        // 3で割り切れるかどうかを出力するプログラム
        int a = 2021;
        if(a%3==0){
            System.out.println("割り切れます");
        }else{
            System.out.println("割り切れません");
        }

        // 10から20までの和を計算して出力するプログラム(forとwhileとdo-while)
        int a_for = 0;
        for(int i=10;i<=20;i++){
            a_for += i;
        }
        int a_while = 0;
        int j = 10;
        while(j>=10 && j<=20){
            a_while += j;
            j++;
        }
        int a_do_while = 0;
        int k = 10;
        do{
            a_do_while += k;
            k++;
        }while(k>=10 && k<=20);
        System.out.println(a_for);
        System.out.println(a_while);
        System.out.println(a_do_while);

        // 点数に基づいて分布図を出力するプログラム
        int[] scores = {3,6,8,2,4,8,7,1,9};
        for(int i=0;i<scores.length;i++){
            System.out.printf("%d人目 : ", i+1);
            for(int m=0;m<scores[i];m++){
                System.out.printf("*");
            }
            System.out.println("");
        }
    }
}
