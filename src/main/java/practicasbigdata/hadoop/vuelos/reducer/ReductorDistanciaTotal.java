package practicasbigdata.hadoop.vuelos.reducer;

import java.io.IOException;

import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class ReductorDistanciaTotal extends Reducer<Text, DoubleWritable, Text, DoubleWritable>{

    @Override
    protected void reduce(Text vuelo, Iterable<DoubleWritable> distancias,
                          Reducer<Text, DoubleWritable, Text, DoubleWritable>.Context context) throws IOException, InterruptedException {

        double distanciaTotal = 0.0;
        for (DoubleWritable d : distancias) {
            distanciaTotal += d.get();
        }

        context.write(vuelo, new DoubleWritable(distanciaTotal));
    }
}