package main.java;

public class HelloWorld {
    String str = new String("good");
    char[] ch = {'a','b','c'};

    public static void main(String[] args) {
        HelloWorld hw = new HelloWorld();
        hw.exchange(hw.str,hw.ch);
        System.out.println(hw.str+"   "+hw.ch);
        System.out.println( hw.ch);
    }

    public void exchange(String str,char[] ch){
        str = "test ok";
        ch[0] = 'g';
    }
}
