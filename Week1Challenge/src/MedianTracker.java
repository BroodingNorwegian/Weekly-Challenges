import java.util.ArrayList;
import java.util.Collections;


public class MedianTracker {
	
	ArrayList<Double> numList;
	
	public MedianTracker()
	{
		numList = new ArrayList<Double>();
	}
	
	public void insert(double numToAdd)
	{
		numList.add(numToAdd);
	}
	
	public double getMedian()
	{
		Collections.sort(numList);
		
		if(numList.size() == 0)
		{
			return 0;
		}
		
		if(numList.size()%2 == 0)
		{
			return numList.get(numList.size()/2);
		}
		else
		{
			int highHalf = (int)Math.ceil((double)numList.size()/2.0);
			int lowHalf = (int)Math.floor((double)numList.size()/2.0);
			return (numList.get(highHalf - 1) + numList.get(lowHalf - 1))/2.0;
		}
	}

	public static void main(String[] args) 
	{
		MedianTracker mt = new MedianTracker();
		System.out.println(mt.getMedian());
		
		mt.insert(1);
		mt.insert(2);
		mt.insert(3);
		mt.insert(4);
		mt.insert(9);
		mt.insert(8);
		mt.insert(7);
		mt.insert(6);
		mt.insert(5);
		
		System.out.println(mt.getMedian());
		
	}

}
