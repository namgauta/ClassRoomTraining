package singleton;


import java.io.Serializable;

public class Singleton implements Serializable{

    public static Singleton instance = new Singleton();

    private Singleton()
    { }

     protected Object readResolve()
    {
        return null;
    }
}