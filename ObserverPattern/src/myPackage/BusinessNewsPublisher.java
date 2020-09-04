package myPackage;

import java.util.ArrayList;

public class BusinessNewsPublisher implements NewsPublisher{
	private ArrayList subscribers;
	private String headline;
	private String description;
	private String dateTime;
	public BusinessNewsPublisher businessNews;
	
	
	public String getHeadline() {
		return headline;
	}

	public String getDescription() {
		return description;
	}

	public String getDateTime() {
		return dateTime;
	}

	
	public BusinessNewsPublisher(String headline, String description, String dateTime) {
		this.headline = headline;
		this.description = description;
		this.dateTime = dateTime;
	}
	
	public BusinessNewsPublisher() {
		subscribers = new ArrayList();
	}
	
	
	public void registerSubscriber ( Subscriber s ) {
		subscribers.add(s);
	}
	
	public void removeSubscriber( Subscriber s ) {
		int i = subscribers.indexOf(s);
		if (i >= 0) {
			subscribers.remove(i);
		}
	}
	
	public void notifySubscribers() {
		for(int i = 0; i < subscribers.size(); i++) {
			Subscriber subscriber = (Subscriber)subscribers.get(i);
			subscriber.update(businessNews);
		}
	}
	
	
	public void setNews(String headline, String description, String dateTime) {
		businessNews = new BusinessNewsPublisher(headline, description, dateTime);
		notifySubscribers();
	}
}
