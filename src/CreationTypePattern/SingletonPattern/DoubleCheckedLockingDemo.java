package CreationTypePattern.SingletonPattern;

/**
 * 双锁校验单例模式，懒加载的线程安全，且并不需要每次获取实例都进行synchronized同步，效率比懒汉式高
 * 缺点：volatile会屏蔽掉一部分代码和内核优化（重排序优化失效，缓存失效），所以还是会有性能问题
 */
public class DoubleCheckedLockingDemo {
    private static volatile DoubleCheckedLockingDemo doubleCheckedLockingDemo;
    private DoubleCheckedLockingDemo(){};
    public static DoubleCheckedLockingDemo getInstance(){
        if(doubleCheckedLockingDemo == null){
            synchronized (DoubleCheckedLockingDemo.class){
                if(doubleCheckedLockingDemo == null){
                    doubleCheckedLockingDemo = new DoubleCheckedLockingDemo();
                }
            }
        }
        return doubleCheckedLockingDemo;
    }
    public static void main(String[] args){
        getInstance().message();
    }
    public void message(){
        System.out.println("I am singleton !");
    }
}
