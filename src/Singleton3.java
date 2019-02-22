//懒汉模式，用到时再实例化，非线程安全
//多线程下不可用
public class Singleton3 {
    private static Singleton3 instance = null;
    private Singleton3(){}
    public static Singleton3 getInstance(){
        if(instance == null){
            instance = new Singleton3();
        }
        return instance;
    }
}
