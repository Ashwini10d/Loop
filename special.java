import java.util.Scanner;
class special{
	public static void main(String[]args){
		for(char ch=32;ch<=126;ch++){
			if((ch < '0') || (ch > '9' && ch < 'A') || (ch > 'Z' && ch < 'a') || (ch > 'z')) {
			System.out.println(ch+" ");
		}
	}
}
}