
//饿汉模式，先实例化
class Singleton1 {
    private static Singleton1 instance = new Singleton1();
    private Singleton1(){ }
    public static Singleton1 getInstance(){
        return instance;
    }

}
