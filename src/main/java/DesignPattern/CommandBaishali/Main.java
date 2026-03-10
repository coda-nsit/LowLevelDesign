package CommandBaishali;

public class Main {
    public static void main(String[] args) {
        AlexaInvoker alexa = new AlexaInvoker();

        Light livingRoomLight = new Light();
        Command turnOnLight = new LightOnCommand(livingRoomLight);
        Command turnOffLight = new LightOffCoomand(livingRoomLight);

        alexa.setCommand(turnOnLight);
        alexa.pressButton();

        // Fan commands
        Fan livingRoomFan = new Fan();
        Command turnOnFan = new FanOnCommand(livingRoomFan);
        Command turnOffFan = new FanOffCommand(livingRoomFan);

        alexa.setCommand(turnOffFan);
        alexa.pressButton();

    }
}
