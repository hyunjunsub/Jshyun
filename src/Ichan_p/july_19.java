package Ichan_p;

class haha{
	String h = "�ȳ��ϼ���";
}

class hi{
	
	hello hel = new hello();
	haha ha = new haha();

	void ss () {
//		hel.ha =ha;
		hel.aaa(ha);
		ha.h="�ȳ�";
		System.out.println(ha.h);
		
	}
	
}

class hello {
	
	haha ha;
	void aaa(haha bbb) {
		this.ha = bbb;
	}
	
	void sibal() {
		System.out.println(ha.h);
		ha.h = "�ù�";
		System.out.println(ha.h);
	}
	
}
public class july_19 {

	public static void main(String[] args) {

		hi hiru = new hi();
		hiru.ss();
		hiru.hel.sibal();
		
//		
//		String y;
//		y= "������";
//		
//		hyunjin hj= new hyunjin(y);
//		hj.z = y;
//		
		
//		System.out.println(hj.hg);
		
		
	}

}
