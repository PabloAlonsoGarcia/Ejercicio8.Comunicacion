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

    fun comunicacion(personaje: Personaje){
        var respuesta:String =""
        var mensaje:String=""

        println("¿Hablamos con el un rato?")
        respuesta= readln()

        while(respuesta=="si" || respuesta=="Si"){
            println("Dale,hablemos con el")

            mensaje=readln().lowercase()

            when(this.estadoVital){




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











}