package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @program: gradle-test
 * @description:
 * @author: qiankeqin
 * @create: 2018-08-04 15:08
 **/
public class StreamTest10 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(5000000);
        for(int i=0;i<5000000;i++){
            list.add(UUID.randomUUID().toString());
        }
        System.out.println("开始排序");
        long starttime = System.nanoTime();//纳秒
        list.parallelStream().sorted().count();
        long endtime = System.nanoTime();
        long millis = TimeUnit.NANOSECONDS.toMillis(endtime-starttime);
        System.out.println("排序耗时:"+millis);
    }
}
