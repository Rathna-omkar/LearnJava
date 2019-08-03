package ds.section2.stack;

public class App {

	public static void main(String[] args) {
		
		System.out.println(reverString("LISTEN"));
	}
	
	public static String reverString(String str){
		int length = str.length();
		Stack stk = new Stack(length);
		for(int i=0; i<length; i++){
			stk.push(str.charAt(i));
		}
		
		String result="";
		while(!stk.isEmpty()){
			result =result+stk.pop();
		}
		
		return result;
	}

}
