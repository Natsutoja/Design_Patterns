public class MediatorTest {
    public static void main(String[] args) {
        Mediator mediator = new ApplicationMediator();
        Colleague desktop = new DesktopColleague(mediator);
        Colleague mobile = new MobileColleague(mediator);
        mediator.addColleague(desktop);
        mediator.addColleague(mobile);
        desktop.send("Witaj twoja wiadomosc zostala dostarczona!");
        mobile.send("wiadomosc z telefonu :D");
    }
}