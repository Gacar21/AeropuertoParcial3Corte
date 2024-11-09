package airport;

public class Public extends Aeropuertos {
    String DineroGObierno[] = {"150.000.000", "200.000.000" ,"320.000.000", "170.000.000"};

    public String[] getDineroGObierno() {
        return DineroGObierno;
    }

    public void setDineroGObierno(String[] dineroGObierno) {
        DineroGObierno = dineroGObierno;
    }
}