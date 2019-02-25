package Observer;

import java.util.ArrayList;

public class TimberLand implements SubjectProducts {
    public ArrayList<Observer> TheList= new ArrayList();
    private String msg;
	
	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		TheList.add(o);
	}

	@Override
	public void unregisterObserver(Observer o) {
		// TODO Auto-generated method stub
		if(TheList.contains(o))
			TheList.remove(o);
		
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for(Observer o:TheList)
			o.update(msg);
	}

	
	public void ChangePrice(String price) {
		msg=price;
		notifyObserver();
	}
}
