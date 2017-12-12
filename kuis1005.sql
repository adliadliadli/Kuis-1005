-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: 12 Des 2017 pada 15.45
-- Versi Server: 5.7.15-log
-- PHP Version: 5.6.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kuis1005`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `cv_1005`
--

CREATE TABLE `cv_1005` (
  `id` bigint(20) NOT NULL,
  `deskripsi` varchar(255) DEFAULT NULL,
  `name` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `cv_1005`
--

INSERT INTO `cv_1005` (`id`, `deskripsi`, `name`) VALUES
(111, 'marbagus', 'ujang'),
(112, 'marmantap', 'ajo');

-- --------------------------------------------------------

--
-- Struktur dari tabel `nilai_1005`
--

CREATE TABLE `nilai_1005` (
  `id` bigint(20) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `nilai` varchar(255) NOT NULL,
  `cv1005_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `nilai_1005`
--

INSERT INTO `nilai_1005` (`id`, `nama`, `nilai`, `cv1005_id`) VALUES
(221, 'Buyung', '85', 111),
(222, 'Udin', '90', 112);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cv_1005`
--
ALTER TABLE `cv_1005`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_d8kieqt3wqpeg1errb9sy6sar` (`name`);

--
-- Indexes for table `nilai_1005`
--
ALTER TABLE `nilai_1005`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKdxe6ei6tv65wm6r9fns8fu8j2` (`cv1005_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cv_1005`
--
ALTER TABLE `cv_1005`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=113;
--
-- AUTO_INCREMENT for table `nilai_1005`
--
ALTER TABLE `nilai_1005`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=223;
--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `nilai_1005`
--
ALTER TABLE `nilai_1005`
  ADD CONSTRAINT `FKdxe6ei6tv65wm6r9fns8fu8j2` FOREIGN KEY (`cv1005_id`) REFERENCES `cv_1005` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
