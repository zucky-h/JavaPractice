// 指定されたメソッドを作成する
// printHello, int count, void
// getRectangleArea, double width, double height, double
// getMessage, String name, String
// getAbsoluteValue, int value, int
// getAverage, double a, double b, double c, double
// isSameAbsoluteValue, int i, int j, boolean

public class Practice4 {
    public static void printHello(int count){
        for(int i=count;i>=0;i--){
            System.out.print("Hello! ");
        }
    }

    public static double getRectangleArea(double width, double height){
        double Area = width * height;
        return Area;
    }

    public static String getMessage(String name){
        String message = "こんにちは" + name + "さん。";
        return message;
    }
    
    public static int getAbsoluteValue(int value){
        value = (value < 0) ? value *= -1 : value;
        return value;
    }

    public static double getAverage(double a, double b, double c){
        double sum = a + b + c;
        double ave = sum / 3.0;
        return ave;
    }

    public static boolean isSameAbsoluteValue(int i, int j){
        if(getAbsoluteValue(i)==getAbsoluteValue(j)){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args){
        printHello(3);
        System.out.println(getRectangleArea(2.5, 1.5));
        System.out.println(getMessage("hoge"));
        System.out.println(getAbsoluteValue(-1));
        System.out.println(getAbsoluteValue(0));
        System.out.println(getAverage(4.7, 2.68, 10.5));
        System.out.println(isSameAbsoluteValue(2, -3));
        System.out.println(isSameAbsoluteValue(5, -5));
    }
}
