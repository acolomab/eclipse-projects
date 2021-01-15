
public class ED_Debug {

	
	public static void funcion1() {
		
		
		String string1 = "string1";
		int a=2;
		String string2 = "string2";
		
		
		string2= string2.substring(0, string2.length()-1);
		string2=string2+"1";
		
		
		// Por qué no va el ==
		
		
		if(string1 == string2 ) {
			System.out.println("SON IGUALES " + a);
			
		}
		else {
			System.out.println("SON DIFERENTES");
		}
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 3;
		int i;
		for(i = 0; i<10; i++)
			a *= i;
		
		System.out.println("El valor de a es: "+a);
		
		
		funcion1();
		
		
		
	}

}
