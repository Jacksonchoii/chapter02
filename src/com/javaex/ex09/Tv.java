package com.javaex.ex09;

public class Tv {

	//필드 1)모든 필드는 private으로 접근제어
	private int channel;
	private int volume;
	private boolean power;
	
	//생성자 3) 기본 생성자 오버로딩
	public Tv() {}
	
	//2)channel, volume, power 로 초기화하는 생성자
	public Tv(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	
	
	
	//메소드 getter setter 1)접근 제어 후 getter만 작성
	public int getChannel() {
		return channel;
	}
	
	public int getVolume() {
		return volume;
	}
	
	
	//메소드 일반 4)power(boolean on) 메소드 구현
	public void power(boolean on) {
		this.power = on;		
	}
	
	// 5)channel(int channel) 메소드 구현(1~255유지)
	public void channel(int channel) {
		if(power == true) {
			if(channel >= 1 || channel <= 255) {
				this.channel = channel;
			}else {
				System.out.println("====없는채널====");
			}
		}
	}
	
	// 6)channel(boolean up) 메소드 오버로딩(1~255유지, 1씩증감)
	public void channel(boolean up) {
		if(up == true) {
			this.channel = channel+1;
		}else {
			this.channel = channel-1;
		}
	}
	
	// 7)volume(int volume) 메소드 구현 (1~100유지)
	
	public void volume(int volume) {
		if(power == true) {
			if(volume < 0) {
				this.volume = 0;
			}else if(volume > 100){
				this.volume = 100;
			}else {
				this.volume = volume;
			}
		}
	}
	
	// 8)volume(boolean up) 메소드 오버로딩 (0~100유지, 1씩증감)
	public void volume(boolean up) {
		if(up == true) {
			this.volume = volume+1;
		}else {
			this.volume = volume-1;
		}
	}
	
		
	//9)void status() 메소드 구현(TV정보 출력)
	public void status() {
		System.out.println("채널: "+channel+"번, 음량: "+volume+", 전원:"+power);
	}

	@Override
	public String toString() {
		return "Tv [channel=" + channel + ", volume=" + volume + ", power=" + power + "]";
	}

	
	
	
	
}
