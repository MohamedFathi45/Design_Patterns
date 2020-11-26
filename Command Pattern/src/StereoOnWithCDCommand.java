
public class StereoOnWithCDCommand implements Command{
	Stereo stereo;
	public StereoOnWithCDCommand(Stereo st) {
		this.stereo = st;
	}
	@Override
	public void execute() {
		stereo.on();
		stereo.setCd();
		stereo.setVolume(11);
	}
	@Override
	public void undo() {
		stereo.off();
	}

}
