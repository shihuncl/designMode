package proxy.cglibproxy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by cl on 2019/4/20.
 */
public class CGlibMeipo {

    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i < 5; i++) {
            HashMap<Integer, String> map = new HashMap<>();
            map.put(i, "数据" + i);
            list.add(map);
        }
        for (int i = 0; i < list.size(); i++) {
            HashMap<Integer, String> maps = (HashMap<Integer, String>) list.get(i);
            System.out.println(maps.get(i));
        }
    }
}
