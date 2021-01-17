package blackhouse.java基础.多线程.线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {

    public static void main(String[] args) {
        //使用线程池的工厂类Executor里面提供的静态方法newFixedThreadPool成产一个指定线程数量的线程池
        ExecutorService es = Executors.newFixedThreadPool(2);
        //调用ExecutorService中的方法submit,传递线程任务,开启线程.
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        es.shutdown();
    }

}
