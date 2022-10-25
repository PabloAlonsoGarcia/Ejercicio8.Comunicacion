import kotlin.random.Random

class Personaje() {
    var nombre: String = "Jack"
    var estadoVital: String = ""
    var raza: String = ""
    var clase: String =""

    init {
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
                else{
                    if(mensaje.equals("adiós") || mensaje.equals("Adiós") || mensaje.equals("adios") || mensaje.equals("Adios"))
                        mensajeA="adios"
                }
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
            println("Dale hablemos con el, cuando te canses dile adios y ya")

        while(respuesta=="si" || respuesta=="Si"){

            mensaje=readln()
            mensaje=comprobarMensaje(mensaje)


            when(this.estadoVital){
                //Respuestas a los distintos mensajes (mensajes controlados en fun comprobarMensaje)
                "Adolescente" -> when(mensaje){
                                    "¿como estas?" -> println("De lujo")
                                    "grito" -> println("Eh relajate")
                                    "preguntaGrito" ->println("Tranqui se lo que hago")
                                    "nombre"-> println("¿Que pasa?")
                                    "adios" -> respuesta="no"

                                    else -> { println("Yo que se") }
                }
                "Adulto" -> when(mensaje){
                                    "¿como estas?" -> println("En la flor de la vida, pero me empieza a doler la espalda")
                                    "grito" -> println( "No me levantes la voz mequetrefe")
                                    "preguntaGrito" ->println("Estoy buscando la mejor solución")
                                    "nombre"-> println("¿Necesitas algo?")
                                    "adios" -> respuesta="no"

                                    else -> { println("No sé de qué me estás hablando") }


                                }
                "Anciano" -> when(mensaje){
                                    "¿como estas?" -> println("No me puedo mover")
                                    "grito" -> println("Háblame más alto que no te escucho")
                                    "preguntaGrito" ->println("Que no te escucho!")
                                    "nombre"-> println("Las 5 de la tarde")
                                    "adios" -> respuesta="no"

                                    else -> { println("En mis tiempos esto no pasaba") }


                                }
            }

        }

    }
}



fun main() {
    var numPersonajes = 0
    var respuesta: String = ""
    val personajes = mutableListOf<Personaje>()
    var cont:Int=0
    var respuestaN=""


    println("¿Cuantos personajes quieres crear?")
    numPersonajes = readln().toInt()



    while (numPersonajes <= 0) {
        print("Si no hay personajes no podrás hablar con ellos")
        numPersonajes = readln().toInt()
    }

    println("Perfecto,¿quieres que se creen automáticamente o introduces tu los datos a mano?")
    respuesta = readln()

    if (respuesta.equals("automáticamente") || respuesta.equals("Automáticamente") || respuesta.equals("automaticamente") || respuesta.equals(
            "Automaticamente")){
        println("Hecho")
        repeat(numPersonajes) {
            personajes.add(Personaje())
        }
    }else{
        repeat(numPersonajes) {
            personajes.add(Personaje())
        }
        println("Okey,pues introduce los datos:")
        personajes.forEach{
            cont=1
            println("Personaje"+ cont)
            println("Nombre:")
            it.nombre= readln()
            println("Estado Vital:")
            it.estadoVital= readln()
            println("Raza: ")
            it.raza= readln()
            println("Clase: ")
            it.clase=readln()
            cont++
        }
    }



    personajes.forEach {
        println("Nuestro personaje se llama: "+it.nombre)
        println("Acutalmente es un: " + it.estadoVital)
        println("Pertenece a la raza: "+ it.raza)
        println("Y es un: "+it.clase)
        println()
    }

    println("Hora de hablar con ellos")
    println("¿Con quien quieres hablar?,dime su nombre:")
    respuestaN= readln()



}