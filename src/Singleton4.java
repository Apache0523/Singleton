//懒汉模式，线程安全，性能差，多次调用getinstance,积累损耗大
//多线程下不推荐使用
public class Singleton4 {
    private static Singleton4 instance = null;
    private Singleton4(){}
    public static synchronized Singleton4 getInstance(){
        if(instance==null){
            instance = new Singleton4();
        }
        return instance;
    }
}
