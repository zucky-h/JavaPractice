/*
    Javaはオブジェクト指向型の言語
    クラスはオブジェクトの属性や機能を定義したもの
    クラスの宣言の中でオブジェクトの持つ情報を定義したものがフィールド、機能を定義したものがメソッド
    newを使ってクラスのインスタンスを生成する
    変数の方を大別すると、intやdoubleなどの基本型と、インスタンスの所在地情報を格納する参照型がある 
*/

public class Practice5 {
    public static void main(String[] args){
        Person a = new Person();
        a.name = "taro";
        a.age = 19;
        Person b = new Person();
        b.name = "jiro";
        b.age = 18;

        printInfo(a);
        printInfo(b);
        System.out.println("20歳より若い？" + ageCheck(a, 20));
        printYoungerPersonName(a, b);
        System.out.println("合計は" + getTotalAge(a, b));
    }
        // メソッドを追加する
        // printInfo, Person p , void
        public static void printInfo(Person p){
            System.out.println("name:" + p.name);
            System.out.println("age:" + p.age);
        }
       
        // ageCheck, Person p, int i, boolean
        public static boolean ageCheck(Person p, int i){
            if(p.age < i){
                return true;
            }else{
                return false;
            }
        }

        // printYoungerPersonName, Person p1, Person p2, void
        public static void printYoungerPersonName(Person p1, Person p2){
            if(p1.age <= p2.age){
                System.out.println(p1.name);
            }else{
                System.out.println(p2.name);
            }
        }

        // getTotalAge, Person p1, Person p2, int
        public static int getTotalAge(Person p1, Person p2){
            return p1.age + p2.age;
        }
}

class Person{
    String name;
    int age;
}


