/**
 * 
 * @author Avleen Kaur
 *
 */
public class TallyCounter 
{
	//Instance Variables or Fields
	
	private int count;
	
	//Constructor 
	
	public TallyCounter()
	{
		count = 0;
	}	
	public TallyCounter(int startNum)
	{
		count = startNum;
	}
	
	public void click()
	{
		count = count + 1; 
		//count++ (opposite works too count--);
		//count+=1;
	}
	
	public void unclick()
	{
		count--;
	}
	
	public void reset()
	{
		count = 0; 
	}
	
	public int getCount()
	{
		return count;
	}
	public String toString()
	{	
		return "count" + count;
	}
}

	
