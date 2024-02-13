package OOPs;

import java.util.Scanner;

public class InterQ2_gearSpeed {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        allVehicles bicycles=new allVehicles();
        allVehicles bike=new allVehicles();
        allVehicles car=new allVehicles();

        System.out.println("which vehicle do you have:  bicycles[1] , bike[2] , car[3] ");
        int ops=sc.nextInt();
        sc.nextLine();

        switch(ops){
            case 1:
                bicycles.gearChange();
                bicycles.speedup();
                bicycles.applyBreak();
                bicycles.displayBicycle();
                break;
            case 2:
                bike.gearChange();
                bike.speedup();
                bike.applyBreak();
                bike.displayBike();
                break;
            case 3:
                car.gearChange();
                car.speedup();
                car.applyBreak();
                car.displayCar();
                break;
            default:
                System.out.println("invalid option");
                break;
        }
        sc.close();
    }
}
interface vehicles{
    Scanner sc=new Scanner(System.in);
    void gearChange();
    void speedup();
    void applyBreak();
}
class allVehicles implements vehicles{
    int g,sp=0;
    @Override
    public void gearChange() {
        String c;
        int gear=0;
        System.out.println("------------------------------------------------------");
        do{
            System.out.print("do you want to change the gear (Y/N) ");
            c=sc.nextLine();
            if(c.equals("y") || c.equals("Y")){
                System.out.println("Sift gear to : ");
                gear=sc.nextInt();
            }
            else {
                break;
            }
            g=gear;
            System.out.println("gear is in " + g);
            sc.nextLine();
        }while(c != "n" || c != "N");
    }
    @Override
    public void speedup() {
        String c;
        int speed=0;
        System.out.println("--------------------------------------");
        do{
            System.out.println("do you want to increase the speed: (Y/N) ");
            c=sc.nextLine();
            if(c.equals("y") || c.equals("Y")){
                System.out.println("speed increase by : ");
                speed=sc.nextInt();
            }
            else{
                break;
            }
            sp+=speed;
            System.out.println("Speed is in : "+ sp);
            sc.nextLine();
        }while(c!="n" || c!="N");
    }
    @Override
    public void applyBreak() {
        String c;
        int speed=0;
        System.out.println("------------------------------------------------");
        do{
            System.out.println("do you want to apply break: (Y/N)");
            c=sc.nextLine();
            if(c.equals("Y") || c.equals("y")){
                System.out.println("speed decrease by: ");
                speed=sc.nextInt();
            }
            else {
                break;
            }
            sp-=speed;
            System.out.println("speed is in " + sp);
            sc.nextLine();
        }while(c!="n" || c!="N");
    }
    void displayBike(){
        System.out.println("----------------------------------------");
        System.out.println("gear is in " + g + " speed : " + sp);
    }
    void displayCar(){
        System.out.println("----------------------------------------");
        System.out.println("gear is in " + g + " speed : " + sp);
    }
    void displayBicycle(){
        System.out.println("----------------------------------------");
        System.out.println("gear is in " + g + " speed : " + sp);
    }
}