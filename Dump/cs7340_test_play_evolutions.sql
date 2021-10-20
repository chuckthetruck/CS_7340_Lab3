-- MySQL dump 10.13  Distrib 8.0.20, for Win64 (x86_64)
--
-- Host: localhost    Database: cs7340_test
-- ------------------------------------------------------
-- Server version	8.0.20

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `play_evolutions`
--

DROP TABLE IF EXISTS `play_evolutions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `play_evolutions` (
  `id` int NOT NULL,
  `hash` varchar(255) NOT NULL,
  `applied_at` timestamp NOT NULL,
  `apply_script` mediumtext,
  `revert_script` mediumtext,
  `state` varchar(255) DEFAULT NULL,
  `last_problem` mediumtext,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `play_evolutions`
--

LOCK TABLES `play_evolutions` WRITE;
/*!40000 ALTER TABLE `play_evolutions` DISABLE KEYS */;
INSERT INTO `play_evolutions` VALUES (1,'9ef3058d659d8f8f08b10b6c5c61fc9d822eaec2','2021-10-02 01:16:06','create table authors (\nauthor_id                     bigint auto_increment not null,\nauthor_name                   varchar(255),\nconstraint pk_authors primary key (author_id)\n);\n\ncreate table papers (\npaper_id                      bigint auto_increment not null,\ntitle                         varchar(255),\nbook_title                    varchar(255),\npages                         varchar(255),\nyear                          varchar(255),\nurl                           varchar(255),\nee                            varchar(255),\npublisher                     varchar(255),\njournal                       varchar(255),\nvolume                        varchar(255),\nnumber                        varchar(255),\ncrossref                      varchar(255),\nisbn                          varchar(255),\nconstraint pk_papers primary key (paper_id)\n);\n\ncreate table paperstoauthors (\npaper_id                      bigint not null,\nauthor_id                     bigint not null,\nconstraint pk_paperstoauthors primary key (paper_id,author_id)\n);\n\nalter table paperstoauthors add constraint fk_paperstoauthors_papers foreign key (paper_id) references papers (paper_id) on delete restrict on update restrict;\ncreate index ix_paperstoauthors_papers on paperstoauthors (paper_id);\n\nalter table paperstoauthors add constraint fk_paperstoauthors_authors foreign key (author_id) references authors (author_id) on delete restrict on update restrict;\ncreate index ix_paperstoauthors_authors on paperstoauthors (author_id);','alter table paperstoauthors drop foreign key fk_paperstoauthors_papers;\ndrop index ix_paperstoauthors_papers on paperstoauthors;\n\nalter table paperstoauthors drop foreign key fk_paperstoauthors_authors;\ndrop index ix_paperstoauthors_authors on paperstoauthors;\n\ndrop table if exists authors;\n\ndrop table if exists papers;\n\ndrop table if exists paperstoauthors;','applied','');
/*!40000 ALTER TABLE `play_evolutions` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-10-20 14:11:38
