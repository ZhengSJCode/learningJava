import java.util.HashMap;
import java.util.concurrent.ThreadPoolExecutor;

public class HelloByteCode {
    public static void main(String[] args) {
//        System.getProperties().list(System.out);
        System.getProperty("os");
        System.out.println(args.length);
        HashMap map = new HashMap();
        for (int i = 0; i < 100000000; i++) {
            map.put(i,1 + i);
//            System.out.println(args[i]);
        }
//        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor();
        HelloByteCode obj = new HelloByteCode();
    }
}


