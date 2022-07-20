// chapter6でバーチャルペットゲームにクラス内にメソッドを追加
// chapter7でバーチャルペットゲームに継承を追加
// virtualPetクラス
// コンストラクタ:String name, int maxEnergy, int energy
// フィールド:name,maxEnergy,energy
// メソッド:sleep(),printInfo()
// virtualDogクラス
// virtualPetクラスをsuperクラスとして継承
// walk()
// virtualBirdクラス
// virtualPetクラスをsuperクラスとして継承
// fly()

import java.util.Scanner;

public class VitualPetGame {
    // public static VirtualDog createVirtualDog(VirtualDog newDog, Scanner in){
    //     System.out.println("新しいVirtualDogを作成します。");
    //     System.out.print("名前を入力 > ");
    //     newDog.name = in.next();
    //     System.out.print("最大体力を入力 > ");
    //     newDog.maxEnergy = in.nextInt();
    //     System.out.print("体力を入力 > ");
    //     newDog.energy = in.nextInt();
    //     return newDog;
    // }
    // public static void detailVirtualDog(VirtualDog dog){
    //     System.out.println("名前:" + dog.name);
    //     System.out.println("最大体力:" + dog.maxEnergy);
    //     System.out.println("体力:" + dog.energy);
    // }
    public static void moveAndSleep(VirtualPet pet){
        pet.move();
        pet.sleep();
    }
    public static void main(String[] args){
        // new Scannerはいくつも作るもんじゃない！
        // Scanner in = new Scanner(System.in);
        // VirtualDog taro = new VirtualDog();
        // taro = createVirtualDog(taro, in);
        // VirtualDog jiro = new VirtualDog();
        // jiro = createVirtualDog(jiro, in);
        // // taro 100 50, jiro 80 40;
        // detailVirtualDog(taro);
        // detailVirtualDog(jiro);
        VirtualDog taro = new VirtualDog("taro", 100, 50);
        VirtualDog jiro = new VirtualDog("jiro", 80, 40);
        VirtualBird piyo = new VirtualBird("piyo", 60, 50);
        taro.move();
        taro.move();
        taro.move();
        taro.move();
        taro.move();
        piyo.move();
        moveAndSleep(taro);
        moveAndSleep(piyo);
        jiro.sleep();
        piyo.sleep();
        taro.printInfo();
        jiro.printInfo();
        piyo.printInfo();
    }
}

class VirtualPet{
    String name;
    int maxEnergy;
    int energy;

    //デフォルトコンストラクターをつくるか、明示的にサブクラスにコンストラクターを継承する
    //デフォルトコンストラクターは初期値が入ってくるのでこのプログラムではちょっと使い勝手がわるい？
    VirtualPet(){
        this.name = "名前";
        this.maxEnergy = 0;
        this.energy = 0;
    }

    VirtualPet(String name, int maxEnergy, int energy){
        this.name=name;
        this.maxEnergy=maxEnergy;
        this.energy=energy;
    }

    void sleep(){
        System.out.println(this.name + "よく寝た。体力が回復したよ。");
        this.energy = this.maxEnergy;
    }
    void printInfo(){
        System.out.println("[状態出力]");
        System.out.println("名前："+this.name);
        System.out.println("最大体力："+this.maxEnergy);
        System.out.println("体力："+this.energy);
    }
    //それぞれのサブクラスでmove()をオーバーライドさせて使うので、ここでは何もしない
    void move(){

    }
}

class VirtualDog extends VirtualPet{

    VirtualDog(String name, int maxEnergy, int energy){
        super(name,maxEnergy,energy);
    }
    void move(){
        if(this.energy < 10){
            System.out.println("疲れちゃってこれ以上歩けないよ");
        }else{
            System.out.println(this.name+"歩いたよ。体力が10減った、最大体力が1増えた");
            this.energy -= 10;
            this.maxEnergy +=1;
        }
    }
}
// virtualPetクラスをsuperクラスとして継承

class VirtualBird extends VirtualPet{

    VirtualBird(String name, int maxEnergy, int energy){
        super(name, maxEnergy, energy);
    }

    void move(){
        if(this.energy < 10){
            System.out.println("疲れちゃってこれ以上飛べないよ");
        }else{
            System.out.println(this.name+"飛んだよ。体力が10減った、最大体力が1増えた");
            this.energy -= 10;
            this.maxEnergy +=1;
        }
    }
}