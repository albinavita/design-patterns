package decorator;

public class JavaTeamLeader extends DeveloperDecorator{

    public JavaTeamLeader(Developer developer) {
        super(developer);
    }

    @Override
    public String makeJop() {
        return super.makeJop() + sendWeekReport();
    }

    public String sendWeekReport(){
        return "Send week report to customer.";
    }
}
