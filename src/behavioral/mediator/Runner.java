package behavioral.mediator;

public class Runner {
    public static void main(String[] args) {
        RealMediator realMediator = new RealMediator();
        realMediator.add(new RealColleague(realMediator, "first"));
        realMediator.add(new RealColleague(realMediator, "second"));
        Colleague colleague = new RealColleague(realMediator, "third");
        realMediator.add(colleague);
        colleague.changeStatus();
    }
}
