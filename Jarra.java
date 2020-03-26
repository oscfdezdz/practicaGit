public class Jarra { //variables de instancia
	private int cantidad;
	private int capacidad;
	public Jarra(int capacidadInicial){
		if(capacidadInicial<=0){
			throw new RuntimeException("ERROR: no se pueden crear jarras “ + "con capacidad menor o igual que cero.");
			}
		this.capacidad=capacidadInicial;
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
