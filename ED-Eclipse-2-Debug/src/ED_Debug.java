
public class ED_Debug {

	
	public static void funcion1() {
		
		int a=2;
		
		String string1 = "string1";

		String string2 = "string2";
		
		
		// Qué hacen estas dos líneas de código???
		
		string2= string2.substring(0, string2.length()-1);
		string2=string2+"1";
		
		// Esta función tiene errores
		// Por qué no va el ==   ???
		
		// Qué tengo que hacer para solucionarlo ???
		
		if(string1 == string2 ) {
			System.out.println("SON IGUALES " + a);
			
		}
		else {
			System.out.println("SON DIFERENTES");
		}
		
		
		
	}
	
	
	public void funcion2() {
		
		System.out.println("--------------------");
		System.out.println("Esta es la función 2");
		System.out.println("Cómo hago la llamada para que funcione????");
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 3;
		int i;
		for(i = 0; i<10; i++)
			a *= i;
		
		System.out.println("El valor de a es: "+a);
		
		
		funcion1();
		
		//Esta función no me va ... ¿ por que ?
		// Tengo dos soluciones .. ¿como?
		// funcion2();
	}

}
