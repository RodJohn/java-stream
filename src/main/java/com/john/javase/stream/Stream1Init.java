package com.john.javase.stream;

import org.junit.Test;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream1Init {


    @Test
    //集合生成stream
    public void translate() {

        //数组
        String[] stringArray = {"aa", "bb", "cc"};
        Stream<String> stringStream = Stream.of(stringArray);

        //集合
        List<String> list = new ArrayList<>();
        Stream<String> streamList = list.stream();
        new HashSet<>().stream();

    }

    @Test
    public void ge(){

//        Stream.empty().forEach(item-> System.out.println(item));
//        Stream.generate(java.lang.Math::random).forEach(item-> System.out.println(item));
    }

    @Test
    /**
     *
     * 返回一个新的Stream
     */
    public void intermediate() {

        //filter 过滤
        User.users.filter(user -> user.getId() > 1);

        //排序 选取
        User.users.sorted(Comparator.comparing(User::getId).reversed()).skip(1).limit(1);

        //去重
        //使用equals方法
        User.users.distinct();

        //map 遍历和转换操作
        //转换为stream<Integer>
        User.users.map(User::getId);

    }


}
