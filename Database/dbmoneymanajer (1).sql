-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 26, 2023 at 05:41 AM
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
-- Database: `dbmoneymanajer`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbakun`
--

CREATE TABLE `tbakun` (
  `id_user` int(11) NOT NULL,
  `nama` text NOT NULL,
  `alamat` text NOT NULL,
  `nomorHp` text NOT NULL,
  `status` text NOT NULL,
  `username` text NOT NULL,
  `pass` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbakun`
--

INSERT INTO `tbakun` (`id_user`, `nama`, `alamat`, `nomorHp`, `status`, `username`, `pass`) VALUES
(-1, 'admin', 'samarinda', '9110', 'Admin', 'admin', '123'),
(1, 'udin', '123', '123', 'User', 'kk', '123'),
(3, '123baru', '123baru', '123baru', 'User', 'baru123', '12'),
(4, '12312', '123', '123', 'User', '123', '123'),
(5, '1', '1', '1', 'User', '1', '1');

-- --------------------------------------------------------

--
-- Table structure for table `tbdompet`
--

CREATE TABLE `tbdompet` (
  `id` int(11) NOT NULL,
  `nama` text NOT NULL,
  `jenis` varchar(20) NOT NULL,
  `idmatauang` varchar(5) NOT NULL,
  `saldo` int(11) NOT NULL,
  `iduser` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbdompet`
--

INSERT INTO `tbdompet` (`id`, `nama`, `jenis`, `idmatauang`, `saldo`, `iduser`) VALUES
(1, 'saya', 'Dompet', 'IDR', 10000, '4'),
(4, 'ee', 'Dompet', 'IDR', 123, '5'),
(5, 'kedua', 'Dompet', 'IDR', 123, '4');

-- --------------------------------------------------------

--
-- Table structure for table `tbgoal`
--

CREATE TABLE `tbgoal` (
  `id` int(11) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `jenis` varchar(100) NOT NULL,
  `idmatauang` varchar(100) NOT NULL,
  `saldo` int(11) NOT NULL,
  `iduser` varchar(100) NOT NULL,
  `catatan` text NOT NULL,
  `target` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbgoal`
--

INSERT INTO `tbgoal` (`id`, `nama`, `jenis`, `idmatauang`, `saldo`, `iduser`, `catatan`, `target`) VALUES
(1, '123', 'goal', 'Rupiah', 0, '2', '123', 123),
(2, '1', 'goal', 'Rupiah', 0, '2', 'Catatan', 123),
(3, 'bayu', 'tabungan', 'Rupiah', 100, '2', 'Catatanbaru', 123),
(5, 'Nama', 'goal', 'Rupiah', 0, '2', 'Catatan', 9),
(6, 'Nama', 'goal', 'Rupiah', 0, '4', 'Catatan', 999),
(7, 'Nama2', 'goal', 'Rupiah', 0, '4', 'Catatan', 999),
(8, 'Nama23', 'goal', 'Rupiah', 0, '4', 'Catatan', 999);

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

-- --------------------------------------------------------

--
-- Table structure for table `tbtransaksi`
--

CREATE TABLE `tbtransaksi` (
  `id` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `catatan` text NOT NULL,
  `jumlah` int(11) NOT NULL,
  `kategori` varchar(20) NOT NULL,
  `iddompet` varchar(11) NOT NULL,
  `iduser` varchar(11) NOT NULL,
  `idmatauang` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbtransaksi`
--

INSERT INTO `tbtransaksi` (`id`, `nama`, `catatan`, `jumlah`, `kategori`, `iddompet`, `iduser`, `idmatauang`) VALUES
(8, 'dsfsdf', '', 100000000, 'Pengeluaran', '1', '4', 'IDR');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbakun`
--
ALTER TABLE `tbakun`
  ADD PRIMARY KEY (`id_user`);

--
-- Indexes for table `tbdompet`
--
ALTER TABLE `tbdompet`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tbgoal`
--
ALTER TABLE `tbgoal`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tbkeuangan`
--
ALTER TABLE `tbkeuangan`
  ADD PRIMARY KEY (`id`(5));

--
-- Indexes for table `tbtransaksi`
--
ALTER TABLE `tbtransaksi`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbakun`
--
ALTER TABLE `tbakun`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `tbdompet`
--
ALTER TABLE `tbdompet`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `tbgoal`
--
ALTER TABLE `tbgoal`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `tbtransaksi`
--
ALTER TABLE `tbtransaksi`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
