package Observer;

public class Boyner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub,
	SubjectProducts sb= new TH();
	SubjectProducts sb2= new TimberLand();
		Observer ob= new AyseTeyze(sb);
		Observer ob2= new hasanAbi(sb2);
	hasanAbi hb=(hasanAbi) ob2;
	sb2.ChangePrice("2134 ");
	sb.ChangePrice(" 1000 TL");
	sb.ChangePrice("101 TL");
	hb.setSubject(sb);
	sb.ChangePrice("102 TL");
	sb.ChangePrice("104 TL");
	sb2.ChangePrice("212121");
	

	}

}
