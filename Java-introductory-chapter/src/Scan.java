import java.util.Scanner;

public class Scan {
    public static void main(String[] args){
        System.out.println("いくつからカウントダウンしますか？");
        System.out.print("> ");
        try (Scanner in = new Scanner(System.in)) {
            int i = in.nextInt();
            System.out.println(i+"からカウントダウンします");
        }
    }
}

// int 変数名 = in.nextInt();
// double 変数名 = in.nextDouble();
// String 変数名 = in.next();