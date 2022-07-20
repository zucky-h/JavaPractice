//widthとheightの情報を持つRectangleクラスを次のように宣言した
// class Rectangle{
//     double width;
//     double height;
// }
//以下の問に答えよ
// 1. 幅と高さを引数で指定できるコンストラクタ
// 2. 面積を戻り値とするインスタンスメソッドgetAreaの作成
// 3. 引数で渡されたRectangreオブジェクトを比較して、自分の面積のほうが
//    大きければTrue、小さければFalseを返すisLargerというインスタンスメソッド
// 4. 上の3つの動作が正しく動くかどうかのチェック

class Rectangle{
    double width;
    double height;
    
    // コンストラクタ
    Rectangle(double w, double h){
        width = w;
        height = h;
    }
    // インスタンスメソッド1
    double getArea(){
        double area = width * height;
        return area;
    }
    // インスタンスメソッド2
    boolean isLarger(Rectangle rec){
        double myArea = this.getArea();
        double comArea = rec.getArea();
        if(myArea>=comArea){
            return true;
        }else{
            return false;
        }
    }

}

public class Practice6 {
    public static void main(String[] args){
        Rectangle a = new Rectangle(5.4, 2.3);
        Rectangle b = new Rectangle(3.3, 2.8);

        System.out.println("aの面積は"+a.getArea());
        System.out.println("bの面積は"+b.getArea());
        if(a.isLarger(b)){
            System.out.println("aのほうが大きいみたい");
        }else{
            System.out.println("bのほうが大きいみたい");
        }
    }    
}
