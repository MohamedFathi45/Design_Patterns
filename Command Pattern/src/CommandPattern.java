
public class CommandPattern {
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		Stereo stereo = new Stereo();
		Command livingRoomLightOn = new LightOnCommand(livingRoomLight);
		Command livingRoomLightOff = new LightOffCommand(livingRoomLight);
		Command stereoTurnedOn = new StereoOnWithCDCommand(stereo);
		remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remote.setCommand(1, stereoTurnedOn , new NoCommand());
		remote.onButtonWasPressed(0);
		remote.offButtonWasPressed(0);
		remote.offButtonWasPressed(1);
		remote.onButtonWasPressed(1);
		remote.undoButtonWasPushed();
	}
}
