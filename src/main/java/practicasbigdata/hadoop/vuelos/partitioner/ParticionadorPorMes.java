package practicasbigdata.hadoop.vuelos.partitioner;

import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.mapreduce.Partitioner;
import practicasbigdata.hadoop.vuelos.io.FechaNumeroVuelo;

public class ParticionadorPorMes extends Partitioner<FechaNumeroVuelo, DoubleWritable> {

    public int getPartition(FechaNumeroVuelo key, DoubleWritable value, int numReducers) {

        String[] fecha = key.getFechaISO().split("-");
        return Integer.parseInt(fecha[1]) - 1;
    }
}
