package generic;

public interface Shop <T>{

    T buy();

    float refund(T item);
}
