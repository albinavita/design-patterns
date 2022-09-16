package observer2;

import java.util.List;

public interface Scriber {
    public void handleEvent(List<String>vacancies);
}
