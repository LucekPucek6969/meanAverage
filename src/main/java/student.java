import java.util.Scanner;

public class student {

    private String firstName;
    private String lastName;
    private String przedmiot;
    private String rok;
    private String semestr;
    private String klasa;
    private String ocenyString;
    private String [] ocenyStringTab;
    private double [] ocenyValueTab;
    private String sredniaString;

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
                ", sredniaString='" + sredniaString + '\'' +
                '}';
    }

    public student(String firstName, String lastName, String przedmiot, String rok,
                   String semestr, String klasa, String ocenyString,
                   String[] ocenyStringTab, double[] ocenyValueTab, String srednia) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.przedmiot = przedmiot;
        this.rok = rok;
        this.semestr = semestr;
        this.klasa = klasa;
        this.ocenyString = ocenyString;
        this.ocenyStringTab = ocenyStringTab;
        this.ocenyValueTab = ocenyValueTab;
        this.sredniaString = srednia;
    }

    public String getFirstName() {
        return firstName;
    }

    public double[] getOcenyValueTab() {
        return ocenyValueTab;
    }

    public void setOcenyValueTab(double[] ocenyValueTab) {
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

    public String getSredniaString() {
        return sredniaString;
    }

    public void setSredniaString(String sredniaString) {
        this.sredniaString = sredniaString;
    }

    private void pobierzDanezKlawiatury() {
        Scanner klawiatura = new Scanner(System.in);
        System.out.print("podaj imie ucznia: ");
        firstName = klawiatura.nextLine();

        System.out.print("podaj nazwisko ucznia: ");
        lastName = klawiatura.nextLine();

        System.out.print("podaj przedmiot: ");
        przedmiot = klawiatura.nextLine();

        System.out.print("podaj oceny oddzielone przecinkiem \n" +
                "(dopuszczalene oceny " +
                "to:1,1+,2-,2,2+,3-,3,3+,4-,4,4+,5-,5,5+,6-,6): \n");

        ocenyString = klawiatura.nextLine();

        ocenyStringTab = ocenyString.split(",");

    }
    private double przeliczDaneDoWartosciLiczbowych(){

        double suma =0;

        for (int i = 0; i <ocenyStringTab.length ; i++) {

            switch (ocenyStringTab[i]){

                case "1":
                    ocenyValueTab[i]=1;
                    break;
                case "1+":
                    ocenyValueTab[i]=1.5;
                    break;
                case "2-":
                    ocenyValueTab[i]=1.75;
                    break;
                case "2":
                    ocenyValueTab[i]=2;
                    break;
                case "2+":
                    ocenyValueTab[i]=2.5;
                    break;
                case "3-":
                    ocenyValueTab[i]=2.75;
                    break;
                case "3":
                    ocenyValueTab[i]=3;
                    break;
                case "3+":
                    ocenyValueTab[i]=3.5;
                    break;
                case "4-":
                    ocenyValueTab[i]=3.75;
                    break;
                case "4":
                    ocenyValueTab[i]=4;
                    break;
                case "4+":
                    ocenyValueTab[i]=4.5;
                    break;
                case "5-":
                    ocenyValueTab[i]=4.75;
                    break;
                case "5":
                    ocenyValueTab[i]=5;
                    break;
                case "5+":
                    ocenyValueTab[i]=5.5;
                    break;
                case "6-":
                    ocenyValueTab[i]=5.75;
                    break;
                case "6":
                    ocenyValueTab[i]=6;
                    break;
                default:


                    System.out.print("nieprawidlowe dane ");
                    break;
            }
        }



    private double obliczSredniaOcenValue(){
            for (int i = 0; i <= ocenyValueTab.length-1; i++) {

                suma = suma+ocenyValueTab[i];

            }
            return (suma/ocenyValueTab.length);
        }

    private void zamienSredniaNaString(){}
    private void zapisDoPliku () {}
}
