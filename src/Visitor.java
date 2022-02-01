public class Visitor<T> {
    private T someVisitor;

    private Visitor(){
    }

    private Visitor(T t){
    }

    public static <T> Visitor <T> init(T t){

        Visitor<T> someT = new Visitor<T>(t);
        return someT;
    }

    public T getVisitor (){
        return someVisitor;
    }

    public void setSomeVisitor(T someVisitor){
        this.someVisitor = someVisitor;
    }

    public String getVisitorType(){
        return someVisitor.getClass().getTypeName();
    }
    
}
