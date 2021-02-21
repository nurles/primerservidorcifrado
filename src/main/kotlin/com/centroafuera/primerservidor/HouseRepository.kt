package com.centroafuera.primerservidor

import org.springframework.data.jpa.repository.JpaRepository

interface HouseRepository : JpaRepository<House, Long>