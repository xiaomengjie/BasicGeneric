package bean;

public interface Food {

    default int price(){
        return 1;
    }
}
