import java.util.*;
class IntIter{
	public Integer next;
	public Iterator<Integer> iter;
	public IntIter(Iterator<Integer> iter){
		if(iter.hasNext()){
			next=iter.next();
		}else{
			next=null;
		}
		this.iter = iter;
	}
}
public class MergeKSortedArray {
	Comparator<IntIter> comp = new Comparator<IntIter>(){
		@Override
		public int compare(IntIter a, IntIter b){
			if(a.next==null||b.next==null) throw new NullPointerException();
			return Integer.compare(a.next, b.next);
		}
	};
	public List<Integer> mergeKSortedArray(Iterator<Integer>[] iterators){
		List<Integer> result = new ArrayList<Integer>();
		if(iterators==null) throw new NullPointerException();
		if(iterators.length==0) return result;
		PriorityQueue<IntIter> minHeap = new PriorityQueue<IntIter>(comp);
		for(Iterator iter:iterators){
			minHeap.add(new IntIter(iter));
		}
		while(!minHeap.isEmpty()){
			IntIter curIter = minHeap.poll();
			result.add(curIter.next);
			if(curIter.iter.hasNext()){
				minHeap.add(new IntIter(curIter.iter));
			}
		}
		return result;
	}
}
