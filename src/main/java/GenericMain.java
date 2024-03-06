import bean.Apple;
import bean.Food;
import bean.Fruit;
import generic.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GenericMain {

    {
        ArrayList<Apple> arrayList = new ArrayList<>();

    }

    public static void main(String[] args) {
//        List<Fruit> fruits1 = new ArrayList<Apple>();

        AppleShop appleShop = new AppleShop();

        List<? extends Fruit> fruits2 = new ArrayList<Apple>();

        List<? super Apple> apple = new ArrayList<Fruit>();

        /**
         * ? extends 限制范围：约束Type Argument实例化时的上界
         */
        List<? extends Food> foods = new ArrayList<Fruit>();
        /**
         * ? super 限制范围：约束Type Argument实例化时的下届
         */
        List<? super Apple> apples = new ArrayList<Fruit>();


        /**
         * 嵌套泛型实例化：
         * 第一层需要确定具体的类型
         * 之后可以使用？，类型有待进一步确定
         */
        ArrayList<? extends Mine<? super Apple>> arrayList1 =
                new ArrayList<Child<? super Apple>>();

        ArrayList<? extends Mine<? extends Food>> arrayList2 =
                new ArrayList<Child<? extends Food>>();

        ArrayList<? super Mine<? extends Fruit>> arrayList3 =
                new ArrayList<Parent<? extends Fruit>>();

        ArrayList<? super Mine<? super Apple>> arrayList4 =
                new ArrayList<Parent<? super Apple>>();

        Wrapper<Apple> wrapper = new Wrapper<Apple>(){};
        System.out.println(wrapper.getClass().getGenericSuperclass());
    }

    /**
     * 扩展左边泛型实例化的限制范围，消除报错。
     */
    ArrayList<? extends Fruit> fruits = new ArrayList<Apple>();

    /**
     * 扩展左边泛型实例化的限制范围，消除报错。
     */
    ArrayList<? super Apple> apples = new ArrayList<Fruit>();

    /**
     * 把参数 param 的类型限制为必须同时满足：
     * 1. 是 Runnable；
     * 2. 是 Serializable。
     * @param param
     * @param <T>
     */
    public <T extends Runnable & Serializable> void someMethod(T param){

    }

    /**
     * 放宽参数限制，改为填任何类型的参数都行，
     * 只要参数 item 的类型和参数 list 的 List<> 尖括号里的类型一致就可以。
     * @param item
     * @param list
     * @param <T>
     */
    public <T> void merge(T item, List<T> list){}
}

/**
 * 「T」这种写法为什么不能放在变量声明处或方法调用处，写成 List<T> list = new ArrayList<T>(); 的形式？
 * 原因：因为 T 是在泛型类型内部或泛型方法内部使用的一个通用代号，写到了它们的外面就没有意义了
 */

/**
 * 「?」 号在泛型中的作用是
 * 作用：放宽类型参数实例化的限制范围
 */
