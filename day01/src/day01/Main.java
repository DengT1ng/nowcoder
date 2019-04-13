package day01;

import java.util.*;

public class Main {
    public static void demoString(){
        String s = "hello world";
        System.out.println(s.indexOf("e"));//1
        System.out.println(s.charAt(0));//h
        System.out.println(s.codePointAt(1));//101
        System.out.println(s.compareTo("hello myworld"));//10,两个字符串进行比较，返回值为第一个不相等值的ASSCI值的差
        System.out.println(s.concat("dt"));//hello worlddt 追加字符串
        System.out.println(s.lastIndexOf('h'));
    }
    public static void demoList(){
        List<String> list = new ArrayList<>();
        for(int i=0;i<4;i++){
            list.add(String.valueOf(i));
        }
        System.out.println(list);
        List<String> list1 = new ArrayList<>();
        for(int i=0;i<4;i++){
            list1.add(String.valueOf(i*2));
        }
        System.out.println(list1);
        list.addAll(list1);
        System.out.println(list);
        Collections.sort(list);//顺序排序
        System.out.println(list);
        Collections.reverse(list);//逆序
        System.out.println(list);
        //自定义排序，逆序
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(list);
    }

    public static void demoSet(){
        Set<String> set = new HashSet<>();
        for(int i=0;i<3;i++){
            set.add(String.valueOf(i));
        }
        System.out.println(set);
        set.remove("0");
        System.out.println(set);
        System.out.println(set.contains("2"));
    }
    public static void docommon(){
        Random r = new Random();
        r.setSeed(1);//设定随机数的种子，若中子数相同，则产生的随机数也一样
        for(int i=0;i<3;i++){
            System.out.println(r.nextInt(100));
        }
        List<Integer> array = Arrays.asList(new Integer[]{1,2,3,4,5});
        System.out.println(array);
        Collections.shuffle(array);
        System.out.println(array);
    }
    public static void main(String[] args ){
        //System.out.println("hello idea");
        //demoString();
        //demoList();
//        demoSet();
          docommon();
    }
}
