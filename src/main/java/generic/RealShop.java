package generic;

public class RealShop<T> implements Shop<T>{
    @Override
    public T buy() {
        return null;
    }

    @Override
    public float refund(T item) {
        return 0;
    }
}
