package blackhouse.java基础.异常处理.Demo01.Exception;

public class Demo01Exception {
    public static void main(String[] args) {
        //编译异常
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        Date date = null;
//        try{
//            date = sdf.parse("1999-0909");
//        }catch (ParseException e){
//            e.printStackTrace();
//        }
//        System.out.println(date);


        //运行期异常
//        int [] arr = {1,2,3};
//        try {
//            System.out.println(arr[3]);
//        }catch (Exception e){
//            System.out.println(e);
//        }
//错误,创建的数组过大;

        int[] arr = new int[1024];
        System.out.println("asdf");

    }
}
