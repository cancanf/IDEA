package 课堂代码.类和对象;

public class Example {
    String str = new String("good");
    //    String str1 = "bad";
    char[] ch = {'a', 'b', 'c'};

    public static void main(String args[]) {
        Example ex = new Example();
        int i = 10;
        int[] a = {1, 1, 1};
        ex.change(ex.str, ex.ch, i, a);
        System.out.println(ex.str + " and ");

//        ex.change(ex.str1,ex.ch,i,a);
//        System.out.println(ex.str1 + " and ");

        System.out.println(ex.ch);
        System.out.println(i);
        System.out.println(a[0]);
    }

    public void change(String a, char[] ch, int i, int[] ints) {
        a = "test ok";
        i = 20;
        ch[0] = 'g';
        ints[0] = 3;
    }
}
