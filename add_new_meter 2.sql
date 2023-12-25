-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 25, 2023 at 02:03 PM
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
-- Table structure for table `consumption_data`
--

CREATE TABLE `consumption_data` (
  `Data_id` int(11) NOT NULL,
  `Meter_No` int(11) NOT NULL,
  `Month_Year` varchar(45) NOT NULL,
  `Unit Consumption` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `consumption_data`
--

INSERT INTO `consumption_data` (`Data_id`, `Meter_No`, `Month_Year`, `Unit Consumption`) VALUES
(1, 23456, 'January-2023', 300),
(2, 34567, 'March-2023', 280),
(3, 45678, 'December-2023', 240);

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
  `Meter_no` int(11) NOT NULL,
  `Customer_Id` int(11) NOT NULL,
  `Location` varchar(45) NOT NULL,
  `Installation_Date` date NOT NULL,
  `Status` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `meter_data`
--

INSERT INTO `meter_data` (`Meter_no`, `Customer_Id`, `Location`, `Installation_Date`, `Status`) VALUES
(23456, 1, '24 main street', '2023-12-03', 'Active'),
(34567, 3, 'ground floor,room1', '2023-11-05', 'Active'),
(45678, 2, 'Building A, Basement', '2022-12-10', 'Active');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`Admin_id`);

--
-- Indexes for table `consumption_data`
--
ALTER TABLE `consumption_data`
  ADD PRIMARY KEY (`Data_id`),
  ADD KEY `Meter_No` (`Meter_No`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`customer_id`);

--
-- Indexes for table `meter_data`
--
ALTER TABLE `meter_data`
  ADD PRIMARY KEY (`Meter_no`),
  ADD KEY `Customer_id` (`Customer_Id`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `consumption_data`
--
ALTER TABLE `consumption_data`
  ADD CONSTRAINT `Meter_No` FOREIGN KEY (`Meter_No`) REFERENCES `meter_data` (`Meter_no`);

--
-- Constraints for table `meter_data`
--
ALTER TABLE `meter_data`
  ADD CONSTRAINT `Customer_id` FOREIGN KEY (`Customer_Id`) REFERENCES `customer` (`customer_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
