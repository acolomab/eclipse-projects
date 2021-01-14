
public class EDEclipse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MZFecha f1 = new MZFecha(15,3,2020);
		MZFecha f2 = new MZFecha(15,3,2000);
		f1.imprime();
		
		//f1.setFecha(29, 2, 1999);


		System.out.println(f1.diferenciaDias(f2));
	}

}
