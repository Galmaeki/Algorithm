import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int boxes = 0;
        int left = 0;

        String[] n = br.readLine().split(" ");
        int book = Integer.parseInt(n[0]);
        int limit = Integer.parseInt(n[1]);
        if(book!=0){
        left = limit;

        String[] books = br.readLine().split(" ");

        for (int i = 0; i < book; i++) {
            int thisBook = Integer.parseInt(books[i]);
            if(left<thisBook){
                left = limit;
                boxes++;
            }
            else {
                if(left==limit){
                    boxes++;
                }
                left -=thisBook;
                if(left ==0||(i+1!=book&&left<Integer.parseInt(books[i+1])))
                    left = limit;
            }
        }

        System.out.println(boxes);}
        else
            System.out.println(0);
    }
}