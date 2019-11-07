package ohtu.verkkokauppa;

interface VarastoInterface {
    public static Viitegeneraattori getInstance();
    public Tuote haeTuote(int id);
    public int saldo(int id);
    public void otaVarastosta(Tuote t);
    public void palautaVarastoon(Tuote t);
    private void alustaTuotteet();
}
