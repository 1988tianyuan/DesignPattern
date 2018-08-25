package CreationTypePattern.SingletonPattern;

/**
 * 单例模式：保证一个类仅有一个实例，并提供一个访问它的全局访问点。
 * 本例子是线程安全的懒汉式，缺点是加锁的消耗无可避免
 */
public class LazySingletonPatternDemo {
    private static LazySingletonPatternDemo lazySingletonPatternDemo;
    private LazySingletonPatternDemo(){};
    public static synchronized LazySingletonPatternDemo getInstance(){
        if(lazySingletonPatternDemo == null){
            lazySingletonPatternDemo = new LazySingletonPatternDemo();
        }
        return lazySingletonPatternDemo;
    }
    public static void main(String[] args){
        getInstance().message();
    }
    public void message(){
        System.out.println("I am singleton !");
    }
}
