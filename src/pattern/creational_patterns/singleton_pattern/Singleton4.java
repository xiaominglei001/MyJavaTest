package pattern.creational_patterns.singleton_pattern;

/*
 * 全部详细讲述见：https://gitee.com/xiaominglei001/forMarkdown/raw/master/20200909102948.png
 * */

/*
 * 4、饿汉式
 * 描述：这种方式比较常用，但容易产生垃圾对象。
 * 这种写法如果完美的话，就没必要在啰嗦那么多双检锁的问题了。
 * 缺点是它不是一种懒加载模式（lazy initialization），单例会在加载类后一开始就被初始化，即使客户端没有调用 getInstance()方法。
 * 饿汉式的创建方式在一些场景中将无法使用：譬如 Singleton6 实例的创建是依赖参数或者配置文件的，在 getInstance() 之前必须调用某个方法设置参数给它，那样这种单例写法就无法使用了。
 * */
public class Singleton4 {
    private static Singleton4 instance = new Singleton4();

    private Singleton4() {
    }

    public static Singleton4 getInstance() {
        return instance;
    }
}
