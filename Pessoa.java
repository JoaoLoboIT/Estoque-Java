public class Pessoa implements iMyObject, Comparavel{
    private String nome;
    private String key;

    public Pessoa(String nome, String key) {
        this.nome = nome;
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
    @Override
    public int comparar(Object o) {
        Pessoa outraPessoa = (Pessoa) o;
        return this.nome.compareTo(outraPessoa.nome);
    }
    @Override
    public String toString() {
        return "Pessoa{nome='" + nome + "', key='" + key + "'}";
    }
}
