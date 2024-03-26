class removeDuplicates{
	static int removeDuplicates(int a[], int n)
	{
		if (n == 0 || n == 1)
			return n;
		int[]t= new int[n];
        int j = 0;
		//to Sort Array from Duplicate Elements
		for (int i = 0; i < n - 1; i++)
				if (a[i] != a[i + 1])
				t[j++] = a[i];
		t[j++] = a[n - 1];
		for (int i = 0; i < j; i++)
			a[i] = t[i];
		return j;
	}
	public static void main(String args[])
	{
	int[] a ={1,2,2,3,3,4,5};
		int n =a.length;
		//for length of New Array
		n = removeDuplicates(a, n);
     	System.out.print("[");
		//for Displaying Array
		for (int i = 0; i < n; i++)
			System.out.print(a[i]+" ");
            System.out.print("]");
	}
}
