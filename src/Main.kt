import kotlin.random.Random

class Personaje() {
    var nombre: String = "Jack"
    var estadoVital: String = ""
    var raza: String = ""
    var clase: String =""


    fun creacionPersonaje(){
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

    fun comprobarGrito(mensaje:String): String{
        var mensajeA:String = mensaje


        if(mensaje.equals(mensaje.uppercase()) && mensaje.contains("?")){
            mensajeA="preguntaGrito"
        }else{
            if(mensaje.equals(mensaje.uppercase()))
            mensajeA="grito"
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

            mensaje=comprobarGrito(mensaje)



            when(this.estadoVital){
                "Adolescente" -> when(mensaje){
                                    "¿Como estas?" -> println("De lujo")
                                    "¿como estas?" -> println("De lujo")
                                    "grito" -> println("Eh relajate")
                                    "preguntaGrito" ->println("Tranqui se lo que hago")
                                    this.nombre -> println("¿Que pasa?")
                                    ""

                                    else -> { println("Yo que se") }
                }
                "Adulto" -> when(mensaje){

                                }
                "Anciano" -> when(mensaje){

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