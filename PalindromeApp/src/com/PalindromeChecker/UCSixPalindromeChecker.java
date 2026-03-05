package  com.PalindromeChecker;
import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
public class UCSixPalindromeChecker {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String input = sc.next();
		
		int n = input.length();
		
		System.out.println("Input String: " + input);
		
		char[] chars = input.toCharArray();
		
		
		boolean pall = true;
		
		Stack<Character> st = new Stack<>();
		
		Queue<Character> q = new LinkedList<>();
		 
		
		
		int i = 0;
		while(i < n) {
			st.push(chars[i]);
			q.add(chars[i]);
			i++;
		}
		
		
		for(int r = 0; r < n; r++) {
			char stackchar = st.pop();
			char queuechar = q.poll();
			
			if(stackchar != queuechar){
				pall = false;
				break;
			}
			
		}
		
		
		System.out.println("Is Pallindrome: " + pall);
		sc.close();
	
	}
}