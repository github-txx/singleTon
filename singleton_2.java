/**
 * 单例模式：2、饿汉式单例模式：急切的创建实例，而不用延迟实例化
 * 分析：对静态变量初始化，JVM在类加载时就马上创建唯一的单例对象；
 * 不用考虑线程见同步的问题，但可能会浪费空间，是一种以空间换时间的方法。
 */
public class singleton_2 {
    private volatile static singleton_2 instance = new singleton_2();
    private singleton_2(){}
    public static singleton_2 getInstance(){
        return instance;
    }
}
