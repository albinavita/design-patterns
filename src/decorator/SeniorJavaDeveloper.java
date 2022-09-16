package decorator;

public class SeniorJavaDeveloper extends DeveloperDecorator{

    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    @Override
    public String makeJop() {
        return super.makeJop() + makeCodeReview();
    }

    public String makeCodeReview(){
        return  "Make code review.";
    }

}
