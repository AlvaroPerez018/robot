package Strategy;

import Strategy.RobotBehavior;

public class Robot {
private RobotBehavior behavior;
private String name;

public Robot(){}

public RobotBehavior getBehavior() {
    return behavior;
}

public void setBehavior(RobotBehavior behavior) {
    this.behavior = behavior;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}
public void move(){
    int command = behavior.moveCommand();
    System.out.println("move command:" + command + " , " + behavior.toString());
}
}
