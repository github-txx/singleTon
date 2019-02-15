package threadDemo;
/**
 * 单例模式：单例模式确保类只有一个实例，并且提供一个全局的访问点。
 * 1、双检查锁机制（Double Check Locking）实现DCL
 * 懒汉式单例模式：延迟实例化，但节省空间
 * 分析：在需要的情况下，才创建唯一的实例对象，是一种延迟实例化的方法。
 * 但是要考虑线程同步的问题，会降低执行效率，是一个以时间换空间的方法。
 */
public class singleton_1 {
    private volatile static singleton_1 instance = null;
    private singleton_1(){}
    public static singleton_1 getInstance(){
        if(instance == null){
            synchronized (singleton_1.class){
                if(instance == null){
                    instance = new singleton_1();
                }
            }
        }
        return instance;
    }
}
