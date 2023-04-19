package ejercicioconclasesvehiculos;
//la clase Moto hereda metodos y atributos de la clase vehiculo - extends
public class Moto extends Vehiculo {
	private int cilindraje;

	
	public Moto(int cilindraje, String placa) {
		super(placa); //atributo heredado
		this.cilindraje = cilindraje;
		// TODO Auto-generated constructor stub
	}
	
	

	public int getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}
	
	public int calcularImpuesto() {
		int impuesto = 0;
		if (this.cilindraje >150) {
			impuesto = 90000;
		}
		else {
			impuesto = 45000;
		}
		
		return impuesto;
	}

	
	

}
