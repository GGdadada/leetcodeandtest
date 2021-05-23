package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @Package: test <br>
 * @description: 方法描述
 * @ClassName: Testo2 <br>
 * @Author: zyw <br>
 * @CreateDate: 2021/3/28 17:09 <br>
 */
public class Test02 {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("1", "hhh");
        map.put("2", "ddd");
        map.put("3", "lll");

        Set<Entry<String, String>> entries = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next().getValue());
        }
    }
}
