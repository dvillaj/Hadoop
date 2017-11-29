package practicasbigdata.hadoop.vuelos;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import practicasbigdata.hadoop.vuelos.mapper.MapeadorDistancias;
import practicasbigdata.hadoop.vuelos.reducer.ReductorDistanciaTotal;

public class CalcularDistancias {

    public static void main(String[] args) {
        try {

            Configuration config = new Configuration();
            Job trabajo = Job.getInstance(config, "Distancias-DVI");

            trabajo.setJarByClass(TransformaVuelos.class);

            configJob(trabajo);

            FileInputFormat.addInputPath(trabajo, new Path(args[0]));
            FileOutputFormat.setOutputPath(trabajo, new Path(args[1]));


            // Ejecutar el código de forma sincrona
            //trabajo.submit();

            boolean ok = trabajo.waitForCompletion(true);
            System.out.println("Trabajo terminado: " + ok);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void configJob(Job trabajo) {
        trabajo.setMapperClass(MapeadorDistancias.class);
        trabajo.setMapOutputKeyClass(Text.class);
        trabajo.setMapOutputValueClass(DoubleWritable.class);

        trabajo.setReducerClass(ReductorDistanciaTotal.class);
        trabajo.setCombinerClass(ReductorDistanciaTotal.class);

        trabajo.setOutputKeyClass(Text.class);
        trabajo.setOutputValueClass(DoubleWritable.class);
    }

}