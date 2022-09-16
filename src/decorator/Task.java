package decorator;

public class Task {
    public static void main(String[] args) {
        Developer developer = new JavaTeamLeader
                        (new SeniorJavaDeveloper
                        ( new JavaDeveloper() ));
        System.out.println(developer.makeJop());
    }
}
