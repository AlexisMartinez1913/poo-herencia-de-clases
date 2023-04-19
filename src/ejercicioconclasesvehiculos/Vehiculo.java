package ejercicioconclasesvehiculos;

public class Vehiculo {
	
	protected String placa;
	
	public Vehiculo(String placa) {
		this.placa = placa;
		
	}
	//constructor vacio
	public Vehiculo() {
		
	}


	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	
	public static void main(String[]ars) {
            //objetos
		Moto yamahaFz25 = new Moto(250,"IEV88A");
                Moto aktNkd = new Moto(125,"ABC22C");
                Moto yamaha_nmax = new Moto(155,"ALC33D");
		System.out.println(yamahaFz25.calcularImpuesto());
                System.out.println(aktNkd.calcularImpuesto());
                System.out.println(yamaha_nmax.calcularImpuesto());
	}

	
	
	

}
