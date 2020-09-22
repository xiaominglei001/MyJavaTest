package pattern.creational_patterns.singleton_pattern;

/*
 * 全部详细讲述见：https://gitee.com/xiaominglei001/forMarkdown/raw/master/20200909102948.png
 * */
/*
 *2、懒汉式，线程安全
 *描述：这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步。
 * */
public class Singleton2 {
    private static Singleton2 instance;
    private Singleton2() {
    }

    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}
