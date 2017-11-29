package practicasbigdata.hadoop.vuelos.reducer;

import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.mapreduce.Reducer;
import practicasbigdata.hadoop.vuelos.io.FechaNumeroVuelo;

import java.io.IOException;

public class ReductorDistanciasMes extends Reducer<FechaNumeroVuelo, DoubleWritable, FechaNumeroVuelo, DoubleWritable> {

    @Override
    protected void reduce(FechaNumeroVuelo key, Iterable<DoubleWritable> values, Context context)
            throws IOException, InterruptedException {

        double distancia = 0.0;

        for (DoubleWritable d : values) {
            distancia += d.get();
        }

        context.write(key, new DoubleWritable(distancia));
    }
}
