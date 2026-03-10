package CommandBaishali;

public class AlexaInvoker {
    private Command command;
    public void setCommand(Command command){
        this.command = command;
    }
    public void pressButton(){
        if (command != null) command.execute();
    }

}
