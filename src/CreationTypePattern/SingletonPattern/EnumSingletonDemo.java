package CreationTypePattern.SingletonPattern;

/**
 * 枚举实现单例模式，这个方式也是effective java最推荐的方式
 * 不仅线程安全，还支持序列化机制，防止反序列化重新创建新的对象，绝对防止多次实例化
 */
public enum  EnumSingletonDemo {
    //使用枚举的方式实现这一个实例
    ENUM_SINGLETON_DEMO;
    public static void main(String[] args){
        ENUM_SINGLETON_DEMO.message();
    }
    public void message(){
        System.out.println("I am singleton !");
    }
}
