package threadDemo;
/*单例的四大原则：
    1.构造私有。
    2.以静态方法或者枚举返回实例。
    3.确保实例只有一个，尤其是多线程环境。
    4.确保反序列换时不会重新构建对象。
*/
/*通过使用IoDH，既可以实现延迟加载，又可以保证线程安全，不影响系统性能，因此，IoDH不失为一种最好的Java语言单例模式实现方式。
*/
/**
 * 单例模式：3、IoDH实现单例模式（静态内部类）
 * 实现IoDH时，需要在单例类中增加一个静态内部类，在该内部类中创建单例对象，再将该单例对象通过getInstance()方法给外部使用。
 * 分析：由于静态单例对象没有作为Singlton的成员变量直接实例化，因此类加载时不会实例化Singleton，
 * 第一次调用getInstance()方法时将加载内部类HolderClass，在该内部类中定义一个static类型的静态变量,
 * 此时会首先初始化这个成员变量，由Java虚拟机来保证其线程安全性，确保该成员变量只能初始化一次。
 * 由于getInstance()方法没有任何线程锁定，因此其性能不会造成任何影响。
 * 通过使用IoDH，既可以实现延迟加载，又可以保证线程安全，不影响系统性能，因此，IoDH不失为一种最好的Java语言单例模式实现方式。
 */
public class singleton {
    private static class singleHandler {
        private static final singleton instance = new singleton();
    }
    private singleton(){};
    public static singleton getInstance(){
        return singleHandler.instance;
    }
}
