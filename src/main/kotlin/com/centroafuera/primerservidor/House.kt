package com.centroafuera.primerservidor

import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class House(var name : String, var region : String, var words : String, var miembros : String) {

    @Id
    @GeneratedValue
    private val id: Long? = null

    override fun equals(other: Any?): Boolean {
        if (other is House){
            return other.id == id && id != null
        } else {
            return false
        }
    }

    override fun hashCode() : Int{
        return Objects.hash(id, name, region, words, miembros)
    }

    override fun toString(): String {
        return "Casa $name de la region $region. Lema: $words. Miembros destacados: $miembros"
    }
}