package practicasbigdata.hadoop.vuelos.mapper;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.log4j.Logger;
import practicasbigdata.hadoop.vuelos.io.DatosVuelo;
import practicasbigdata.hadoop.vuelos.io.FechaNumeroVuelo;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MapeadorSecuencia extends Mapper<LongWritable, Text, FechaNumeroVuelo, DatosVuelo> {

    private static final Logger LOG = Logger.getLogger(MapeadorSecuencia.class.getName());
    private String separador;
    private Pattern expresion;

    @Override
    protected void setup(Context context) throws IOException, InterruptedException {

        LOG.info("Se inicia el mapper");
        separador = context.getConfiguration().get("separador");
        expresion = Pattern.compile("(\\d{4}),(\\d{2}),(\\d{2}),(.*),(.*),(.*),(.*),(.*),(.*)" +
                ",(\\d+),(.*),(.*),(.*),(\\d+),(\\d+),(\\d+),([A-Z]{3}),([A-Z]{3}),(\\d+)");

    }

    @Override
    protected void cleanup(Context context) throws IOException, InterruptedException {

        LOG.info("Mapper terminado");
    }

    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {

        Matcher matcher = expresion.matcher(value.toString());

        if (matcher.matches()) {
            String year = matcher.group(1);
            String month = matcher.group(2);
            String day = matcher.group(3);
            String numeroVuelo = matcher.group(10);
            String tiempoVuelo = matcher.group(14);
            String retrasoSalida = matcher.group(15);
            String retrasoLlegada = matcher.group(16);
            String origen = matcher.group(17);
            String destino = matcher.group(18);
            String distancia = matcher.group(19);

            context.write(
                new FechaNumeroVuelo(year + month + day, numeroVuelo),
                new DatosVuelo(
                        numeroVuelo,
                        origen,
                        destino,
                        Double.parseDouble(tiempoVuelo),
                        Double.parseDouble(retrasoSalida),
                        Double.parseDouble(retrasoLlegada),
                        Double.parseDouble(distancia))
            );
        //} else {
        //    LOG.error("'" + value.toString() + "' no cumple la expresion regular!");
        }

    }


}
