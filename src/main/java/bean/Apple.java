package bean;

import org.jetbrains.annotations.NotNull;

public class Apple extends Fruit implements Comparable<Apple>{
    @Override
    public int compareTo(@NotNull Apple apple) {
        return this.price() - apple.price();
    }
}
