package 类的初始化过程;

/**
 * 首先:初始化父类的 静态成员变量和静态代码块
 *  -->初始化子类的 静态成员变量和静态代码块
 *  -->初始化父类的 普通成员变量和代码块,在执行父类的构造方法
 *  -->初始化子类的 普通成员变量和代码块,在执行子类的构造方法
 */

public class C {
    C(){
        System.out.println("c");
    }
}
class A{
    C c = new C();
    A(){
        this("A");
        System.out.println("A");
    }
    A(String s){
        System.out.println(s);
    }
}

class Test extends A {
    Test(){
        super("B");
        System.out.println("B");
    }

    public static void main(String[] args) {
        new Test();
    }
}
