
public class MZFecha {

	
	private int dia;
	private int mes;
	private int anyo;
	
	
	
	public MZFecha(int dia, int mes, int anyo) {
		if(comprueba(dia,mes,anyo)) {
			this.dia = dia;
			this.mes=mes;
			this.anyo=anyo;
		}
		else {
			System.err.print("ERROR: Fecha incorrecta: "+dia+"/"+mes+"/"+anyo);
		}
	}


	public MZFecha() {
		this.dia = 1;
		this.mes = 1;
		this.anyo = 1970;
	}
	
	
	
	public void setFecha(int d, int m, int a) {
		
		if(comprueba(d,m,a)) {
			this.dia = d;
			this.mes=m;
			this.anyo=a;
		}
		else {
			System.err.print("ERROR: Fecha incorrecta: "+d+"/"+m+"/"+a);
		}
	}

	public int getDia() {
		return dia;
	}




	public void setDia(int dia) {
		this.dia = dia;
	}




	public int getMes() {
		return mes;
	}




	public void setMes(int mes) {
		this.mes = mes;
	}




	public int getAnyo() {
		return anyo;
	}




	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	
	
	public void imprime() {
		
		System.out.println(String.format("%02d/%02d/%04d",this.dia,this.mes,this.anyo));
		
	}


	public boolean esBisiesto(int a) {
		boolean ret = false;
		if(a%4==0 && (a%100==1 || a%400==0) ) {
			ret = true;
		}
		return ret;
	}
	
	public boolean comprueba(int d,int m, int a) {
		
		boolean ret = false;
		
		if(a>1 && a<10000) {
		
			switch(m) {
					case 11:
					case 4:
					case 6:
					case 9:
							if(d>=1 && d<=30)
								ret=true;
						break;
			
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12:
							if(d>=1 && d<=31)
								ret=true;
						break;
			
					case 2:
							if(esBisiesto(a)) {
								 if( d>=1 && d<=29 ) {
									 ret=true;
								 }
							}
							else {
								 if( d>=1 && d<=28 ) {
									 ret=true;
								 }
							}

			}
			
			
			
		}
		return ret;
	}
	
	
	/**
	 * ESTA FUNCION TIENE FALLOS
	 * Debe calcular los días de la siguiente manera: 
	 * 
	 * 		- Año completo: 365 días:
	 * 		- Mes completo 30 días
	 * */
	
	
	public int diasdesdeInicio() {
		
		int r;
		int dif_anyo = Math.abs(this.anyo - 1970);

		r = dif_anyo * 365;
		
		int dias = (this.mes) * 30 + this.dia;
		
		return dias;
	}
	
	
	/**
	 * 
	 * ESTA FUNCIÓN TIENE ERRORES:
	 * 
	 * 	- A veces da negativo
	 * */
	public int diferenciaDias(MZFecha f) {
		int dias1= this.diasdesdeInicio();
		int dias2= f.diasdesdeInicio();
		
		return dias2-dias1;
		
	}
}
