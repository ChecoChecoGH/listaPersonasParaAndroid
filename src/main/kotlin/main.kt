import java.util.*
import kotlin.random.Random

fun main() {
    val listaPersonas = mutableListOf<Persona>()

    for(i in 0..9){
        val auxNota = String.format(Locale.US,"%.2f", Random.nextDouble(0.0, 10.01)).toFloat()
        val auxAltura = String.format(Locale.US,"%.2f", Random.nextDouble(1.50, 2.11)).toFloat()
        listaPersonas.add(Persona("Persona${i+1}", (18..100).random().toShort(), auxNota, auxAltura))
    }

    //Cuando rote genero un numero del 1 al 4 aleatoriamente y ordeno
    when((1..4).random()){
        1 ->{ println("Ordenado de mayor a menor por nombre.")
              listaPersonas.sortByDescending { it.nombre.length }
        }
        2 -> {println("Ordenado de mayor a menor por edad.")
              listaPersonas.sortByDescending { it.edad }
        }
        3 -> {println("Ordenado de menor a mayor por edad.")
              listaPersonas.sortedBy { it.edad }
        }
        4 -> {println("Ordenado de mayor a menor por altura.")
              listaPersonas.sortByDescending { it.altura }
        }
        else -> println("Ups no pude ordenar. el parametro del when no me vale")
    }

    listaPersonas.forEach{ println(it) }
}

class Persona(var nombre: String, var edad: Short, var notaMedia: Float, var altura: Float){
    override fun toString(): String {
        return "Nombre: $nombre\n" +
                "Edad: $edad\n" +
                "Nota media: $notaMedia\n" +
                "Altura: $altura\n"
    }

}