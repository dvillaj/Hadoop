import pyspark
import pyspark.sql


if __name__== '__main__':
    config = pyspark.SparkConf().setAppName("Basico")
    sc = pyspark.SparkContext(conf = config)

    sqlCtx = pyspark.sql.SQLContext(sc)

    dfVuelos = sqlCtx.read.csv('hdfs://localhost:9000/datos', header = True)

    dfVuelos.printSchema()
    dfVuelos.createOrReplaceTempView("VUELOS")

    sqlCtx.sql("""
        select flightNum, SUM(cast(distance as int))
        from VUELOS
        group by flightNum
        """).show()
