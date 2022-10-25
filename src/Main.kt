import kotlin.random.Random

class Personaje() {
    var nombre: String = "Jack"
    var estadoVital: String = ""
    var raza: String = ""
    var clase: String =""


    fun creacionPersonaje(){
        //Al terminar el ejercicio automatizarlo
        val posibilidadesEv = listOf<String>("Adolescente","Adulto","Anciano")
        val posibilidadesRa = listOf<String>("Elfo","Humano","Enano","Goblin")
        val posibilidadesCl = listOf<String>("Mago","Ladron","Guerrero","Berserker")


        var rI1 = Random.nextInt(posibilidadesEv.size)
        val estadoVR = posibilidadesEv[rI1]

        rI1 = Random.nextInt(posibilidadesRa.size)
        val razaR = posibilidadesRa[rI1]

        rI1 = Random.nextInt(posibilidadesCl.size)
        val claseR = posibilidadesCl[rI1]

        this.estadoVital=estadoVR
        this.raza=razaR
        this.clase=claseR
    }

    fun comprobarMensaje(mensaje:String): String{
        var mensajeA:String = mensaje

//comletar la funcion con las comprobaciones de los mensajes.
        if(mensaje.equals(mensaje.uppercase()) && mensaje.contains("?")){
            mensajeA="preguntaGrito"
        }else{
            if(mensaje.equals(mensaje.uppercase())){
            mensajeA="grito"}
            else{
                if(mensaje.equals("¿Como estas?") || mensaje.equals("¿como estas?") || mensaje.equals("¿Cómo estás?") ||mensaje.equals("¿cómo estás?") )
                    mensajeA="¿como estas?"
                else
                    if(mensaje.equals(this.nombre))
                        mensajeA="nombre"
            }
        }




        return mensajeA
    }


    fun comunicacion(){
        var respuesta:String =""
        var mensaje:String=""

        println("¿Hablamos con el un rato?")
        respuesta= readln()

        if(respuesta=="si" || respuesta=="Si")
            println("Dale,hablemos con el")

        while(respuesta=="si" || respuesta=="Si"){

            mensaje=readln()
            mensaje=comprobarMensaje(mensaje)


            when(this.estadoVital){
                "Adolescente" -> when(mensaje){
                    //Implementar el control de todos los mensajes en la funcion externa
                                    "¿como estas?" -> println("De lujo")
                                    "grito" -> println("Eh relajate")
                                    "preguntaGrito" ->println("Tranqui se lo que hago")
                                    "nombre"-> println("¿Que pasa?")

                                    else -> { println("Yo que se") }
                }
                "Adulto" -> when(mensaje){
                                    "¿como estas?" -> println("En la flor de la vida, pero me empieza a doler la espalda")
                                    "grito" -> println( "No me levantes la voz mequetrefe")
                                    "preguntaGrito" ->println("Estoy buscando la mejor solución")
                                    "nombre"-> println("¿Necesitas algo?")

                                    else -> { println("No sé de qué me estás hablando") }

                                //Terminar las respuestas de adulto
                                }
                "Anciano" -> when(mensaje){
                                    "¿como estas?" -> println("No me puedo mover")
                                    "grito" -> println("Háblame más alto que no te escucho")
                                    "preguntaGrito" ->println("Que no te escucho!")
                                    "nombre"-> println("Las 5 de la tarde")

                                    else -> { println("En mis tiempos esto no pasaba") }

                                //Terminar las respuestas de anciano
                                }
            }

        }

    }
}


fun main() {
    val p1 = Personaje()
    var respuesta:String = ""
    var mensaje:String =""
    p1.creacionPersonaje()

    println("Nuestro personaje se llama: "+p1.nombre)
    println("Acutalmente es un: " + p1.estadoVital)
    println("Pertenece a la raza: "+ p1.raza)
    println("Y es un: "+p1.clase)
    println()

    p1.comunicacion()
}