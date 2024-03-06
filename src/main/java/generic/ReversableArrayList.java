package generic;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 改写 ReversableArrayList ，让它在依然增加 reverse() 方法的同时，保留泛型的特性。
 * @param <E>
 */
public class ReversableArrayList<E> extends ArrayList<E> {

    public void reverse(){
        Collections.reverse(this);
    }
}
