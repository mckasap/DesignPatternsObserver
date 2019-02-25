package Observer;

public interface SubjectProducts {

	public void registerObserver(Observer o);
	public void unregisterObserver(Observer o);
	public void notifyObserver();
	public void ChangePrice(String price);
}
