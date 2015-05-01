package algorithm;
import java.util.*;
public class NestedInteger {
	public static int getSumInteger(List<Object> I){
		int sum=0,lv=0,lastNum=1,curNum=0;
		LinkedList<List<Object>> q = new LinkedList<List<Object>>();
		q.add(I);
		while(!q.isEmpty()){
			while(lastNum>0){
				List<Object> lst = q.poll();
				for(int i=0;i<lst.size();i++){
					if(lst.get(i) instanceof Integer){
						sum+=((Integer)lst.get(i))* (lv+1);
					}else{
						curNum++;
						q.add((List<Object>) lst.get(i));
					}
				}
				lastNum--;
			}
			lv++;
			lastNum=curNum;
			curNum=0;
		}
		
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> arr = new ArrayList<Object>();
		List<Object> lst1 = new ArrayList<Object>();
		List<Object> lst2 = new ArrayList<Object>();
		lst1.add(1);
		lst1.add(1);
		lst2.add(2);
		List<Object> lv1 = new ArrayList<Object>();
		lv1.add(lst2);
		lv1.add(4);
		List<Object> lv2 = new ArrayList<Object>();
		lv2.add(lst1);
		lv2.add(3);
		
		arr.add(lst1);
		arr.add(2);
		arr.add(lst1);
	
		System.out.print(getSumInteger(arr));

	}

}
