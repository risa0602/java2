import java.util.*;
public class FruitsApp{
	public static void main(String[] args){
		//Scannerインスタンスの作成
		Scanner sc = new Scanner(System.in);
		System.out.print("野菜をいくつ購入しますか>>");
		int n = sc.nextInt();
		Fruits[] data = new Fruits[n];
		for(int i=0;i<data.length;i++){
			System.out.printf("%dつめの野菜>>",i+1);
			String name = sc.next();
			System.out.printf("%sの価格>>",name);
			int price = sc.nextInt();
			Fruits f = new Fruits(name,price);
			data[i] = f;
		}
		for(Fruits f : data){
			f.showInfo();
		}
		System.out.printf("合計は%d円です。%n",Fruits.total);
	}
}
class Fruits{
	//staticフィールド、クラスメンバー、静的フィールド、クラスフィールド
	static int total=0;//メモリ空間に1つ
	//インスタンスフィールド
	String name;
	int price;
	public Fruits(String name,int price){
		this.name = name;
		this.price = price;
		total+=this.price;
	}
	public void showInfo(){
		System.out.printf("%s(%d円)%n",this.name,this.price);
	}
	public static void showTotal(){
		System.out.println("合計金額は:"+total+"円です");
	}
}
