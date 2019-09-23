package com.wugufengdeng.daydayup.jdk8demo;

import java.util.*;
import java.util.function.Predicate;

public class LambdaDemo {
    public static void main(String[] args) {
//        testRunnable();
//        testSort();
        testList();
    }

    public static void testList(){
        List<String> languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");
        Predicate p = (n) -> ((String)n).startsWith("J");
        p = p.or((n) -> ((String)n).startsWith("H"));
        languages.stream().filter(p).forEach((name -> System.out.println(name)));


    }

    public static void testSort(){
        List<Integer> list = new ArrayList<>(16);
        list.add(1);
        list.add(3);
        list.add(2);

        Collections.sort(list, (o1, o2) -> o2-o1);
        System.out.println("list:"+list);

        List<Integer> list2 = new ArrayList<>(16);
        list2.add(1);
        list2.add(5);
        list2.add(2);
        Collections.sort(list2, Comparator.comparingInt(x -> x));
        System.out.println("list2:"+list2);
    }

    public static void testRunnable(){
        new Thread(new Runnable() {
            public void run() {
                System.out.println("111");
            }
        }).start();

        new Thread(() -> System.out.println("222")).start();
    }
}