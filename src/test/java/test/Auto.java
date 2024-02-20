package test;

public class Auto {
    public Asiento[] asientos = new Asiento[5];
    public String marca;
    public String modelo;
    public Motor motor;
    public int precio;
    public int registro;
    public static int cantidadCreados = 0;

    public Auto() {
        cantidadCreados++;
    }

    public int cantidadAsientos() {
        int count = 0;
        for (Asiento asiento : asientos) {
            if (asiento != null) {
                count++;
            }
        }
        return count;
    }

    public String verificarIntegridad() {
        for (Asiento asiento : asientos) {
            if (asiento != null && asiento.registro != this.registro) {
                return "Las piezas no son originales";
            }
        }
        if (motor.registro != this.registro) {
            return "Las piezas no son originales";
        }
        return "Auto original";
    }
}

