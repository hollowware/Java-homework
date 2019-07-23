package homework;

public class Op018 {
	public static void main(String[] args) {
		simpleAlphabet();
		charAlphabet();
		charAlphabet2();
	}

	private static void simpleAlphabet() {
		char [] alph = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		System.out.println(alph);
	}

	private static void charAlphabet() {
		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		System.out.println(alphabet);
	}

	private static void charAlphabet2() {
		char[] alphabet = new char[26];
		for( int i = 0; i < 26; i++ ) {
			alphabet[i] = (char)( 'a' + i ); // How he knows what goes after 'a'? He knows about locale eng? 
		}
		System.out.println(alphabet); 
	}
}
 