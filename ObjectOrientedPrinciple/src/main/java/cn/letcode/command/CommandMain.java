package cn.letcode.command;

import cn.letcode.command.invoker.ArmySuperior;
import cn.letcode.command.receiver.CompanyArmy;

public class CommandMain {
    public static void main(String[] args) {
        CompanyArmy army = new CompanyArmy();
        Command command = new ConcreteCommand(army);
        ArmySuperior superior = new ArmySuperior();
        superior.setCommand(command);
        superior.startCommand();
    }
}
