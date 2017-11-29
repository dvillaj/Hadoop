package practicasbigdata.hadoop.vuelos.mapper;

import java.io.IOException;

import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class MapeadorDistancias extends Mapper<LongWritable, Text, Text, DoubleWritable> {

    @Override
    protected void map(
            LongWritable key,
            Text value,
            Mapper<LongWritable, Text, Text, DoubleWritable>.Context context
    ) throws IOException, InterruptedException {
        String[] campos = value.toString().split(",");

        String vuelo = campos[9];

        double distancia = 0.0;
        try {
            distancia = Double.parseDouble(campos[18]);
        } catch (NumberFormatException e) {
            // No hay que hacer nada
        }

        context.write(new Text(vuelo), new DoubleWritable(distancia));
    }
}