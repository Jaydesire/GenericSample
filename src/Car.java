public class Car<E> {
    E engine;

    public void getEngineType(){
        System.out.println(engine.getClass().getTypeName());
    }

    public <T> T getSomeNoice(T options){
        return (T)"Ж-ж-ж-ж-ж)))";
    }

}
