package my;

public class Machine
{
	public int money = 0;
	public void insert ( int cash )
	{
		if( cash > 10 )
		{
			System.out.println("不能识别");
			return;
		}
		money += cash;
		showcurrent();
	}
	
	//显示当前余额
	public void showcurrent ()
	{
		System.out.println("余额为" + money);
	}
	
	//交易完成
	public int exchange()
	{
		int numOfCoin = this.money / 1;
		this.money = 0;
		System.out.println("交易完成 当前余额为:" + this.money);
		return numOfCoin;
	}
	
}
