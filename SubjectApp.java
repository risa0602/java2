import java.util.*;
public class SubjectApp{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("何科目ありますか>>");
		int n= sc.nextInt();
		Subject[] data= new Subject[n];
		for(int i=0;i<data.length;i++){
			System.out.printf("%d科目の名前>>",i+1);
			String name= sc.next();
			System.out.printf("%d科目の点数>>",i+1);
			int score= sc.nextInt();
			Subject s = new Subject(name,score);
			data[i] = s;
		}
		for(Subject s:data){
			s.showGraph();
		}
	}
}
