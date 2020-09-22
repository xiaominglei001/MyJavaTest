package pattern.creational_patterns.singleton_pattern;


/*
 * 全部详细讲述见：https://gitee.com/xiaominglei001/forMarkdown/raw/master/20200909102948.png
 * 或：https://www.runoob.com/design-pattern/design-pattern-intro.html
 * */

/**
 * 1、懒汉式，线程不安全
 * 描述：这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。因为没有加锁 synchronized，所以严格意义上它并不算单例模式。
 */
public class Singleton1 {
    private static Singleton1 instance;

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}
