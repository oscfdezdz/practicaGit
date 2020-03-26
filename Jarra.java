public class Jarra { //variables de instancia
	private int cantidad;	
	private int capacidad;

	public Jarra(int capacidadInicial){
		if(capacidadInicial<=0){
			throw new RuntimeException("ERROR: no se pueden crear jarras “ + "con capacidad menor o igual que cero.");
		}
		this.capacidad=capacidadInicial;
	}

	public bool llena(){
		return this.cantidad=this.capacidad;
	}

	public bool vacia(){
		return this.cantidad=0;
	}
	} //  Aquí vendrán después los métodos creados en la siguiente fase

	
	public int capacidad(){
		return this.capacidad;
	}
	
	public int cantidad(){
		return this.cantidad;
	}
	

	public void llenaDesde(Jarra j){
		while((this.cantidad<this.capacidad)&&(j.cantidad>0)){
		this.cantidad++;
		j.cantidad--;
		}
		}
		public String toString(){
		return ("("+this.capacidad+","+this.cantidad+")");
		}

	public void metodoComunitario(){ // Comentario incluido para pruebas
		System.out.println("Jose Maria Dominguez Perez");
	}

	public Object clone() throws CloneNotSupportedException{
		return (Jarra) super.clone();
	}

	public bool equals(JarraotraJarra){
		bool eqs= false;
		if (null == otraJarra){eqs= false;}
		else if (this == otraJarra){eqs= true;}
		else if (otraJarrainstanceOfJarra.class){
			eqs= this.capacidad== otraJarra.capacidad &&
			this.cantidad== otraJarra.cantidad;
		} else {eqs= false;}
		return eqs;
	}
}
//>>>>>>> 6978fb10e3b1a061eb94ebe5169d6a9ecff5aca3
