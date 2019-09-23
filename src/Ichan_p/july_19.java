package Ichan_p;

class haha{
	String h = "안녕하세요";
}

class hi{
	
	hello hel = new hello();
	haha ha = new haha();

	void ss () {
//		hel.ha =ha;
		hel.aaa(ha);
		ha.h="안녕";
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
		ha.h = "시발";
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
//		y= "현진이";
//		
//		hyunjin hj= new hyunjin(y);
//		hj.z = y;
//		
		
//		System.out.println(hj.hg);
		
		
	}

}
