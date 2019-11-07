package ohtu.verkkokauppa;

interface PankkiInterface {
    public static Viitegeneraattori getInstance();
    public boolean tilisiirto(String nimi, int viitenumero, String tililta, String tilille, int summa);
}
