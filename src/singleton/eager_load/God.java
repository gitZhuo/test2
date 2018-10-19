package singleton.eager_load;

public class God {
    private static final God GOD = new God();

    //构造方法私有化,这样就只有神类才能创造神对象
    private God() {
    }

    //请神
    public static God getGod() {
        return GOD;
    }

    //普度众生
    public static void puDu() {
        System.out.println("神在普度众生");
    }
}
