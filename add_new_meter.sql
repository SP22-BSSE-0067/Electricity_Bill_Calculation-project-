-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 23, 2023 at 11:13 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `add_new_meter`
--
CREATE DATABASE IF NOT EXISTS `add_new_meter` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `add_new_meter`;

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `Admin_id` int(11) NOT NULL,
  `Username` varchar(45) NOT NULL,
  `Password` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`Admin_id`, `Username`, `Password`, `email`) VALUES
(1, 'Osama Imran', '12345', 'osama123@gmail.com'),
(2, 'Sharjeel Hussain', '4567', 'sharjeel123@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `customer_id` int(11) NOT NULL,
  `customer_name` varchar(45) NOT NULL,
  `adress` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `ph_no` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`customer_id`, `customer_name`, `adress`, `email`, `ph_no`) VALUES
(1, 'Zaheer-ud-din', 'Nazmabad', 'zaheer234@gmail.com', '0315-675476'),
(2, 'Anwar Jamel', 'Gulistan-e-johar', 'anwar786@gmail.com', '0345-286754'),
(3, 'Zeeshan Ahmed', 'Shahra-e-Faisal', 'zeeshan67@gmail.com', '0325-5366357');

-- --------------------------------------------------------

--
-- Table structure for table `meter_data`
--

CREATE TABLE `meter_data` (
  `Meter_no` bigint(20) NOT NULL,
  `location` varchar(45) NOT NULL,
  `installation_date` date NOT NULL,
  `Status` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `meter_data`
--

INSERT INTO `meter_data` (`Meter_no`, `location`, `installation_date`, `Status`) VALUES
(23456, '24 main street', '2023-12-03', 'Active'),
(34567, 'grounfloor, room1', '2023-11-05', 'active'),
(45678, 'BuldingA ,basement', '2022-12-10', 'Active');

-- --------------------------------------------------------

--
-- Table structure for table `meter_reading`
--

CREATE TABLE `meter_reading` (
  `Reading_date` date NOT NULL,
  `Readig_value/units` varchar(45) NOT NULL,
  `Meter_no` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `meter_reading`
--

INSERT INTO `meter_reading` (`Reading_date`, `Readig_value/units`, `Meter_no`) VALUES
('0000-00-00', '450', 23456),
('2023-02-01', '365 ', 34567),
('0000-00-00', '430', 34567),
('2023-04-01', '450', 23456),
('2023-02-01', '365 ', 34567),
('0000-00-00', '430', 45678),
('2023-12-01', '98', 45678),
('2023-06-01', '650', 23456);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`Admin_id`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`customer_id`);

--
-- Indexes for table `meter_data`
--
ALTER TABLE `meter_data`
  ADD PRIMARY KEY (`Meter_no`);

--
-- Indexes for table `meter_reading`
--
ALTER TABLE `meter_reading`
  ADD KEY `meter_no_fk` (`Meter_no`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
