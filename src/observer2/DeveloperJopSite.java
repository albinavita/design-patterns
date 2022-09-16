package observer2;

import java.util.ArrayList;
import java.util.List;

public class DeveloperJopSite implements Observerd{
    private List<String> vacancies = new ArrayList<>();
    private List<Scriber>scribers = new ArrayList<>();

    public void addVacancy(String vacancy){
        vacancies.add(vacancy);
        notifyScriber();
    }

    public void removeVacancy(String vacancy){
        vacancies.remove(vacancy);
        notifyScriber();
    }

    @Override
    public void add(Scriber scriber) {
        scribers.add(scriber);
    }

    @Override
    public void remove(Scriber scriber) {
        scribers.remove(scriber);
    }

    @Override
    public void notifyScriber() {
        for(Scriber scriber : scribers){
            scriber.handleEvent(vacancies);
        }
    }
}
