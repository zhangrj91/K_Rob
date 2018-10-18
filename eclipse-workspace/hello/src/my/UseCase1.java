package my;

public abstract class UseCase1 {
	abstract void testAbstract();
	UseCase1(){//£¨1£©Ê×ÏÈÖ´ÐÐ¸¸Àà¹¹Ôì·½·¨
		System.out.println("before testAbstract()");
		testAbstract();//Èç¹ûµ÷ÓÃÁË³éÏó·½·¨£¬µ÷ÓÃ×ÓÀà¸²¸ÇµÄ·½·¨¡£ÕâÀïµ÷ÓÃAtestÀàµÄtestAbstract£¨£©·½·¨
		System.out.println("after testAbstarcat()");
	}
	public static void main(String args[]){
		new Atest();
	}
}
class Atest extends UseCase1{
	private int i=1;//£¨2£©Ê¹³ÉÔ±±äÁ¿½øÐÐ³õÊ¼»¯
	void testAbstract(){
		System.out.println("testAbstract()"+i);
	}
	public Atest(){//£¨3£©µ÷ÓÃ×ÓÀà¹¹Ôì·½·¨
		System.out.println(i);
	}
}
