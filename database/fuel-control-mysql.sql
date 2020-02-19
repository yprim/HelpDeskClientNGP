
CREATE TABLE `driver` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `card_number` varchar(100) NOT NULL,
  `name` varchar(255) NOT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `created` timestamp NULL DEFAULT NULL,
  `updated` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1
CREATE TABLE `vehicle` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `plate` varchar(25) NOT NULL,
  `model` varchar(10) NOT NULL,
  `year` varchar(4) NOT NULL,
  `type_of_fuel` varchar(30) DEFAULT NULL,
  `status` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1
CREATE TABLE `driver_vehicle` (
  `driver_id` int(11) NOT NULL,
  `vehicle_id` int(11) NOT NULL,
  KEY `driver_id` (`driver_id`),
  KEY `vehicle_id` (`vehicle_id`),
  CONSTRAINT `driver_vehicle_ibfk_1` FOREIGN KEY (`driver_id`) REFERENCES `driver` (`id`),
  CONSTRAINT `driver_vehicle_ibfk_2` FOREIGN KEY (`vehicle_id`) REFERENCES `vehicle` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1
CREATE TABLE `route` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `driver_id` int(11) NOT NULL,
  `vehicle_id` int(11) NOT NULL,
  `start_time` timestamp NULL DEFAULT NULL,
  `duration` int(11) DEFAULT NULL,
  `status` varchar(100) DEFAULT NULL,
  `destination` varchar(100) DEFAULT NULL,
  `origin` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `driver_route_fk` (`driver_id`),
  KEY `vehicle_route_fk_1` (`vehicle_id`),
  CONSTRAINT `driver_route_fk` FOREIGN KEY (`driver_id`) REFERENCES `driver` (`id`),
  CONSTRAINT `vehicle_route_fk_1` FOREIGN KEY (`vehicle_id`) REFERENCES `vehicle` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1
CREATE TABLE `refill` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `amount` int(11) NOT NULL,
  `date_time` timestamp NULL DEFAULT NULL,
  `km` int(11) DEFAULT NULL,
  `liters` int(11) DEFAULT NULL,
  `route_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `refill_fk` (`route_id`),
  CONSTRAINT `refill_fk` FOREIGN KEY (`route_id`) REFERENCES `route` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1