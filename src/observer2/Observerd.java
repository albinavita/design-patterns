package observer2;
/**сущность, которую будем наблюдать*/

public interface Observerd {
    public void add(Scriber scriber);
    public void remove(Scriber scriber);
    public void notifyScriber();
}
