package Observer;

import java.util.ArrayList;

public class TH  implements SubjectProducts{
  ArrayList<Observer> TheList = new ArrayList();
  
  
  public TH(){
	  
	  
  }
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
