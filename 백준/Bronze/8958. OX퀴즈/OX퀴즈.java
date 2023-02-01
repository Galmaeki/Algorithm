import java.util.*;
public class Main{
public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int player = sc.nextInt();
            for(int j=0;j<player;j++){
            String ox=sc.next();
            sc.nextLine();
            int anscount = 0,answer=0;
            for(int i =0;i<ox.length();i++){
                if(ox.charAt(i)=='X')
                {
                    anscount =0;
                }else{
                    anscount++;
                    answer+=anscount;
                }
            }
            System.out.println(answer);
            }
            sc.close();
        }
}