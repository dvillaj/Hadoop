import pyspark

def mapeador(linea):
    campos = linea.split(",")
    return (campos[9], int(campos[18]) if campos[18].isdigit() else 0)

def calcularDistancia(a, b):
    return a + b

if __name__== '__main__':
    config = pyspark.SparkConf().setAppName("Basico")
    sc = pyspark.SparkContext(conf = config)

    rddFichero = sc.textFile('hdfs://localhost:9000/datos')

    print("No. vuelos: ", + rddFichero.count())

    for linea in rddFichero.take(4):
        print(linea)

    rddVuelos = rddFichero.map(mapeador).reduceByKey(calcularDistancia)

    for vuelo in rddVuelos.take(10):
        print("%8s:%10d" & vuelo)