

fun main(){
    // variable
    var textVariable = "Hola "
    println(textVariable)
    // constante
    val constante = "Valor fijo"
    println(constante)



    //nuevo tipo de bucle
    var repeticiones = 6
    repeat(repeticiones){
        // en este caso podemos observar que "it" es el indice
        println("Estoy repitiendo esto por $it vez de un total de $repeticiones")
    }

    println("\n")

    // Creaddo un buble personalizado a "it"
    var repeat = 10
    repeat(repeat){ position ->
       println("Estoy repitiendo esto por la $position vez de un total de $repeat")
    }



    //llamada a función sin parametros
    funcionSinParametros()
    //llamada a la funcuón con parametro
    funcionConParametros(7)



    println("\nEspeficiamos variables numericas\n")
    var variable = 1
    val variable2 : Long = 11
    var variable3 = 0

    variable = variable3.toInt()

    println("la variable vale: $variable, la variable 2 vale $variable2 y la variable 1 vale: $variable")
    println("La variable 2 vale: $variable2")
    println("La suma de la variable 1 y la variable 2 es de: ${variable+variable2}")
    println("La suma de la variable 1 y la variable 3 es de: ${variable+variable3}")
    println("\n\n")


    // Es posible comprobar el tipo de variable
    if (variable is Int) println("Esto es un int") else println("Esto no es un entero")
    // por defecto las variable no pueden ser null
    val variable4 : Int? = null

    // combinar los String's con otras variables
    println("Variable2 vale $variable2")
    //combinación de resultados al realizar ciertas acciones
    var num = 6
    println("El numero recibido es... ${num.toLong()}")
    println("El numero recibido es... ${num+num}")


    /*

    "?" puede usarse para evitar llamar a las funciones de forma segura

    numero?.toLong()
    toLong() requiere de un no null. De esta manera, toLong solo se llamara si el numero != null

    Es posible forzar la llamada utilizando pero no es recomendable
    numero!!.toLong()

    En este caso, si numero == null, tendriamos un NullPointerException

     */

    num?.toLong()
    println("--->>>>>>El numerp es :"+num!!.toLong())





    //Condicionales basico:

    println("\n\nCondicional basico")
    if (num == 0) println("$num es igual a 0") else println("$num es diferente de 0")
    println("\n\nCondicional rangos")
    if (num in 0..10) println("$num es un numero comprendido entre 0 y 10") else println("$num es mayor a 9")


    println("\n\nSwitch que es el When")
    // Condicional switch
    when (num){
        0 -> println("$num es igual a 0")
        in 1..99 -> println("$num es un numero comprendido entre 0 y 9")
        100,101 -> println("$num es 100 o 101")
        else -> println("$num es menor de 0 y mayor de 101")
    }

    println("\n\n")
    for (i in 0..10){
        println("Ejecución del for"[i])
    }

    println("\n\n")
    for (i in 0..10){
        println("la i corresponde ha: $i")
    }






    println("\n\n\n\n")
    println("PROBLEMA PIRAMIDE ADAPTADADO\n")
    //PROBLEMA PIRAMIDE ADAPTADADO

        maximo(10)
    }

    fun maximo(size : Int){
        repeat(size){
            altura(it, size)
            base(it)
            println()
        }
    }

    fun base(base : Int){
        repeat(base) {
            print("_")
        }
        print("\\")
    }

    fun altura(base : Int, lado: Int) {
        repeat(lado - base) {
            print(" ")
        }
        print("/")
        repeat(base) {
            print("_")
        }
    }



fun funcionSinParametros(){
    println("Función sin parametros")
}

fun funcionConParametros(numeroEjemplo: Int){
    println("la función con parametros tiene en su interior: $numeroEjemplo")
}

