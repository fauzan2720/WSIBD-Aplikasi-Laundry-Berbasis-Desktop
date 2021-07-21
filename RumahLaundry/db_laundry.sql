-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 21 Jul 2021 pada 09.59
-- Versi server: 10.4.19-MariaDB
-- Versi PHP: 8.0.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_laundry`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_jns_laundry`
--

CREATE TABLE `tb_jns_laundry` (
  `id_jns_laundry` int(6) NOT NULL,
  `nama_jns_laundry` varchar(15) NOT NULL,
  `harga` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tb_jns_laundry`
--

INSERT INTO `tb_jns_laundry` (`id_jns_laundry`, `nama_jns_laundry`, `harga`) VALUES
(1, 'CUCI MAMEL', 2500),
(2, 'CUCI SETRIKA', 4000),
(3, 'CUCI KERING', 3000),
(4, 'SETRIKA', 2500);

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_jns_plain`
--

CREATE TABLE `tb_jns_plain` (
  `id_jns_plain` int(6) NOT NULL,
  `nama_plain` varchar(15) NOT NULL,
  `harga` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tb_jns_plain`
--

INSERT INTO `tb_jns_plain` (`id_jns_plain`, `nama_plain`, `harga`) VALUES
(1, 'JAKET', 2000),
(2, 'SELIMUT', 5000),
(3, 'HANDUK KECIL', 1000),
(4, 'HANDUK BESAR', 2000),
(5, 'BONEKA KECIL', 4000),
(6, 'BONEKA SEDANG', 7000),
(7, 'BONEKA BESAR', 10000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_laundry`
--

CREATE TABLE `tb_laundry` (
  `id_laundry` varchar(9) NOT NULL,
  `id_jns_laundry` int(6) DEFAULT NULL,
  `nama_jns_laundry` varchar(15) DEFAULT NULL,
  `jml_potong` int(3) NOT NULL,
  `jml_kg` int(2) NOT NULL,
  `id_jnsplain` int(6) DEFAULT NULL,
  `nama_jns_plain` varchar(30) DEFAULT NULL,
  `total_harga` int(7) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_member`
--

CREATE TABLE `tb_member` (
  `id_member` varchar(9) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `jenis_kelamin` enum('Laki-laki','Perempuan') NOT NULL,
  `tgl_daftar` date NOT NULL,
  `no_telp` varchar(14) NOT NULL,
  `alamat` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_transaksi`
--

CREATE TABLE `tb_transaksi` (
  `id_transaksi` int(6) NOT NULL,
  `tgl_terima` date NOT NULL,
  `tgl_selesai` date NOT NULL,
  `id_member` varchar(9) NOT NULL,
  `id_laundry` varchar(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `tb_jns_laundry`
--
ALTER TABLE `tb_jns_laundry`
  ADD PRIMARY KEY (`id_jns_laundry`);

--
-- Indeks untuk tabel `tb_jns_plain`
--
ALTER TABLE `tb_jns_plain`
  ADD PRIMARY KEY (`id_jns_plain`);

--
-- Indeks untuk tabel `tb_laundry`
--
ALTER TABLE `tb_laundry`
  ADD PRIMARY KEY (`id_laundry`),
  ADD KEY `mempunyai` (`id_jns_laundry`),
  ADD KEY `terdapat` (`id_jnsplain`);

--
-- Indeks untuk tabel `tb_member`
--
ALTER TABLE `tb_member`
  ADD PRIMARY KEY (`id_member`);

--
-- Indeks untuk tabel `tb_transaksi`
--
ALTER TABLE `tb_transaksi`
  ADD PRIMARY KEY (`id_transaksi`),
  ADD KEY `mendata` (`id_laundry`),
  ADD KEY `memiliki` (`id_member`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `tb_jns_laundry`
--
ALTER TABLE `tb_jns_laundry`
  MODIFY `id_jns_laundry` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT untuk tabel `tb_jns_plain`
--
ALTER TABLE `tb_jns_plain`
  MODIFY `id_jns_plain` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT untuk tabel `tb_transaksi`
--
ALTER TABLE `tb_transaksi`
  MODIFY `id_transaksi` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `tb_laundry`
--
ALTER TABLE `tb_laundry`
  ADD CONSTRAINT `mempunyai` FOREIGN KEY (`id_jns_laundry`) REFERENCES `tb_jns_laundry` (`id_jns_laundry`),
  ADD CONSTRAINT `terdapat` FOREIGN KEY (`id_jnsplain`) REFERENCES `tb_jns_plain` (`id_jns_plain`);

--
-- Ketidakleluasaan untuk tabel `tb_transaksi`
--
ALTER TABLE `tb_transaksi`
  ADD CONSTRAINT `memiliki` FOREIGN KEY (`id_member`) REFERENCES `tb_member` (`id_member`),
  ADD CONSTRAINT `mendata` FOREIGN KEY (`id_laundry`) REFERENCES `tb_laundry` (`id_laundry`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
