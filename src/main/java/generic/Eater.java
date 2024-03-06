package generic;

import bean.Food;

/**
 * 让把这个接口的类型参数 T 的类型，由现在的不限制，修改为只能是 Food 或 Food 的子类。
 * @param <T>
 */
public interface Eater<T extends Food> {

    /**
     * eat() 的参数 food 的类型使用泛型 T 来表示（但不要限制 T 的具体类型）。
     * @param food
     */
    void eat(T food);
}
