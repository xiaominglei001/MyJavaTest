package pattern.creational_patterns.singleton_pattern;
/*
 * 全部详细讲述见：https://gitee.com/xiaominglei001/forMarkdown/raw/master/20200909102948.png
 * */


/*
 *
 *3、双检锁/双重校验锁（DCL，即 double-checked locking）
 * 双重检验锁模式（double checked locking pattern），是一种使用同步块加锁的方法。
 * 程序员称其为双重检查锁，因为会有两次检查 instance == null，一次是在同步块外，一次是在同步块内。为什么在同步块内还要再检验一次？
 * 因为可能会有多个线程一起进入同步块外的 if，如果在同步块内不进行二次检验的话就会生成多个实例了。
 * 描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。注意上面使用了volatile 关键字。
 * */
public class Singleton3 {
    private volatile static Singleton3 instance;//声明成 volatile

    private Singleton3() {
    }

    public static Singleton3 getSingleton() {
        if (instance == null) {              // Single Checked
            synchronized (Singleton3.class) {
                if (instance == null) {      // Double Checked
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}
