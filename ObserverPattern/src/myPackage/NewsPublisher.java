package myPackage;

public interface NewsPublisher {
	public void registerSubscriber( Subscriber s);
	public void removeSubscriber( Subscriber s);
	public void notifySubscribers();
	
	public String getHeadline();
	public String getDescription();
	public String getDateTime();
}
