 USE CURSOBIGDATA;

  ---Fichero dentro del HDFS
set hive.exec.dynamic.partition=true;  
set hive.exec.dynamic.partition.mode=nonstrict;  

INSERT OVERWRITE TABLE VUELOS_PAR partition (Year,
    Month)
 SELECT 
    DayofMonth ,
    DayOfWeek ,
    DepTime ,
    CRSDepTime  ,
    ArrTime ,
    CRSArrTime  ,
    UniqueCarrier   ,
    FlightNum   ,
    TailNum ,
    ActualElapsedTime   ,
    CRSElapsedTime  ,
    AirTime ,
    ArrDelay    ,
    DepDelay    ,
    Origin  ,
    Dest    ,
    Distance    ,
    TaxiIn  ,
    TaxiOut ,
    Cancelled   ,
    CancellationCode    ,
    Diverted    ,
    CarrierDelay    ,
    WeatherDelay    ,
    NASDelay    ,
    SecurityDelay   ,
    LateAircraftDelay,
    Year ,
    Month 
 FROM VUELOS
 ;