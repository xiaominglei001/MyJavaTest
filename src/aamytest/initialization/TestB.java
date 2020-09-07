package aamytest.initialization;

//测试TestA及TestB类的成员变量/造代码块等初始化及调用时机
public class TestB {

    private TestA mA0 = new TestA("成员变量0");

    {
        try {
            Thread.sleep(10);
            System.out.println(System.currentTimeMillis() + "--init TestB block 构造代码块");
        } catch (Exception e) {

        }
    }
    private TestA mA1 = new TestA("成员变量1");

    public TestB(TestA mA0, TestA mA1) {
        this.mA0 = mA0;
        this.mA1 = mA1;
    }

    public TestB() {
        try {
            Thread.sleep(10);
            System.out.println(System.currentTimeMillis() + "--init TestB 无参构造函数");
        } catch (Exception e) {

        }
    }



    public static void main(String[] args) {//若是main主函数中不包含任何代码，将不会打印信息，可用TestC尝试
        TestB b = new TestB();
        b.mA1.sayMyName();

        System.out.println("==============分割线===========");

        TestA a = new TestA("main函数");
        a.sayMyName();

        System.out.println("==============分割线===========");

        TestA aa = new TestA();



    }




}
