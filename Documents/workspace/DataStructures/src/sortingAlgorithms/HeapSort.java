package sortingAlgorithms;

public class HeapSort {
	public int heapSort(int [] nums, int k)
	{
		if(nums == null || nums.length == 0 || k < 1 || k > nums.length)
			throw new IllegalArgumentException("Input is invalid");

		buildHeap(nums);

		int size = nums.length;

		for(int i = 1;i < k;i++)
		{
			swap(nums,0,size - 1);
			size--;
			maxHeap(nums,0,size);
		}

		return nums[0];
	}

	private void buildHeap(int [] nums)
	{
		for(int i = nums.length / 2;i >= 0;i--)
			maxHeap(nums,i,nums.length);
	}

	private void maxHeap(int [] nums, int parent, int size)
	{
		int l = parent * 2 + 1;
		int r = l + 1;
		int largest = parent;

		if(l < size && nums[l] > nums[largest])
			largest = l;

		if(r < size && nums[r] > nums[largest])
			largest = r;

		if(largest != parent)
		{
			swap(nums,largest,parent);
			maxHeap(nums,largest,size);
		}
	}

	private void swap(int [] nums, int i, int j)
	{
		int t = nums[i];
		nums[i] = nums[j];
		nums[j] = t;
	}

	public static void print(int[] x) {
		for (int i = 0; i < x.length; ++i)
			System.out.print(x[i] + " ");
		System.out.println();
	}
	public static void main(String [] args) {
		HeapSort h=new HeapSort();
		int []set1  = {1,2,3,4,5,6,7,8,9,10};
		int []set2  = {10,9,8,7,6,5,4,3,2,1};
		int []set3  = {62,50,50,50,62};
		System.out.println("raw array:");
		print(set1);
		h.heapSort(set1,set1.length);
		System.out.println("Sorted array:");
		print(set1);
		System.out.println("raw array:");
		print(set2);
		h.heapSort(set2,set2.length);
		System.out.println("Sorted array:");
		print(set2);
		System.out.println("raw array:");
		print(set3);
		h.heapSort(set3,set3.length);
		System.out.println("Sorted array:");
		print(set3);
	}
}