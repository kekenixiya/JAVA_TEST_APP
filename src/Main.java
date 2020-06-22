import java.io.UnsupportedEncodingException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws UnsupportedEncodingException {
//        System.out.println("Hello World!");
//        Calendar  calendar = Calendar.getInstance();
//        calendar.setTime(new Date());
//        calendar.add(Calendar.DATE,1);
//
//        System.out.println(calendar.getTime());
//        System.out.println((8&-8)==8);

//        Map map = new HashMap();
//        map.put("a","a");
//
//        int core = Runtime.getRuntime().availableProcessors();
//        System.out.println(core);

//        float[][] f = new float[6][];

        char a = 'a';

        byte[] aa = "好".getBytes();
        //
        byte[] bb = {-26,-65,-126,-17,-65,-67};
        byte[] cc = {-26,-65,-126};
        System.out.println(new String(bb,"utf-8"));
        System.out.println(aa.length);

    }
}

