package CreationTypePattern.SingletonPattern;

/**
 * 单例模式：保证一个类仅有一个实例，并提供一个访问它的全局访问点。
 * 本例子是线程安全的饿汉式，避免了加锁消耗，但是在类加载时就生成实例，有点浪费内存
 */
public class HungrySingletonPatternDemo {
    private static HungrySingletonPatternDemo hungrySingletonPatternDemo = new HungrySingletonPatternDemo();
    private HungrySingletonPatternDemo(){};
    public static HungrySingletonPatternDemo getInstance(){
        return hungrySingletonPatternDemo;
    }
    public static void main(String[] args){
        getInstance().message();
    }
    public void message(){
        System.out.println("I am singleton !");
    }
}
