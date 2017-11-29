package practicasbigdata.hadoop.vuelos;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.compress.SnappyCodec;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.SequenceFileOutputFormat;
import practicasbigdata.hadoop.vuelos.io.DatosVuelo;
import practicasbigdata.hadoop.vuelos.io.FechaNumeroVuelo;
import practicasbigdata.hadoop.vuelos.mapper.MapeadorDistancias;
import practicasbigdata.hadoop.vuelos.mapper.MapeadorDistanciasSplit;

public class TransformaVuelos {

    public static void main(String[] args) {
        try {

            Configuration config = new Configuration();
            Job trabajo = Job.getInstance(config, "Transorma Vuelos - DVI");

            trabajo.setJarByClass(TransformaVuelos.class);

            trabajo.setMapperClass(MapeadorDistanciasSplit.class);
            trabajo.setOutputKeyClass(FechaNumeroVuelo.class);
            trabajo.setOutputValueClass(DatosVuelo.class);

            FileInputFormat.addInputPath(trabajo, new Path(args[0]));
            FileOutputFormat.setOutputPath(trabajo, new Path(args[1]));

            trabajo.setNumReduceTasks(0);

            trabajo.setOutputFormatClass(SequenceFileOutputFormat.class);
            FileOutputFormat.setCompressOutput(trabajo, true);
            FileOutputFormat.setOutputCompressorClass(trabajo, SnappyCodec.class);

            boolean ok = trabajo.waitForCompletion(true);
            System.out.println("Trabajo terminado: " + ok);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}