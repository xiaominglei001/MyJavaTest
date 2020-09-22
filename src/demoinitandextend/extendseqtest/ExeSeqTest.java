package demoinitandextend.extendseqtest;

/**
 * 继承情况下函数执行顺序测试
 *
 * 详细文章参考：https://gitee.com/xiaominglei001/forMarkdown/raw/master/20200909182907.png
 *
 * 总结：
 *
 * 当子类重写了父类的函数，那么子类的对象如果调用该函数，一定调用的是重写过后的函数。可以通过super关键字进行父类的重写函数的调用。
 *
 * 子类继承父类，调用方法时先是调用子类中的方法，如果没有就调用父类中的方法，还有一点就是try{ }、catch{ }、finally{ }返回值的问题，
 * 一旦try{ }中返回了某一个值，如果finally有返回值，finally中的返回值会覆盖try的返回值，如果finally没有返回值，就是try中的返回值。
 *
 */
public class ExeSeqTest {
    public static void main(String[] args) {
        System.out.println(new B().getValue());//
    }

    static class A {
        protected int value;

        public A(int v) {
            setValue(v);
        }

        public void setValue(int value) {
            this.value = value;
        }

        public int getValue() {
            try {
                value++;
                return value;
            } catch (Exception e) {
                System.out.println(e.toString());
            } finally {
                this.setValue(value);
                System.out.println(value);//
            }
            return value;
        }
    }

    static class B extends A {
        public B() {
            super(5);//这一句执行后value值为10
            setValue(getValue() - 3);//getValue()执行时把value设置为22，并输出22，最后返回11，相当于setValue(8);
        }

        @Override
        public void setValue(int value) {
            super.setValue(2 * value);
        }
    }
}
