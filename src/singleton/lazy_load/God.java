package singleton.lazy_load;

public class God {
    private static God god;

    private God() {
    }

    //请神
    public static God getGod() {
        if (god == null) {
            synchronized (God.class) {
                if (god == null) {
                    god = new God();
                }
            }
        }
        return god;
    }
}
