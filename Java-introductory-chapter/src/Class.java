public class Class {
    public static void main(String[] args){
        // インスタンス化
        StudentCard a = new StudentCard();
        a.id = 1;
        a.name = "hoge";
        StudentCard b = new StudentCard();
        b.id = 2;
        b.name = "huga";
        StudentCard c = new StudentCard();
        c.id = 3;
        c.name = "moku";
        // インスタンスの参照先をd格納
        StudentCard d = c;

        System.out.println("これはインスタンスの参照先:" + a);
        System.out.println("aさんのid:" + a.id);
        System.out.println("bさんのid:" + b.id);
        System.out.println("cさんのid:" + c.id);
        System.out.println("dさんのid:" + d.id);
        System.out.println("aさんの名前:" + a.name);
        System.out.println("bさんの名前:" + b.name);
        System.out.println("cさんの名前:" + c.name);
        System.out.println("dさんの名前:" + d.name);
        d.id = 5;
        System.out.println("cさんのid:" + c.id);
        System.out.println("dさんのid:" + d.id);

        // インスタンスは配列にもできる
        // (要素数3のStudentcard型配列の宣言)
        StudentCard[] cards = new StudentCard[3];
        // まだ何も参照が入っていなければNULLが入る
        // ここで配列の各要素をインスタンス化
        cards[0] = new StudentCard();
        cards[1] = new StudentCard();
        cards[2] = new StudentCard();
        // まだ何も要素がはいいていない場合はNULLが入ってる
        cards[0].id = 6;
        cards[1].id = 7;
        cards[2].id = 8;
        cards[0].name = "taro";
        cards[1].name = "jiro";

        for(int i=0;i<3;i++){
            System.out.println("card" + i + "のID: " + cards[i].id);
            System.out.println("card" + i + "の名前: " + cards[i].name);
        }
    }
}

class StudentCard{
    int id;
    String name;
}