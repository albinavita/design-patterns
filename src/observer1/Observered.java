package observer1;

public interface Observered {
    public void add(Observer observer);
    public void remove(Observer observer);
    public void notifyObservers();
}
