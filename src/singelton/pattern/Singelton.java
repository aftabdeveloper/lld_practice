package singelton.pattern;
// lazy initialization
//public class Singelton {
//    private static Singelton instance;
//    private Singelton(){
//
//    }
//
//    public static Singelton getInstance(){
//        if(instance == null){
//            instance = new Singelton();
//        }
//        return instance;
//    }
//}


//Eager /Early initialization
//public class Singelton {
//    private static Singelton instance = new Singelton();
//    private Singelton(){
//
//    }
//
//    public static Singelton getInstance(){
//        return instance;
//    }
//}

//public class Singelton {
//    private static Singelton instance;
//    private Singelton(){
//
//    }
//
//    public static synchronized Singelton getInstance(){
//        if(instance == null){
//            instance = new Singelton();
//        }
//        return instance;
//    }
//}

//Double locking synchronisation
public class Singelton {
    private static Singelton instance;
    private Singelton(){

    }

    public static Singelton getInstance(){
        if(instance == null){
            synchronized (Singelton.class){
                if(instance == null){
                    instance = new Singelton();

                }
            }
        }
        return instance;
    }
}

//Enum based singelton
//public enum Singelton {
//    INSTANCE;
//    public void doSomething(){
//        System.out.println("Perform some thing");
//    }
//}