//Counting No. Of Vowels Present in  String

class Count_Vowels{
	public static void main(String args[]){
		String name = "samarth deelip kalegaonkar";
		
		
		int count=0;
		for(int i=0;i<name.length();i++){
			if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u')
			{
				count++;
			}
		}
		System.out.println("Vowels present in Given String is:"+count);
	}
}