package practicasbigdata.hadoop.vuelos.mapper;

import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.mapreduce.Mapper;
import practicasbigdata.hadoop.vuelos.io.DatosVuelo;
import practicasbigdata.hadoop.vuelos.io.FechaNumeroVuelo;

import java.io.IOException;

public class MapeadorVuelosMes extends Mapper<FechaNumeroVuelo, DatosVuelo, FechaNumeroVuelo, DoubleWritable> {

    @Override
    protected void map(FechaNumeroVuelo key, DatosVuelo value, Context context) throws IOException, InterruptedException {
        context.write(key, new DoubleWritable(value.getDistancia()));
    }
}
