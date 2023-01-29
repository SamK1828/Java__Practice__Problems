//Program3 command line argument
class Main
{
    public static void main(String[] args) {
        int c=0;
        int arr[]=new int[args.length];
        for(int i=0; i<args.length ; i++){
             arr[i]=Integer.parseInt(args[i]);
        }
		c=arr[0];
        for(int i=1; i<args.length; i++)
		{
			if(c>arr[i])
			{
				c=arr[i];
			}
            
		}
		System.out.println(c);
    }
        
		
}

