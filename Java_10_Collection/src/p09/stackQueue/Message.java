package p09.stackQueue;

public class Message {
	//필드
	public String command;
	public String to;
	
	//생성자
	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}

	
	//메소드
	
	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}
	
	
	
	
	
	
	
}
