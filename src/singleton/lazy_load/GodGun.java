package singleton.lazy_load;

public class GodGun {
    public static void main(String[] args) {
        God god1 = God.getGod();
        System.out.println(god1);

        God god2 = God.getGod();
        System.out.println(god2);
    }
}
