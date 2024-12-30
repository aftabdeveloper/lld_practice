package singelton.pattern;

public class Main {
    public static void main(String[] args) {
//        Singelton s1 = Singelton.getInstance();
//        Singelton s2 = Singelton.getInstance();
//        Singelton s3 = Singelton.getInstance();
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);

        Singelton s1 = Singelton.INSTANCE;
        Singelton s2 = Singelton.INSTANCE;
        System.out.println(s1 == s2);
        s1.doSomething();
    }
}
