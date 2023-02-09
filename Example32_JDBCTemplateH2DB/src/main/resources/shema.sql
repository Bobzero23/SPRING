CREATE TABLE IF NOT EXISTS `contact_msg` (
  `contact_id` int AUTO_INCEREMENT PRIMARY KEY,
  `name` varchar(100) not null,
  `mobline_num` varchar(10) not null,
    `email` varchar(100) not null,
    `subject` varchar(100) not null,
    `message` varchar(100) not null,
    `status` varchar(10) not null,
    `created_at` TIMESTAMP NOT NULL,
    `created_by` varchar(100) NOT NULL,
    `updated_at` TIMESTAMP DEFAULT NULL,
    `updated_by` varchar(100)  DEFAULT NULL,
);