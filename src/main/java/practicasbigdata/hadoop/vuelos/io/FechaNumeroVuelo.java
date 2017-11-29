package practicasbigdata.hadoop.vuelos.io;

import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class FechaNumeroVuelo implements WritableComparable<FechaNumeroVuelo> {

    private String fechaISO;
    private String numeroVuelo;

    public FechaNumeroVuelo() {
    }

    public FechaNumeroVuelo(String fechaISO, String numeroVuelo) {
        this.fechaISO = fechaISO;
        this.numeroVuelo = numeroVuelo;
    }

    public String getFechaISO() {
        return fechaISO;
    }

    public void setFechaISO(String fechaISO) {
        this.fechaISO = fechaISO;
    }

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public int compareTo(FechaNumeroVuelo o) {
        // Simplificacion
        return (getFechaISO() + getNumeroVuelo()).compareTo(o.getFechaISO() + o.getNumeroVuelo());
    }

    public void write(DataOutput dataOutput) throws IOException {
        dataOutput.writeUTF(getFechaISO());
        dataOutput.writeUTF(getNumeroVuelo());

    }

    public void readFields(DataInput dataInput) throws IOException {
        setFechaISO(dataInput.readUTF());
        setNumeroVuelo(dataInput.readUTF());

    }

    @Override
    public String toString() {
        return String.format("%s,%s", getFechaISO(), getNumeroVuelo());
    }
}
