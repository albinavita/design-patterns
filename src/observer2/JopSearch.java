package observer2;

import java.util.Date;

public class JopSearch {
    public static void main(String[] args) {
        DeveloperJopSite site = new DeveloperJopSite();

        site.addVacancy("First Java Position");
        site.addVacancy("Second Java Position");

        Scriber scriber = new Subscriber("Vanja");
        Scriber scriber1 = new Subscriber("Katja");
        Scriber scriber2 = new Subscriber("Masha");

        site.add(scriber);
        site.add(scriber1);
        site.add(scriber2);

        site.addVacancy("Third Java Position");
        site.removeVacancy("Second Java Position");
    }
}
