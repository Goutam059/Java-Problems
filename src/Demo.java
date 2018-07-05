import java.util.ArrayList;
import java.util.List;




public class Demo {
	
	public static void main(String[] args) {
		
/*Scanner input = new Scanner(System.in);	
while (input.hasNext()) {
    System.out.print(input.nextLine());
}*/
		
	int[][] arr= {{5, 1, 9,5},{7, 5, 3},{2,4,6,8}};
	
	int min = 0;
	int max=0;
	int diff=0;
	List<Integer> l=new ArrayList<Integer>();
	List<Integer> l1=new ArrayList<Integer>();
	List<Integer> l2=new ArrayList<Integer>();
for(int i=0;i<arr.length;i++)
{
	for(int j=0;j<arr.length;j++)
	{
		
		if(arr[i][j]<min) 
		{
		
			min=arr[i][j];
			System.out.println("min1 "+min);
			}
		if(arr[i][j]>max) {
			max=arr[i][j];
			System.out.println("max1 "+max);
			System.out.println("max1 "+max);

		}
		
		
		
		
	}}
	
System.out.println("min"+min);
System.out.println("max"+max);
diff=max-min;
System.out.println(diff);
l.add(diff);

//System.out.println(diff);

	}
	}
	


