// 配列、配列の要素、インデックス、多次元配列、疑似乱数

public class Array {
    public static void main(String[] args){
        int[] scores;
        scores = new int[5];
        scores[0] = 50;
        scores[1] = 55;
        scores[2] = 70;
        scores[3] = 43;
        scores[4] = 92;
     
        for(int i = 0;i<5;i++){
            System.out.println(scores[i]);
        }

        int[] scores2 = {23,45,67,89,12};
        // array.lengthで配列の長さ
        for(int i=0;i<scores2.length;i++){
            System.out.println(scores2[i]);
        }

        //int[][] scores3;
        //scores3 = new int[3][5];
        int[][] scores3 = {
            {12,23,34,45,56},
            {98,87,76,65,54},
            {13,24,35,56,67}
        };
        System.out.println(scores3[1][3]);

        // 乱数
        double d = Math.random();
        System.out.println("d = "+ d);
    }
}
