//program to write string from longest sequence of characters
Class June28{
	public static void main(String args[])
	{
		String given="crab";
		String output="";
		for(char c='a';c<='z';c++){
			if(given.indexOf(c)!=-1){
				output=output+c;
			}
			else{
				break;
			}
		}
		System.out.println("output="+output);
	}
}
