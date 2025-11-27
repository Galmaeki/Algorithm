import javax.xml.namespace.QName;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str= br.readLine();
        while (str !=null){
            if(str.equals("end")) break;
            else if (str.equals("animal")) sb.append("Panthera tigris").append("\n");
            else if (str.equals("tree")) sb.append("Pinus densiflora").append("\n");
            else if (str.equals("flower")) sb.append("Forsythia koreana").append("\n");

     str = br.readLine();
        }

        System.out.println(sb);
    }
}
