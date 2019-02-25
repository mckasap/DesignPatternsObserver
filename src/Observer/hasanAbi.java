package Observer;

public class hasanAbi implements Observer {
	SubjectProducts sb;
	public  hasanAbi(SubjectProducts sb) {
		// TODO Auto-generated constructor stub
		this.sb=sb;
		this.sb.registerObserver(this);
	}

	public void setSubject(SubjectProducts sp) {
		
		
		this.sb.registerObserver(this);
		this.sb=sp;
		this.sb.registerObserver(this);
		
	}
	
	@Override
	public void update(String str) {
		// TODO Auto-generated method stub
		System.out.println(str+ ", bu  Fiyat ile gidilir boynere :) ");
		
	}
}
