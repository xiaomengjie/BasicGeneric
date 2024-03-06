package generic;

import bean.Apple;

import java.util.ArrayList;

/**
 * 改写 AppleArrayList ，让它依然失去来自父类 ArrayList 的泛型特性，
 * 但 AppleArrayList 接受的元素类型改变为 Apple 而不是 Object
 */
public class AppleArrayList extends ArrayList<Apple> {
}
