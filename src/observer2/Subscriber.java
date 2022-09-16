package observer2;

import java.util.List;

public class Subscriber implements Scriber{
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("Dear " + name + "\nWe have some changes vacancias: \n" + vacancies +
                "\n================================================\n");
    }
}
