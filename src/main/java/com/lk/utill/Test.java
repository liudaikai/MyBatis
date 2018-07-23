package com.lk.utill;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {


    public static void main(String[] args) {
        ThreadLocal<Map<String, String>> threadLocal = new ThreadLocal();
        Map<String, String> maps = new HashMap<String, String>() {{
            put("zhangsan", "lisiwww");
            put("zhangsan000000", "lisi7845www");
            put("zha0124545ngsan", "lisiw02255ww");
        }};
        threadLocal.set(maps);
        ThreadLocal<List<String>> threadLocalList = new ThreadLocal();
        List<String> lists = new ArrayList<String>() {{
            add("qwwweweqqqqqq2222");
            add("qww111weweqqqqqq2222");
            add("qwww44444eweqqqqqq2222");
        }};
        threadLocalList.set(lists);
        ThreadLocalUtil.dumpThreadDetails();
    }


}
