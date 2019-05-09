package br.senai.sp.estacionafacil.modelo;

public class Movimentacao {

    private int codMovimento;
    private String placa;
    private String dataHoraEntrada;
    private String dataHoraSaida;
    private String modeloCarro;
    private Integer tempoPermanecia;
    private Double valorPago;

    public int getCodMovimento() {
        return codMovimento;
    }

    public void setCodMovimento(int codMovimento) {
        this.codMovimento = codMovimento;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getDataHoraEntrada() {
        return dataHoraEntrada;
    }

    public void setDataHoraEntrada(String dataHoraEntrada) {
        this.dataHoraEntrada = dataHoraEntrada;
    }

    public String getDataHoraSaida() {
        return dataHoraSaida;
    }

    public void setDataHoraSaida(String dataHoraSaida) {
        this.dataHoraSaida = dataHoraSaida;
    }

    public Integer getTempoPermanecia() {
        return tempoPermanecia;
    }

    public void setTempoPermanecia(Integer tempoPermanecia) {
        this.tempoPermanecia = tempoPermanecia;
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
                "codMovimento=" + codMovimento +
                ", placa='" + placa + '\'' +
                ", dataHoraEntrada='" + dataHoraEntrada + '}';
    }
}
