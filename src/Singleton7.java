//双重检查，推荐用，安全
public class Singleton7 {
    private static volatile Singleton7 instance;
    private Singleton7(){}
    public static Singleton7 getInstance(){
        if(instance == null){
            synchronized (Singleton7.class){
                if(instance==null){
                    instance = new Singleton7();
                }
            }
        }
        return instance;
    }
}
