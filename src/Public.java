public class Public extends Aeropuertos {
    String DineroGObierno[][] = {
            {"150.000.000, 200.000.000, 320.000.000, 170.000.000"},
            {"50.000.000, 75.000.000, 205.000.000, 102.200.000"},
    } ;

    public String[][] getDineroGObierno() {
        return DineroGObierno;
    }

    public void setDineroGObierno(String[][] dineroGObierno) {
        DineroGObierno = dineroGObierno;
    }
}