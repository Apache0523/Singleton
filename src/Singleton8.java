//静态内部类，避免了线程不安全，延迟加载，效率高。
public class Singleton8 {
    private Singleton8 (){}
    private static class SingletonInstance{
        private static final Singleton8 INSTANCE = new Singleton8();
    }

    public static Singleton8 getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
