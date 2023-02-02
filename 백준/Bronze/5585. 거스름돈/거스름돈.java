import java.util.*;
public class Main{
    public static void main(String[] args){
        int count=0;
        Scanner sc= new Scanner(System.in);
        int money = 1000-sc.nextInt();
        while(money>=500){
            money-=500;
            count++;
        }
        while(money>=100){
            money-=100;
            count++;
        }
        while(money>=50){
            money-=50;
            count++;
        }
        while(money>=10){
            money-=10;
            count++;
        }
        while(money>=5){
            money-=5;
            count++;
        }
        count+=money;
        System.out.println(count);
    }
}