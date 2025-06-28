//
public class Que {
public static void main(String[] args) {
	String given="crab";
	String result="";
	for(char ch='a';ch<='z';ch++) {
		if(given.indexOf(ch)!=-1 && given.indexOf(ch)!=1) {
		result=result+ch;
		
	}}
		System.out.println("output1="+result);
		//
		String given1="ball";
		String result1="";
		for(char ch='a';ch<='z';ch++) {
			if(given1.indexOf(ch)!=-1 && given1.indexOf(ch)!=2 && given1.indexOf(ch)!=3) {
			result1=result1+ch;
			
		}}
			System.out.println("output2="+result1);
			//
			String given2="adobe";
			String result2="";
			for(char ch='a';ch<='z';ch++) {
				if(given2.indexOf(ch)!=-1 && given2.indexOf(ch)!=1 && given2.indexOf(ch)!=2 && given2.indexOf(ch)!=4) {
				result2=result2+ch;
				
			}}
				System.out.println("output3="+result2);
				//
				String given3="area";
				String result3="";
				for(char ch='a';ch<='z';ch++) {
					if(given3.indexOf(ch)!=-1 && given3.indexOf(ch)!=1 && given3.indexOf(ch)!=2) {
					result3=result3+ch;
					
				}}
					System.out.println("output4="+result3);
			
}
}
