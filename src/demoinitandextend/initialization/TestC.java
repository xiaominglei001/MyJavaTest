package demoinitandextend.initialization;


public class TestC {
    private TestA mA = new TestA("成员变量");

    public static void main(String[] args) {
        System.out.println("--此处main方法执行时，没有生成TestC的实例，所以只会打印此句--");
      /*  System.out.println("------------分割线---------");
        new TestC();*/
    }
}
