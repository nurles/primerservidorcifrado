package com.centroafuera.primerservidor

import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class DataBase {

    companion object{
        val logger = LoggerFactory.getLogger(DataBase::class.java)
    }

    @Bean
    fun initDatabase(houseRepository : HouseRepository) : CommandLineRunner {
        return CommandLineRunner { args: Array<String?>? ->
            logger.info("Preloading " + houseRepository.save(House("Arryn", "Nido de Águilas. El Valle", "Tan alto como el honor", "Jon Arryn, Lysa Arryn, Robin Arryn")))
            logger.info("Preloading " + houseRepository.save(House("Stark", "Invernalia. El Norte", "Se acerca el invierno", "Eddard Stark, Catelyn Stark, Robb Stark, Sansa Stark, Arya Stark, Brandon Stark, Jon Nieve")))
            logger.info("Preloading " + houseRepository.save(House("Lannister", "Roca Casterly. Reino de la Roca", "Oye mi rugido", "Tywin Lannister, Cersei Lannister, Jaime Lannister, Tyrion Lannister")))
            logger.info("Preloading " + houseRepository.save(House("Targaryen", "Pentos. Essos", "Sangre y fuego", "Daenerys Targaryen, Viserys Targaryen, Raegar Targaryen")))
            logger.info("Preloading " + houseRepository.save(House("Baratheon", "Bastión de Tormentas. Reino de la Tormenta", "Nuestra es la furia", "Robert Baratheon, Joffrey Baratheon, Renly Baratheon, Stannis Baratheon")))
            logger.info("Preloading " + houseRepository.save(House("Tyrell", "Altojardin. El Dominio", "Crecer fuerte", "Olenna Tyrell, Margaery Tyrell, Loras Tyrell")))
            logger.info("Preloading " + houseRepository.save(House("Martell", "Lanza del Sol. Dorne", "Nunca doblegado, nunca roto", "Oberyn Martell, Doran Martell")))
            logger.info("Preloading " + houseRepository.save(House("Tully", "Aguasdulces. Los Rios", "Familia, deber, honor", "Hoster Tully, Catelyn Tully, Lysa Tully, Edmure Tully")))
            logger.info("Preloading " + houseRepository.save(House("Greyjoy", "Pyke. Islas del Hierro", "Nosotros no sembramos", "Balon Greyjoy, Yara Greyjoy, Theon Greyjoy, Euron Greyjoy")))
            logger.info("Preloading " + houseRepository.save(House("Bolton", "Fuerte Terror. El Norte", "Nuestras hojas están afiladas", "Roose Bolton, Ramsay Bolton")))
            logger.info("Preloading " + houseRepository.save(House("Clegane", "Reino de la Roca", "", "Gregor Clegane, Sandor Clegane")))
            logger.info("Preloading " + houseRepository.save(House("Mormont", "Isla del Oso. El Norte", "Aquí aguantamos", "Jeor Mormont, Jorah Mormont")))
        }

    }
}