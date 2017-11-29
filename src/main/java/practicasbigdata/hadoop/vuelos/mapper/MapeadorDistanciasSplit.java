package practicasbigdata.hadoop.vuelos.mapper;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import practicasbigdata.hadoop.vuelos.io.DatosVuelo;
import practicasbigdata.hadoop.vuelos.io.FechaNumeroVuelo;

import java.io.IOException;

public class MapeadorDistanciasSplit extends Mapper<LongWritable, Text, FechaNumeroVuelo, DatosVuelo> {

    @Override
    protected void map(
            LongWritable key,
            Text value,
            Mapper<LongWritable, Text, FechaNumeroVuelo, DatosVuelo>.Context context)
            throws IOException, InterruptedException {

        String[] campos = value.toString().split(",");

        // Los ficheros tienen cabecera
        if (key.get() > 1) {

            context.write(
                    new FechaNumeroVuelo(
                            campos[0] + "-" + campos[1] + "-" + campos[2],
                            campos[9]
                    ),
                    new DatosVuelo(
                            campos[9],
                            campos[16],
                            campos[17],
                            campos[13].matches("\\d+") ? Double.parseDouble(campos[13]) : 0.0,
                            campos[15].matches("\\d+") ? Double.parseDouble(campos[15]) : 0.0,
                            campos[14].matches("\\d+") ? Double.parseDouble(campos[14]) : 0.0,
                            campos[18].matches("\\d+") ? Double.parseDouble(campos[18]) : 0.0
                    )
            );
        }

    }
}