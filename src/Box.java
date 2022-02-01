public class Box <T> {
    int key;
    T type;

    Box(int key, T type){
        this.key = key;
        this.type = type;
    }

    public String getType (){
        return type.getClass().getTypeName();
    }

    public <E> String getParamType(E e){
        return e.getClass().getTypeName();
    }
}
