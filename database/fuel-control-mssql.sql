
CREATE TABLE driver (
  [id] int NOT NULL IDENTITY,
  [card_number] varchar(100) NOT NULL,
  [name] varchar(255) NOT NULL,
  [last_name] varchar(255) DEFAULT NULL,
  [phone] varchar(255) DEFAULT NULL,
  [email] varchar(255) DEFAULT NULL,
  [created] datetime2(0) NULL DEFAULT NULL,
  [updated] datetime2(0) NULL DEFAULT NULL,
  PRIMARY KEY ([id])
)
CREATE TABLE vehicle (
  [id] int NOT NULL IDENTITY,
  [plate] varchar(25) NOT NULL,
  [model] varchar(10) NOT NULL,
  [year] varchar(4) NOT NULL,
  [type_of_fuel] varchar(30) DEFAULT NULL,
  [status] varchar(50) DEFAULT NULL,
  PRIMARY KEY ([id])
)
CREATE TABLE driver_vehicle (
  [driver_id] int NOT NULL,
  [vehicle_id] int NOT NULL
 ,
  CONSTRAINT [driver_vehicle_ibfk_1] FOREIGN KEY ([driver_id]) REFERENCES driver ([id]),
  CONSTRAINT [driver_vehicle_ibfk_2] FOREIGN KEY ([vehicle_id]) REFERENCES vehicle ([id])
)

CREATE INDEX [driver_id] ON driver_vehicle ([driver_id]);
CREATE INDEX [vehicle_id] ON driver_vehicle ([vehicle_id]);
CREATE TABLE route (
  [id] int NOT NULL IDENTITY,
  [driver_id] int NOT NULL,
  [vehicle_id] int NOT NULL,
  [start_time] datetime2(0) NULL DEFAULT NULL,
  [duration] int DEFAULT NULL,
  [status] varchar(100) DEFAULT NULL,
  [destination] varchar(100) DEFAULT NULL,
  [origin] varchar(100) DEFAULT NULL,
  PRIMARY KEY ([id])
 ,
  CONSTRAINT [driver_route_fk] FOREIGN KEY ([driver_id]) REFERENCES driver ([id]),
  CONSTRAINT [vehicle_route_fk_1] FOREIGN KEY ([vehicle_id]) REFERENCES vehicle ([id])
)

CREATE INDEX [driver_route_fk] ON route ([driver_id]);
CREATE INDEX [vehicle_route_fk_1] ON route ([vehicle_id]);
CREATE TABLE refill (
  [id] int NOT NULL IDENTITY,
  [amount] int NOT NULL,
  [date_time] datetime2(0) NULL DEFAULT NULL,
  [km] int DEFAULT NULL,
  [liters] int DEFAULT NULL,
  [route_id] int DEFAULT NULL,
  PRIMARY KEY ([id])
 ,
  CONSTRAINT [refill_fk] FOREIGN KEY ([route_id]) REFERENCES route ([id])
)

CREATE INDEX [refill_fk] ON refill ([route_id]);