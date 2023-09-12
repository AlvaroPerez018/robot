import strategy.AgressiveBehavior;
import strategy.DefensiveBehavior;
import strategy.Robot;

public class App {
public static void main(String[] args) throws Exception {
Robot roboto = new Robot();
roboto.setName("MR , Roboto");
roboto.setBehavior(
    new AgressiveBehavior());
System.out.println(roboto.getName());
roboto.move();
Robot wally = new Robot();
wally.setName("MR , wally");
wally.setBehavior(
new DefensiveBehavior());
System.out.println(wally.getName());
wally.move();
}
}