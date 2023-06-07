import java.util.*;
public class IceCreamApp{
	public static void main(String[] args){
		IceCream i1 = new IceCream("ピノ",160);
		i1.showInfo();
		IceCream i2 = new IceCream("スーパーカップ");
		i2.showInfo();
	}
}
class IceCream{
	String ice;
	int price;
	public IceCream(String ice,int price){
		this.ice=ice;
		this.price=price;
	}
	public IceCream(String ice){
		this.ice=ice;
		this.price=120;
	}
	public void showInfo(){
		System.out.printf("%s(%d円)%n",this.ice,this.price);
	}
}
