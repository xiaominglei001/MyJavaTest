package demoinitandextend.extendtest;

/**
 * 函数执行顺序测试
 * Created by 萌小Q on 2017/5/17 0017.
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
