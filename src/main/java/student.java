import java.util.Arrays;

public class student {

    private String firstName;
    private String lastName;
    private String przedmiot;
    private String rok;
    private String semestr;
    private String klasa;
    private String ocenyString;
    private String [] ocenyStringTab;
    private float [] ocenyValueTab;
    private String srednia;

    @Override
    public String  toString() {
        return "student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", przedmiot='" + przedmiot + '\'' +
                ", rok='" + rok + '\'' +
                ", semestr='" + semestr + '\'' +
                ", klasa='" + klasa + '\'' +
                ", ocenyString='" + ocenyString + '\'' +
                ", ocenyStringTab=" + Arrays.toString(ocenyStringTab) +
                ", srednia='" + srednia + '\'' +
                '}';
    }

    public student(String firstName, String lastName, String przedmiot, String rok,
                   String semestr, String klasa, String ocenyString,
                   String[] ocenyStringTab,float [] ocenyValueTab, String srednia) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.przedmiot = przedmiot;
        this.rok = rok;
        this.semestr = semestr;
        this.klasa = klasa;
        this.ocenyString = ocenyString;
        this.ocenyStringTab = ocenyStringTab;
        this.ocenyValueTab = ocenyValueTab;
        this.srednia = srednia;
    }

    public String getFirstName() {
        return firstName;
    }

    public float[] getOcenyValueTab() {
        return ocenyValueTab;
    }

    public void setOcenyValueTab(float[] ocenyValueTab) {
        this.ocenyValueTab = ocenyValueTab;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPrzedmiot() {
        return przedmiot;
    }

    public void setPrzedmiot(String przedmiot) {
        this.przedmiot = przedmiot;
    }

    public String getRok() {
        return rok;
    }

    public void setRok(String rok) {
        this.rok = rok;
    }

    public String getSemestr() {
        return semestr;
    }

    public void setSemestr(String semestr) {
        this.semestr = semestr;
    }

    public String getKlasa() {
        return klasa;
    }

    public void setKlasa(String klasa) {
        this.klasa = klasa;
    }

    public String getOcenyString() {
        return ocenyString;
    }

    public void setOcenyString(String ocenyString) {
        this.ocenyString = ocenyString;
    }

    public String[] getOcenyStringTab() {
        return ocenyStringTab;
    }

    public void setOcenyStringTab(String[] ocenyStringTab) {
        this.ocenyStringTab = ocenyStringTab;
    }

    public String getSrednia() {
        return srednia;
    }

    public void setSrednia(String srednia) {
        this.srednia = srednia;
    }

    private void pobierzDanezKlawiatury() {};
    private void przeliczDaneDoWartosciLiczbowych(){};
    private void obliczSredniaOcen () {};
    private void zamienSredniaNaString (){};
    private void zapisDoPliku () {};
}
