package br.senai.sp.estacionafacil.modelo;

public class Movimentacao {

    private int codEntrada;
    private String placa;
    private String horaEntrada;
    private String horaSaida;
    private String modeloCarro;
    private Integer tempoPermitido;
    private Double valorPago;

    public int getCodEntrada() {
        return codEntrada;
    }

    public void setCodEntrada(int codEntrada) {
        this.codEntrada = codEntrada;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(String horaSaida) {
        this.horaSaida = horaSaida;
    }

    public Integer getTempoPermitido() {
        return tempoPermitido;
    }

    public void setTempoPermitido(Integer tempoPermitido) {
        this.tempoPermitido = tempoPermitido;
    }

    public Double getValorPago() {
        return valorPago;
    }

    public void setValorPago(Double valorPago) {
        this.valorPago = valorPago;
    }

    public String getModeloCarro() {
        return modeloCarro;
    }

    public void setModeloCarro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

    @Override
    public String toString() {
        return "Movimentacao{" +
                "codEntrada=" + codEntrada +
                ", placa='" + placa + '\'' +
                ", horaEntrada='" + horaEntrada + '\'' +
                '}';
    }
}
