package CreationTypePattern.SingletonPattern;

/**
 * 静态内部类实现单例模式，由于静态内部类只有在被调用时才会加载，所以即保证了懒加载也保证了线程安全，还不会造成加锁消耗
 */
public class StaticInnerClassDemo {
    private static class innerClass{
        private static final StaticInnerClassDemo staticInnerClassDemo = new StaticInnerClassDemo();
    }
    private StaticInnerClassDemo(){};
    public static StaticInnerClassDemo getInstance(){
        return innerClass.staticInnerClassDemo;
    }
    public static void main(String[] args){
        getInstance().message();
    }
    public void message(){
        System.out.println("I am singleton !");
    }
}
