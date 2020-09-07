package aamytest.initialization;

public class TestA {


    private String comefrom;

    public TestA(String comefrom) {
        this.comefrom = comefrom;
        try {
            Thread.sleep(10);
            System.out.println(System.currentTimeMillis() + "--init TestA 有参构造函数--此时comefrom：" + comefrom);
        } catch (Exception e) {

        }

    }


    public TestA(){
        try {
            Thread.sleep(10);
            System.out.println(System.currentTimeMillis() + "--init TestA 无参构造函数--此时comefrom：" + comefrom);
        } catch (Exception e) {

        }
    }

    {
        try {
            Thread.sleep(10);
            System.out.println(System.currentTimeMillis() + "--init TestA block 构造代码块--此时comefrom：" + comefrom);
        } catch (Exception e) {

        }


    }

    public void sayMyName() {
        try {
            Thread.sleep(10);
            System.out.println(System.currentTimeMillis() + "--MyNameisTestA--此时comefrom：" + comefrom);
        } catch (Exception e) {

        }

    }


}
