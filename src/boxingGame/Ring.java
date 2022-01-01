package boxingGame;

import java.util.Random;

public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }


    void run(){
        if(checkWeight()){
            while (this.f1.health > 0 && this.f2.health > 0){
                System.out.println("=====YENI ROUND=====");
                if(whoFirst()){
                    this.f2.health = this.f1.hit(f2);
                    if(isWin()){
                        break;
                    }
                }
                this.f1.health = this.f2.hit(f1);
                if(isWin()){
                    break;
                }
                System.out.println(this.f1.name + " Saglık: " + this.f1.health);
                System.out.println(this.f2.name + " Saglık: " + this.f2.health);
            }
        }else{
            System.out.println("Sporcuların sikletleri uyuşmuyor...");
        }
    }


    public boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    public boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Maçı Kazanan : " + f2.name);
            return true;
        } else if (f2.health == 0){
            System.out.println("Maçı Kazanan : " + f2.name);
            return true;
        }

        return false;
    }
    boolean whoFirst(){
        Random ran = new Random();
        int x = ran.nextInt(2); //Generate 0 or 1
        if(x == f1.first){
            return true;
        }
        return false;
    }



    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Kalan Can \t:" + f1.health);
        System.out.println(f2.name + " Kalan Can \t:" + f2.health);
    }
}
