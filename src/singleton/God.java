package singleton;

public class God {
    private static final God god = new God();

    private God() {
    }

    public God getInstance(){
        return god;
    }

    public void zaoRen(){
        System.out.println("神正在造人,闲人免进");
    }
}

