package airport;

public class Companies {

    //compañias de aeropuertos privados
    String JFK[] = {": Privately Managed", "Emirates", "Turkish Airlines", "Cathay Pacific"};
    String privatesuite[] = {": EAsport ", "Etihad", "Korean Air", "All Nippon Airways"};
    String Jetex[] = {": EAsport ", "Lufthansa", "Air France", "British Airways"};
    String Bourget[] = {": EAsport ", "Swiss International", "Qantas", "Aeroflot"};

    // compañias de aeropuertos publicos
    String Kennedy[] = {"Ethiopian Airlines", "Iberia", "Aegean Airlines", "Finnair" };
    String Hare[] = {"TAP Air Portugal", "Alitalia", "Olympic Air", "SAS Scandinavian" };
    String Hartsfield[] = {"Air Canada", "LOT Polish", "Avianca", "Eurowings" };
    String Jackson[] = {"JetBlue", "LATAM", "Kenya Airways", "TAP Air Portugal" };

    public String[] getKennedy() {
        return Kennedy;
    }

    public void setKennedy(String[] kennedy) {
        Kennedy = kennedy;
    }

    public String[] getJFK() {
        return JFK;
    }

    public void setJFK(String[] JFK) {
        this.JFK = JFK;
    }

    public String[] getPrivatesuite() {
        return privatesuite;
    }

    public void setPrivatesuite(String[] privatesuite) {
        this.privatesuite = privatesuite;
    }

    public String[] getJetex() {
        return Jetex;
    }

    public void setJetex(String[] jetex) {
        Jetex = jetex;
    }

    public String[] getBourget() {
        return Bourget;
    }

    public void setBourget(String[] bourget) {
        Bourget = bourget;
    }

    public String[] getHare() {
        return Hare;
    }

    public void setHare(String[] hare) {
        Hare = hare;
    }

    public String[] getHartsfield() {
        return Hartsfield;
    }

    public void setHartsfield(String[] hartsfield) {
        Hartsfield = hartsfield;
    }

    public String[] getJackson() {
        return Jackson;
    }

    public void setJackson(String[] jackson) {
        Jackson = jackson;
    }
}