package generic;

import java.io.Serializable;

public interface SimShop<T, C extends Runnable & Serializable> extends Shop<T>{

    @Override
    T buy();

    @Override
    float refund(T item);

    C getCim(String name, int id);
}
