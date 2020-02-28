package herenciaautomotriz;

public class EmpVendedor extends Empleado {
    private double salario;
    private double valor;
    private double quincena;

    public EmpVendedor(String rfc, String nombre, String departamento, String puesto, double salario, double valor){
        this.rfc = rfc;
        this.nombre = nombre;
        this.departamento = departamento;
        this.puesto = puesto;
        this.salario = salario;
        this.valor = valor;
    }

    public double getSalario() {
        return salario;
    }

    public double getValor() {
        return valor;
    }

    public double calcularQuincena(){
        quincena = salario + (valor * 0.02);
        return quincena;
    }
}
