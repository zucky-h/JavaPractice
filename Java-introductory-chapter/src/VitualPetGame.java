import java.util.Scanner;

public class VitualPetGame {

    public static VirtualDog createVirtualDog(VirtualDog newDog, Scanner in){
        System.out.println("新しいVirtualDogを作成します。");
        System.out.print("名前を入力 > ");
        newDog.name = in.next();
        System.out.print("最大体力を入力 > ");
        newDog.maxEnergy = in.nextInt();
        System.out.print("体力を入力 > ");
        newDog.energy = in.nextInt();
        return newDog;
    }

    public static void detailVirtualDog(VirtualDog dog){
        System.out.println("名前:" + dog.name);
        System.out.println("最大体力:" + dog.maxEnergy);
        System.out.println("体力:" + dog.energy);
    }

    public static void main(String[] args){
        // new Scannerはいくつも作るもんじゃない！
        Scanner in = new Scanner(System.in);
        VirtualDog taro = new VirtualDog();
        taro = createVirtualDog(taro, in);
        VirtualDog jiro = new VirtualDog();
        jiro = createVirtualDog(jiro, in);
        // taro 100 50, jiro 80 40;
        detailVirtualDog(taro);
        detailVirtualDog(jiro);

    }
}

class VirtualDog{
    String name;
    int maxEnergy;
    int energy;
}
