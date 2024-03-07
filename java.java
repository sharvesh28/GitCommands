public class OneDarrays{
	int arr[]={26,56,43,37,38};
	public static void main(String[] args){
		OneDarrays obj = new OneDarrays();
		System.out.println("The array values are:");
		for (int i=0; i<5; i++){
			System.out.println(obj.arr[i]);
		}
		int sum=0;
		double avg =0.0;
		for(int i=0; i<5; i++){
			System.out.println("Current sum is:"+ sum);
			System.out.println("Current array value is:"+ obj.arr[i]);
			sum = sum+obj.arr[i];
		}
		System.out.println("The sum of all the array values is:"+sum);
		avg = sum/5;
		System.out.println("The avg of all the ages is:"+ avg);
	}
}