package myPackage;

public class EmailSubscriber implements Subscriber {
	private String headline;
	private String description;
	private String dateTime;
	private String email;
	private NewsPublisher publisher;
	
	public EmailSubscriber( NewsPublisher publisher, String email ) {
		this.publisher = publisher;
		this.email = email;
		publisher.registerSubscriber(this);
	}
	
	public void update(NewsPublisher p) {
		this.headline = p.getHeadline();
		this.description = p.getDescription();
		this.dateTime = p.getDateTime();
		display();
	}
	
	public void display() {
		System.out.println("Send to: " + email + ": " + "Breaking News " + headline + " at " + dateTime + " " + description);
	}
}
