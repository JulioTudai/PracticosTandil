package P5E7;

public class Main {    public static void main(String[] args) {
    // Crear instancia de Empresa
    Empresa empresa = new Empresa();

    // Crear empleados
    Empleado vendedor = new Vendedor("Martín", 27832123, 15000, 500, 10); // 10 ventas, 500 por venta
    Empleado empleadoConBono = new EmpleadoBono("Julián", 29456789, 13000, 1000, 50, 55); // Bono de 1000 por 50 ventas, hizo 55
    Empleado empleadoComun = new EmpleadoComun("Juan", 30123456, 17000);

    // Agregar empleados a la empresa
    empresa.addEmpleados(vendedor);
    empresa.addEmpleados(empleadoConBono);
    empresa.addEmpleados(empleadoComun);

    // Calcular y mostrar el gasto total en sueldos
    double totalGastos = empresa.calcularGastosDeEmpleados();
    System.out.println("Gasto total en sueldos: $" + totalGastos);
    }
}

