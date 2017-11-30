import pyspark
from pyspark.sql import HiveContext

if __name__== '__main__':
    config = pyspark.SparkConf().setAppName("Basico")
    sc = pyspark.SparkContext(conf = config)

    hive_context = HiveContext(sc)
    log = hive_context.table("CURSOBIGDATA.apachelog")
    log.show()