-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 23, 2023 at 11:10 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbmoneymanajer`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbakun`
--

CREATE TABLE `tbakun` (
  `id_user` text NOT NULL,
  `nama` text NOT NULL,
  `alamat` text NOT NULL,
  `nomorHp` text NOT NULL,
  `status` text NOT NULL,
  `username` text NOT NULL,
  `pass` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `tbkeuangan`
--

CREATE TABLE `tbkeuangan` (
  `id` text NOT NULL,
  `nama` text NOT NULL,
  `jenis` text NOT NULL,
  `jumlah` int(20) NOT NULL,
  `tanggal` text NOT NULL,
  `catatan` text NOT NULL,
  `kategori` text NOT NULL,
  `Id_user` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbkeuangan`
--

INSERT INTO `tbkeuangan` (`id`, `nama`, `jenis`, `jumlah`, `tanggal`, `catatan`, `kategori`, `Id_user`) VALUES
('U1K1', 'rr', 'Makanan', 5000, 'ee', 'ee', 'Kredit', 'U1'),
('U2D1', 'ee', 'Bonus', 20000, 'ee', 'ee', 'Debit', 'U2'),
('U2K2', 'ee', 'Transportasi', 3000, 'ee', 'ee', 'Kredit', 'U2');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbakun`
--
ALTER TABLE `tbakun`
  ADD PRIMARY KEY (`id_user`(10));

--
-- Indexes for table `tbkeuangan`
--
ALTER TABLE `tbkeuangan`
  ADD PRIMARY KEY (`id`(5));
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
