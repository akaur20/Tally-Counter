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
	
}
