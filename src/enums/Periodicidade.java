package enums;

public enum Periodicidade {
    DIARIA("Diária"),
    SEMANAL("Semanal"),
    MENSAL("Mensal"),
    BIMESTRAL("Bimestral"),
    TRIMESTRAL("Trimestral"),
    ANUAL("Anual");

    private final String descricao;

    Periodicidade(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
