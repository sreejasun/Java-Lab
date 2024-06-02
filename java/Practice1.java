public class Practice1 {
    public static int buy(int arr[])
    {
        int p=0;
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            p=Math.max(p,arr[i]-min);
            min=Math.min(min,arr[i]);
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[]={7,1,5,4,3,6};
        int b=buy(arr);
        System.out.println(b);    
    }
    
}
