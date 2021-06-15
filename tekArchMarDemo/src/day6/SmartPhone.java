package day6;

public class SmartPhone extends CellPhone {
	@Override
	public void voiceCall() {
		System.out.println("we can make voice call and message and video call");
	}
	public void videoCall() {
		System.out.println("we can make video call");
	}
	public static void main(String[] args) {
		SmartPhone iPhone = new SmartPhone();
		iPhone.calcfn();
		iPhone.voiceCall();
		iPhone.videoCall();

	}

}
