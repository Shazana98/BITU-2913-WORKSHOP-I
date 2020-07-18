-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 17, 2018 at 10:16 PM
-- Server version: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `dental_clinic`
--

-- --------------------------------------------------------

--
-- Table structure for table `booking_table`
--

CREATE TABLE IF NOT EXISTS `booking_table` (
  `bookingNum` int(11) NOT NULL,
  `patientID` varchar(10) NOT NULL,
  `patientName` varchar(30) NOT NULL,
  `date` date NOT NULL,
  `time` time NOT NULL,
  `dentistID` varchar(10) NOT NULL,
  `dentistName` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `booking_table`
--

INSERT INTO `booking_table` (`bookingNum`, `patientID`, `patientName`, `date`, `time`, `dentistID`, `dentistName`) VALUES
(1, 'P101', 'Fatihah Zamri', '2019-01-11', '10:00:00', 'D011', 'Abdul Asyraf'),
(2, 'P102', 'Safiahanis Ishak', '2019-01-08', '12:30:00', 'D012', 'Asiyah Zukfily'),
(3, 'P103', 'Syakirah Rashid', '2019-01-08', '15:00:00', 'D013', 'Aiman Azman'),
(4, 'P104', 'Hani Suraya', '2019-02-04', '09:30:00', 'D014', 'Soh Javid');

-- --------------------------------------------------------

--
-- Table structure for table `medicine_table`
--

CREATE TABLE IF NOT EXISTS `medicine_table` (
  `medicineID` varchar(10) NOT NULL,
  `medicineName` varchar(50) NOT NULL,
  `expiryDate` date NOT NULL,
  `quantity` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `medicine_table`
--

INSERT INTO `medicine_table` (`medicineID`, `medicineName`, `expiryDate`, `quantity`) VALUES
('M001', 'Antibiotics', '2021-12-12', 150),
('M002', 'Amoxycillin', '2021-12-12', 110),
('M003', 'Ibuprofen', '2021-12-12', 150),
('M004', 'Prednisolone', '2012-12-12', 112),
('M005', 'Dyfenamic', '2012-12-12', 50),
('M006', 'Antibiotics', '2025-12-12', 100),
('M007', 'Amoxycillin', '2025-12-12', 130),
('M008', 'Ibuprofen', '2025-12-12', 180),
('M009', 'Prednisolone', '2025-12-12', 80),
('M010', 'Dyfenamic', '2025-12-12', 50);

-- --------------------------------------------------------

--
-- Table structure for table `patient_table`
--

CREATE TABLE IF NOT EXISTS `patient_table` (
  `patientID` varchar(10) NOT NULL,
  `patientName` varchar(50) NOT NULL,
  `icNumber` varchar(20) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `date` date NOT NULL,
  `address` varchar(50) NOT NULL,
  `mobilePhone` varchar(11) NOT NULL,
  `emailAddress` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `patient_table`
--

INSERT INTO `patient_table` (`patientID`, `patientName`, `icNumber`, `gender`, `date`, `address`, `mobilePhone`, `emailAddress`) VALUES
('P101', 'Fatihah Zamri', '980421035696', 'Female', '2018-11-11', 'No 20, Taman Kemboja Baru', '0177329911', 'fatihahz@gmail.com'),
('P102', 'Safiahanis Ishak', '980915015676', 'Female', '2018-11-11', 'No 3, Adda Height', '0123347811', 'safiahanis@gmail.com'),
('P103', 'Syakirah Rashid', '980403087621', 'Female', '2018-12-17', 'No 5, Bandar Baru Bangi', '0168971223', 'syakirah@gmail.com'),
('P104', 'Hani Suraya', '971121038876', 'Female', '2019-01-03', 'No 5, Cheras KL', '0117887562', 'hani@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `staff_table`
--

CREATE TABLE IF NOT EXISTS `staff_table` (
  `staffID` varchar(10) NOT NULL,
  `startingDate` date NOT NULL,
  `icNumber` varchar(20) NOT NULL,
  `name` varchar(50) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `position` varchar(10) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `address` varchar(50) NOT NULL,
  `phoneNumber` varchar(11) NOT NULL,
  `emailAddress` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `staff_table`
--

INSERT INTO `staff_table` (`staffID`, `startingDate`, `icNumber`, `name`, `gender`, `position`, `username`, `password`, `address`, `phoneNumber`, `emailAddress`) VALUES
('A001', '2018-12-12', '980602015696', 'Shazana Affandi', 'Female', 'Admin', 'administrator', 'P@ssw0rd', 'No 12, Taman Sri Pulai Perdana', '01128852620', 'shazana.affandi@gmail.com'),
('D011', '2018-12-12', '942111015696', 'Abdul Asyraf', 'Male', 'Dentist', 'a.asyraf', '123Abc*', 'No 14, Taman Perwira', '0197020783', 'a.acap@gmail.com'),
('D012', '2018-01-12', '981021085696', 'Asiyah Zukfily', 'Female', 'Dentist', 'a.asiyah', '12345Abcde*', 'No 6, Taman Sri Kasturi', '0167772811', 'a.asiyah@gmail.com'),
('D013', '2018-01-12', '981010012334', 'Aiman Azman', 'Male', 'Dentist', 'aiman', 'Abc123', 'No 3, Bandar Uda Utama', '0197882321', 'aiman@gmail.com'),
('D014', '2018-12-17', '972602019767', 'Soh Javid', 'Male', 'Dentist', 'javid', 'J123*', 'No 6, Taman Lestari', '0123434781', 'sjavid@gmail.com'),
('N011', '2018-01-12', '970507019656', 'Nurul Athirah', 'Female', 'Nurse', 'athirah', 'Ab12*', 'No 10, Bandar Baru UDA', '0179989981', 'athirah@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `treatment_table`
--

CREATE TABLE IF NOT EXISTS `treatment_table` (
  `treatmentNum` int(11) NOT NULL,
  `date` date NOT NULL,
  `patientID` varchar(10) NOT NULL,
  `patientName` varchar(30) NOT NULL,
  `treatment` varchar(10) NOT NULL,
  `medicines` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `treatment_table`
--

INSERT INTO `treatment_table` (`treatmentNum`, `date`, `patientID`, `patientName`, `treatment`, `medicines`) VALUES
(1, '2018-12-21', 'P101', 'Fatihah Zamri', 'Scalling', 'Antibiotic'),
(2, '2018-12-21', 'P102', 'Safiahanis Ishak', 'Braces', 'Ibuprofen'),
(3, '2018-12-28', 'P103', 'Syakirah Rashid', 'Braces', 'Ibuprofen'),
(4, '2018-01-10', 'P104', 'Hani Suraya', 'Scalling', 'Antibiotics'),
(5, '2018-12-17', 'P101', 'Hani Suraya', 'Scalling', 'Antibiotics');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `booking_table`
--
ALTER TABLE `booking_table`
 ADD PRIMARY KEY (`bookingNum`);

--
-- Indexes for table `medicine_table`
--
ALTER TABLE `medicine_table`
 ADD PRIMARY KEY (`medicineID`);

--
-- Indexes for table `patient_table`
--
ALTER TABLE `patient_table`
 ADD PRIMARY KEY (`patientID`);

--
-- Indexes for table `staff_table`
--
ALTER TABLE `staff_table`
 ADD PRIMARY KEY (`staffID`);

--
-- Indexes for table `treatment_table`
--
ALTER TABLE `treatment_table`
 ADD PRIMARY KEY (`treatmentNum`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
