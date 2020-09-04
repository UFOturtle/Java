package myPackage;

public class SMSSubscriber implements Subscriber {
	private String headline;
	private String description;
	private String dateTime;
	private String phone;
	private NewsPublisher publisher;
	
	public SMSSubscriber( NewsPublisher publisher, String phone ) {
		this.publisher = publisher;
		this.phone = phone;
		publisher.registerSubscriber(this);
	}
	
	public void update(NewsPublisher p) {
		this.headline = p.getHeadline();
		this.description = p.getDescription();
		this.dateTime = p.getDateTime();
		display();
	}
	
	public void display() {
		System.out.println("Send to: " + phone + ": " + "Breaking News " + headline + " at " + dateTime + " " + description);
	}
}
