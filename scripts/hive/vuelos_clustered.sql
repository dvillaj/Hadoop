USE CURSOBIGDATA;

DROP TABLE IF EXISTS VUELOS_CLUSTER;

CREATE TABLE VUELOS_CLUSTER (
    Year INT,
    Month INT,
    DayofMonth INT,
    DayOfWeek INT,
    DepTime VARCHAR(20),
    CRSDepTime  VARCHAR(20),
    ArrTime VARCHAR(20),
    CRSArrTime  VARCHAR(20),
    UniqueCarrier   VARCHAR(20),
    FlightNum   VARCHAR(20),
    TailNum VARCHAR(20),
    ActualElapsedTime   VARCHAR(20),
    CRSElapsedTime  VARCHAR(20),
    AirTime VARCHAR(20),
    ArrDelay    VARCHAR(20),
    DepDelay    VARCHAR(20),
    Origin  VARCHAR(20),
    Dest    VARCHAR(20),
    Distance    VARCHAR(20),
    TaxiIn  VARCHAR(20),
    TaxiOut VARCHAR(20),
    Cancelled   VARCHAR(20),
    CancellationCode    VARCHAR(20),
    Diverted    VARCHAR(20),
    CarrierDelay    VARCHAR(20),
    WeatherDelay    VARCHAR(20),
    NASDelay    VARCHAR(20),
    SecurityDelay   VARCHAR(20),
    LateAircraftDelay   VARCHAR(20)
)
CLUSTERED BY (Origin) SORTED BY (Dest) INTO 20 BUCKETS
ROW FORMAT DELIMITED FIELDS TERMINATED BY ","
STORED AS TEXTFILE; 