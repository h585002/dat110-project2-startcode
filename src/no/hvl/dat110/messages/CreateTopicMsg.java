package no.hvl.dat110.messages;

public class CreateTopicMsg extends Message {
	
	// message sent from client to create topic on the broker
	

	// TODO: 
	// Implement object variables - a topic is required
	String topic;
	
	// Constructor
	public CreateTopicMsg(String user, String topic) {
		super(MessageType.CONNECT, user);
		this.topic = topic;
	}
    
	//get/set-methods
	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}
	//toString method
	public String toString() {
		return "Topic: " + topic + "   "  + super.toString();
	} 
}
