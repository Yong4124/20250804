package sec03.exam02;

public class RemoteControlEx {

	public static void main(String[] args) {
		RemoteControl rc;
//		rc = new Television();
//		rc = new Audio();	
		rc = new RemoteControl() { // 익명의 구현 객체 생성
			
			private int volume;
			private String volume1;

			@Override
			public void turnOn() {
				System.out.println("Video를 켭니다.");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("Video를 끕니다.");
				
			}
			
			@Override
			public void setVolume(int volume) {
				if(volume > RemoteControl.MAX_VOLUME) {
					this.volume = RemoteControl.MAX_VOLUME;
				} else if(volume<RemoteControl.MIN_VOLUME) {
					this.volume = RemoteControl.MIN_VOLUME;
				} else {
					this.volume = volume;
				}
				System.out.println("현재 Video 볼륨: " + this.volume);
				
			}

			
		};
		
		
		rc.turnOn();
		rc.setVolume(3);
		rc.turnOff();

	}

}
