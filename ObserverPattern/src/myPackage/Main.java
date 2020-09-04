package myPackage;

public class Main {
	public static void main(String[] args) {
		
		BusinessNewsPublisher p1 = new BusinessNewsPublisher();
		BusinessNewsPublisher p2 = new BusinessNewsPublisher();
		
		SMSSubscriber sms = new SMSSubscriber(p1, "1-401-275-8344");
		SMSSubscriber sms2 = new SMSSubscriber(p1, "1-401-223-4575");
		EmailSubscriber es = new EmailSubscriber(p2, "bob@gmail.com");
		EmailSubscriber es2 = new EmailSubscriber(p1, "Karen@outlook.com");
		
		p1.setNews("Alien Invasion Drives Down Stocks", "Aliens from sector 67 invade driving down the dow jones", "08/31/2020 12:34am");
		
		p2.setNews("", "", "");
		
	}
}
