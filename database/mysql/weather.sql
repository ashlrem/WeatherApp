SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+08:00";

--
-- Database: `weather`
--

-- --------------------------------------------------------

--
-- Table structure for table `city`
--

CREATE TABLE `city` (
  `id` int(11) NOT NULL,
  `city_id` varchar(255) DEFAULT NULL,
  `city_lat` varchar(255) DEFAULT NULL,
  `city_lon` varchar(255) DEFAULT NULL,
  `city_name` varchar(255) DEFAULT NULL,
  `country_code` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `logs`
--

CREATE TABLE `logs` (
  `id` int(11) NOT NULL,
  `cityName` text NOT NULL,
  `cidtyId` text NOT NULL,
  `weatherDate` text NOT NULL,
  `logDate` text NOT NULL,
  `weatherStr` text NOT NULL,
  `temperatureK` text NOT NULL,
  `temperatureC` text NOT NULL,
  `temperatureF` text NOT NULL,
  `weatherMainType` text NOT NULL,
  `weatherIcon` text NOT NULL,
  `pressure` text NOT NULL,
  `humidity` text NOT NULL,
  `windSpeed` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `city`
--
ALTER TABLE `city`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `logs`
--
ALTER TABLE `logs`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `city`
--
ALTER TABLE `city`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `logs`
--
ALTER TABLE `logs`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;
