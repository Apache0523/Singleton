//线程安全（不可用），若两个线程同时进入if判断会有两个实例
public class Singleton6 {
    private static Singleton6 instance = null;
    private Singleton6(){}
    public static Singleton6 getInstance(){
        if(instance==null){
            synchronized (Singleton6.class){
                instance = new Singleton6();
            }
        }
        return instance;
    }
}
