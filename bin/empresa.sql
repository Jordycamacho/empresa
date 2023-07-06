-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 18-04-2023 a las 09:26:15
-- Versión del servidor: 10.4.27-MariaDB
-- Versión de PHP: 8.0.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `empresa`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `directivo`
--

CREATE TABLE `directivo` (
  `nombre` varchar(20) NOT NULL,
  `dni` varchar(9) NOT NULL,
  `salario` int(5) NOT NULL,
  `plus` int(4) NOT NULL,
  `calcularnomina` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_unicode_ci;

--
-- Volcado de datos para la tabla `directivo`
--

INSERT INTO `directivo` (`nombre`, `dni`, `salario`, `plus`, `calcularnomina`) VALUES
('pepe', '12414f', 342, 2, 344),
('jordy', '21421123f', 3213, 2, 3215);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `oficial`
--

CREATE TABLE `oficial` (
  `nombre` varchar(20) NOT NULL,
  `dni` varchar(9) NOT NULL,
  `salario` int(11) NOT NULL,
  `numobra` int(11) NOT NULL,
  `sobresueldo` int(11) NOT NULL,
  `calcularnomina` int(11) NOT NULL,
  `quiensoy` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_unicode_ci;

--
-- Volcado de datos para la tabla `oficial`
--

INSERT INTO `oficial` (`nombre`, `dni`, `salario`, `numobra`, `sobresueldo`, `calcularnomina`, `quiensoy`) VALUES
('jordy', '123d', 132, 2, 12, 144, 'Oficial');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tecnico`
--

CREATE TABLE `tecnico` (
  `nombre` varchar(20) NOT NULL,
  `dni` varchar(9) NOT NULL,
  `salario` int(5) NOT NULL,
  `numobra` int(10) NOT NULL,
  `calcularnomina` int(5) NOT NULL,
  `quiensoy` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_unicode_ci;

--
-- Volcado de datos para la tabla `tecnico`
--

INSERT INTO `tecnico` (`nombre`, `dni`, `salario`, `numobra`, `calcularnomina`, `quiensoy`) VALUES
('jordy', '1342f', 321, 21, 321, 'Tecnico');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `directivo`
--
ALTER TABLE `directivo`
  ADD PRIMARY KEY (`dni`,`nombre`);

--
-- Indices de la tabla `tecnico`
--
ALTER TABLE `tecnico`
  ADD PRIMARY KEY (`nombre`,`dni`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
