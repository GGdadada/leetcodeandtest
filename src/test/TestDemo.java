package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @Package: test <br>
 * @description: 方法描述
 * @ClassName: TestDemo <br>
 * @Author: zyw <br>
 * @CreateDate: 2021/3/25 11:14 <br>
 */
public class TestDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add((int) (Math.random() * 100));
        }
        Collections.sort(list);
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
