class Solution {
    public void mergeSort(int[] arr,int l, int r)
    {
        if(l<r)
        {
            int mid = l+(r-l)/2;

            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);

            merge(arr,l,mid,r);
        }
    }

    public void merge(int[] arr,int l,int mid ,int r)
    {
        int n1 = mid - l+1;
        int n2 = r-mid;

        int[] a1 = new int[n1];
        int[] a2 = new int[n2];

        for(int i = 0;i<n1;i++)
        {
            a1[i] = arr[i+l];
        }
        for(int i = 0;i<n2;i++)
        {
            a2[i] = arr[i+mid+1];
        }

        int x = 0;
        int y = 0;

        int k = l;

        while(x<n1 && y<n2)
        {
            if(a1[x]<=a2[y])
            {
                arr[k] = a1[x];
                x++;
            }
            else{
                arr[k] = a2[y];
                y++;
            }
            k++;
        }
        while(x<n1)
        {
            arr[k] = a1[x];
            x++;
            k++;
        }
          while(y<n2)
        {
            arr[k] = a2[y];
            y++;
            k++;
        }
    }
    public int[] sortArray(int[] arr) {
        mergeSort(arr,0,arr.length-1);
        return arr;
    }
}