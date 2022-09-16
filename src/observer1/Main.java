package observer1;

public class Main {
    public static void main(String[] args) {
        Meteostation meteo = new Meteostation();
        meteo.add(new ConsoleObserver());
        meteo.setMeasurements(25, 760);
        meteo.add(new FileObserver());
        meteo.setMeasurements(35, 800);
    }
}
