package practicasbigdata.hadoop.vuelos.io;

import org.apache.hadoop.io.Writable;

import java.io.BufferedInputStream;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class DatosVuelo implements Writable {

    private String numeroVuelo;
    private String origen;
    private String destino;
    private double tiempoVuelo;
    private double retrasoSalida;
    private double retrasoLlegada;
    private double distancia;

    public DatosVuelo() {
    }

    public DatosVuelo(String numeroVuelo, String origen, String destino, double tiempoVuelo, double retrasoSalida, double retrasoLlegada, double distancia) {
        this.numeroVuelo = numeroVuelo;
        this.origen = origen;
        this.destino = destino;
        this.tiempoVuelo = tiempoVuelo;
        this.retrasoSalida = retrasoSalida;
        this.retrasoLlegada = retrasoLlegada;
        this.distancia = distancia;
    }

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getTiempoVuelo() {
        return tiempoVuelo;
    }

    public void setTiempoVuelo(double tiempoVuelo) {
        this.tiempoVuelo = tiempoVuelo;
    }

    public double getRetrasoSalida() {
        return retrasoSalida;
    }

    public void setRetrasoSalida(double retrasoSalida) {
        this.retrasoSalida = retrasoSalida;
    }

    public double getRetrasoLlegada() {
        return retrasoLlegada;
    }

    public void setRetrasoLlegada(double retrasoLlegada) {
        this.retrasoLlegada = retrasoLlegada;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public void write(DataOutput dataOutput) throws IOException {
        dataOutput.writeUTF(getNumeroVuelo());
        dataOutput.writeUTF(getOrigen());
        dataOutput.writeUTF(getDestino());
        dataOutput.writeDouble(getTiempoVuelo());
        dataOutput.writeDouble(getRetrasoSalida());
        dataOutput.writeDouble(getRetrasoLlegada());
        dataOutput.writeDouble(getDistancia());
    }

    public void readFields(DataInput dataInput) throws IOException {
        setNumeroVuelo(dataInput.readUTF());
        setOrigen(dataInput.readUTF());
        setDestino(dataInput.readUTF());
        setTiempoVuelo(dataInput.readDouble());
        setRetrasoSalida(dataInput.readDouble());
        setRetrasoLlegada(dataInput.readDouble());
        setDistancia(dataInput.readDouble());
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();

        buffer.append("Numero Vuelo:\n");
        buffer.append(getNumeroVuelo()+"\n");

        buffer.append("Origen:\n");
        buffer.append(getOrigen()+"\n");

        buffer.append("Destino:\n");
        buffer.append(getDestino()+"\n");

        buffer.append("Tiempo Vuelo:\n");
        buffer.append(getTiempoVuelo()+"\n");

        buffer.append("Retraso Salida:\n");
        buffer.append(getRetrasoSalida()+"\n");

        buffer.append("Retraso Llegada:\n");
        buffer.append(getRetrasoLlegada()+"\n");

        buffer.append("Distancia:\n");
        buffer.append(getDistancia());

        return buffer.toString();
    }
}
