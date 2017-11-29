package practicasbigdata.hadoop.vuelos;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.compress.SnappyCodec;
import org.apache.hadoop.mapred.lib.CombineSequenceFileInputFormat;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.SequenceFileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.SequenceFileOutputFormat;
import org.apache.log4j.Logger;
import practicasbigdata.hadoop.vuelos.io.FechaNumeroVuelo;
import practicasbigdata.hadoop.vuelos.mapper.MapeadorDistancias;
import practicasbigdata.hadoop.vuelos.mapper.MapeadorSecuencia;
import practicasbigdata.hadoop.vuelos.mapper.MapeadorVuelosMes;
import practicasbigdata.hadoop.vuelos.partitioner.ParticionadorPorMes;
import practicasbigdata.hadoop.vuelos.reducer.ReductorDistanciaTotal;
import practicasbigdata.hadoop.vuelos.reducer.ReductorDistanciasMes;

public class CalcularDistanciasMes {

    private static final Logger LOG = Logger.getLogger(CalcularDistanciasMes.class.getName());

    public static void main(String[] args) {
        try {

            Configuration config = new Configuration();
            Job trabajo = Job.getInstance(config, "Distancias-Mes-DVI");

            trabajo.setJarByClass(CalcularDistanciasMes.class);

            configJob(trabajo);

            FileInputFormat.addInputPath(trabajo, new Path(args[0]));
            FileOutputFormat.setOutputPath(trabajo, new Path(args[1]));

            boolean ok = trabajo.waitForCompletion(true);
            LOG.info("Trabajo terminado: " + ok);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void configJob(Job trabajo) {
        trabajo.setMapperClass(MapeadorVuelosMes.class);
        trabajo.setMapOutputKeyClass(FechaNumeroVuelo.class);
        trabajo.setMapOutputValueClass(DoubleWritable.class);

        trabajo.setPartitionerClass(ParticionadorPorMes.class);
        trabajo.setNumReduceTasks(12);

        trabajo.setReducerClass(ReductorDistanciasMes.class);
        //trabajo.setCombinerClass(ReductorDistanciasMes.class);

        trabajo.setInputFormatClass(SequenceFileInputFormat.class);

        trabajo.setOutputKeyClass(FechaNumeroVuelo.class);
        trabajo.setOutputValueClass(DoubleWritable.class);
    }

}