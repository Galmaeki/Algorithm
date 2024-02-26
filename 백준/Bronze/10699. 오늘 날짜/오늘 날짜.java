import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        DateFormat df = new SimpleDateFormat("YYYY-MM-dd");
        df.setTimeZone(TimeZone.getTimeZone("Asia/Seoul"));
        System.out.println(df.format(new Date()));
    }
}