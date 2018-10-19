package singleton;

import singleton.lazy_load.God;

public class LazyGod {
    private static LazyGod lazyGod;

    private LazyGod() {
    }

    public LazyGod getLazyGod() {
        if (lazyGod==null) {
            synchronized (God.class) {
                if (lazyGod == null) {
                    lazyGod = new LazyGod();
                }
            }
        }
        return lazyGod;
    }
}
