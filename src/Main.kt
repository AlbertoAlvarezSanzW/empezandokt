import java.util.*


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
    println("\n\n")
    println("Cadenas con diferentes tipos")


    val list = listOf("Hola",2,3,"¿",0.1,"Que",1,"tal",0.9,"?")

    var res = 0.0
    var cad = ""
    var i = 0

    for(x in list.indices){
        if(list[x] is String)
            cad = cad + " " + list[x]
        else if ( list[x] is Int ){
            val num = list[x] as Int
            res += num
        } else if (list[x] is Double){
            res += list[x] as Double
        }
        i++
    }
    println(res)
    println(cad)


    println("\n")

    println("\n Casting \n")
    var myNumber = 2
    val myInterger = myNumber as Int
    println("la variable vale:"+myInterger)

    println("\nArrays")
    val array = arrayOf("Hola","adios","esto","es una lista")
    for(x in array){
        println(x)
    }
    println("\nMostrar el contenido de un Array en una lista:")
    println(array.contentToString())

    println("\n\nCreación de una lista")
    val lista2 = mutableListOf(1,2,3,4,5)
    println(lista2)
    // teniendo los elementos ya en una lista podemos asignar directamente
    val lista3 = array.asList()
    println(lista3)


    println("\n\nCreación de listas aplicando funciones: ")
    val listaV = MutableList(99) {pos -> if (pos % 2 == 0) pos * -1 else pos}
    //es posible crear listas de listas:
    val list1 = mutableListOf(1,2,3,"a",2.3)
    val list2 = mutableListOf(1,2.1)
    val array1 = arrayOf("Hola","Adios") // <- para leer un array HARA HALTA 1 FOR
    val listaD = mutableListOf(list1,list2,array1)
    println(listaD)



    println("\n\nBucles Avanzados")
    for (element in list.indices){
        print("$element")
    }

    println("\n\nEn caso de necesitar indice :")
    for ((element, index) in list.withIndex()){
        println("$element,$index")
    }

    /*
    Ejercicio de Ahorcado !

     */

    val palabra = "Ahorcado".toLowerCase()

    var listapalabra = mutableListOf<Char>() // <-- importante
    var listletras = mutableListOf<Char>() // <-- importante

    var letra:Char = ' '
    var contador = 0

    palabra.forEach{
        listapalabra.add('-')
    }

    while (listapalabra.contains('-')){
        listapalabra.forEach {
            print(it)
        }
        do{
            println("\n Introduzca una letra por favor: ")
            letra = readCharFromKeyboard2().toLowerCase()
            if(listletras.contains(letra))
                println("\n ¬_¬'U   La letra: "+letra+", ya ha sido anteriormente introducida... Mo se puede repetir!!! ")
        }while(listletras.contains(letra))
        listletras.add(letra)
        contador++

        for(i in palabra.indices){
            if(palabra[i]==letra)
                listapalabra.set(i,letra)
        }
    }
    println("\nCongratulations!!!\nHa descubierto la palabra: "+palabra+"" +
            "\nUsted ha necesitado: "+contador+" intentos")



    //llamada a la función
    funPolimorfica(15)
    funConValor()
    funPolimorfica(6)
    funValorPorDefectoMultiple()
    funValorPorDefectoMultiple(1,2)
    funValorPorDefectoMultiple(integer2 = 4)
    funValorPorDefectoMultiple(8)

    println("\n\nFiltros")
    val colores = mutableListOf("Rojo", "Azul", "Verde", "Naranja", "Amarillo")
    // en este caso vamos a filtrar por "A"
    val listaAMayuscula = colores.filter { it.contains("A") }
    // en este caso vamos a filtrar por colores de 4
    val listaCuatroLetras = colores.filter { it.length == 4 }
    println(listaAMayuscula)
    println(listaCuatroLetras)

    println("\n\nLazys")
    val lazyMayuscula = colores.asSequence().filter { it.contains("A") }
    println(lazyMayuscula)      // a diferencia de los Filtros normales no se puede imprimir normal
    lazyMayuscula.forEach {print("$it ")}   // se ha imprimir de esta manera


    println("\n\n\n\nEJERCICIO DE FUNCIONES")
    //EJERCICIO DE FUNCIONES
    val ciudades = listOf("Alicante", "Almería", "Barcelona", "Bilbao", "Burgos", "Cádiz", "Cartagena", "Córdoba", "Gerona"
            , "Gijón", "Granada", "Huelva", "Tenerife", "Ibiza", "Jerez", "Madrid", "Málaga", "Marbella", "Murcia", "Oviedo"
            , "Pamplona", "Ronda", "Salamanca", "San Sebastián", "Santander", "Santiago", "Sevilla", "Tarragona", "Toledo",
            "Valencia", "Zaragoza")

    // Crea una lista con todas las ciudades que tengan la letra "a" mayuscula o minuscula
    println(ejercicio1(ciudades))

    // Crea una lista lazy list de todas las ciudades que tengan la letra "a" mayuscula o minuscula. Las que tengan una "A"
    // deber ser mostradas en mayusculas todas las letras.
    ejercicio2(ciudades)

    // Elimina de ciudades todas las ciudades que tengan 8 letras. Recuerda que tu lista no Mutable
    println(ejercicio3(ciudades))

    // Escribe la lista de ciudades. Aquellas ciudades con una cantidad de letras impar al rever reves. Ej. Ibiza - azibI
    // Resultado esperado: [Alicante, aíremlA, anolecraB, Bilbao, Burgos, zidáC, anegatraC, abodróC, Gerona, nójiG, adanarG, Huelva, Tenerife, azibI, zereJ, Madrid, Málaga, Marbella, Murcia, Oviedo, Pamplona, adnoR, acnamalaS, náitsabeS naS, rednatnaS, Santiago, alliveS, anogarraT, Toledo, Valencia, Zaragoza]
    println(ejercicio5(ciudades))


    println("\n\nExtensiones en kotlin")

    /*
    Extensiones en kotlin

    teniendo una clase ya existente, es posible añadile ciertas fincionalidades a traves de las cuales añaden metodos
    adiccionales a esa clase
     */

    println("---EjemploExtensiones---")

    val string1 = "0123456789"
    val string2 = "Hola 1"
    val string3 = "Hola 123"

    println("String1 tiene ${string1.contadordeNumeros()} números, el String 2 tiene ${string2.contadordeNumeros()} número " +
            "y el String 3 tiene ${string3.contadordeNumeros()} números.")


    println("\n\nFunciones Lambdas")

    /*
    Una lamba es una forma de declarar una función de forma resumida, simplemente utilizando los {}
    Es posible agregar parámetros { num : Int -> println("He recibido $num como parametro.")}

    E incluso es posible devolver valores:
    val hazSuma: (Int, Int) -> {num1 : Int, num2: Int -> num1+num2}
    hazSuma(1,2)
     */
    println("\n\n")
    // Agregar parametros
    println("Agregar parametros en funciones lambdas")


    // Podemos asignar lambdas a funciones.
    val lambda = { println("Esto es una lamba en una variable.") }
    // Y las ejecutamos así.
    lambda()

    // Es posiblre definir parámetros para la lambda.
    val lambdaParametro = { num: Int -> println("He recibido $num como parametro.") }
    // Y las ejecutamos así.
    lambdaParametro(1)

    // En este caso indicamos explicitamente que la lambda requiere de dos parametros Int y que devuelve un Int.
    // Atencion, devuelve la ultima linea de la lambda
    val hazSuma: (Int, Int) -> Int = { num1: Int, num2: Int -> num1 + num2 }
    val hazResta: (Int, Int) -> Int = { num1: Int, num2: Int -> num1 - num2 }

    println("Sumo ${hazSuma(2,1)} como parametro.")
    println("Resto ${hazResta(2,1)} como parametro.")

    println("Sumo ${example(hazSuma)} desde una lambda.")
    println("Resto ${example(hazResta)} desde una lambda.")


    println("\n\nMas funciones lambda")
    val lista = listOf<Any>("1",2);

    val ejercicio1 = {println("Hola")}
    ejercicio1()
    val ejercicio2 = {integer : Int -> println("Hola $integer")}
    ejercicio2(1)
    val ejercicio3 =  {integer : Int, listInteger : List<Any> -> println("Hola ${integer + listInteger.size}")}
    ejercicio3(1, lista)
    val ejercicio4 : (Int, List<Any>) -> Int = { integer: Int, listInteger: List<Any> -> integer + listInteger.size}
    println("El numero es ${ejercicio4(1,lista)}")


    println("\n\nFunciones: let, run, with")
    /*
    Imaginado que existe una variable i.

    with(i){...}

    i.let {}

    run {} o i.run{}

    Estas 3 funciones devuelven la última línea de código de la Lambda.
    Son muy útiles en conjunto a ?
    i?.let { println("Este mensaje no aparecerá ya que i es null") }

    */
    i.let{}
    run{}
    i.run{}

    println("\n\nFunciones apply, also")
    // estas 2 funciones devolverian i
    i.also {}
    i.also {}
    println("\n\n")
    functionRun()
    functionWith()
    functionLet()
    functionAlso()
    functionApply()
    functionLetVsAlso()


    //Interfaz
    println("\n\n")


    println("\n\n\n\n")
    println("PROBLEMA PIRAMIDE ADAPTADADO\n")
    //PROBLEMA PIRAMIDE ADAPTADADO

        maximo(10)
    }


// función lambda
fun example(functionAsParameter: (Int, Int) -> Int) : Int {
    return functionAsParameter(2,1)
}

// Mas funciones lamdba
fun ejercicio1() {
    println("Hola")
}

class ClaseEjemplo{
    var int1 : Int = 0
    var int2 : Int = 0
}

fun functionRun(){
    println("--- functionRun ---")

    val i = ClaseEjemplo()

    run {
        i.int1++
        i.int2++
        println("El valor de i dentro del run1 es de ${i.int1} y ${i.int2}")
    }
    println("El valor de i fuera del run1 es de ${i.int1} y ${i.int2}")
    i.run {
        int1++
        int2++
        println("El valor de i dentro del run2 es de $int1 y $int2")
    }
    println("El valor de i fuera del run2 es de ${i.int1} y ${i.int2}")

}

fun functionWith(){
    println("--- functionWith ---")

    val i = ClaseEjemplo()

    with(i){
        int1++
        int2++
        println("El valor de i dentro del with es de $int1 y $int2")
    }
    println("El valor de i fuera del with es de ${i.int1} y ${i.int2}")
}

fun functionLet(){
    println("--- functionLet ---")
    var i : ClaseEjemplo? = null
    i?.let { println("Este mensaje no aparecerá ya que i es null") }

    i  = ClaseEjemplo()
    i.let {
        it.int1++
        it.int2++
        println("El valor de i dentro del let1 es de ${it.int1} y ${it.int2}") }
    println("El valor de i fuera del let1 es de ${i.int1} y ${i.int2}")

    i.let {
        i  = ClaseEjemplo()
        it.int1++
        it.int2++
        println("El valor de i dentro del let2 es de ${it.int1} y ${it.int2}")
        "Este es el resultado de let"
    }
    println("El valor de i fuera del let es de ${i?.int1} y ${i?.int2}")
    val resultado = i.let {
        it?.int1
    }
    println("El resultado de let es $resultado")

    i?.let {contador ->
        println("El numero recibido es $contador")
        // No se puede cambiar el valor de it.
    }
}

fun functionAlso(){
    println("--- functionAlso ---")
    var i : ClaseEjemplo? = null
    i?.also { println("Este mensaje no aparecerá ya que i es null") }

    i  = ClaseEjemplo()
    i.also {
        it.int1++
        it.int2++
        println("El valor de i dentro del let1 es de ${it.int1} y ${it.int2}") }
    println("El valor de i fuera del let1 es de ${i.int1} y ${i.int2}")

    i.also {
        i  = ClaseEjemplo()
        it.int1++
        it.int2++
        println("El valor de i dentro del also2 es de ${it.int1} y ${it.int2}")
    }
    println("El valor de i fuera del also2 es de ${i?.int1} y ${i?.int2}")
    val resultado = i.also {
        it?.int1
    }
    println("El resultado de also3 es ${resultado?.int1}")
    i.also { i?.int1 = 9 }.also { if (i?.int1 == 9) i?.int1 = 8 }
    println("El resultado de also4 es ${resultado?.int1}")

}

fun functionLetVsAlso(){
    println("--- functionLetVsAlso ---")

    val i = ClaseEjemplo()
    val resultado1 = i.let {
        it.int1
    }
    println("El resultado de let es ${resultado1::class.java}")
    val resultado2 = i.also {
        it.int1
    }
    println("El resultado de also es ${resultado2::class.java}")
}

fun functionApply() {
    println("--- functionApply ---")
    val i = ClaseEjemplo()
    i.apply {
        int1++
        int2++
        println("El valor de i dentro del apply es de $int1 y $int2")
    }
    println("El valor de i fuera del apply es de ${i.int1} y ${i.int2}")
}

fun ejercicio2(integer : Int) {
    println("Hola $integer")
}

fun ejercicio3(integer : Int, listInteger : List<Any>) {
    println("Hola ${integer + listInteger.size}")
}

fun ejercicio4(integer : Int, listInteger : List<Any>) : Int {
    return integer + listInteger.size
}




// funcion contadorDenumeros (Extensión en kotlin)
fun String.contadordeNumeros() : Int{
    var contador = 0
    forEach { if (it.isDigit()) contador++ }
    return contador
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


// Scanner !

fun leerporteclado(): Int {
    var result: Int?
    val keyboardReader = Scanner(System.`in`)
    do {
        val selectedOption = keyboardReader.nextLine()
        result = try {
            selectedOption.toInt()
        } catch (e: NumberFormatException) {
            println("Lo que has introducido no es un número.")
            null
        }
    } while (result == null)
    return result
}

fun valorRandom(rango: IntRange): Int {
    return rango.random()
}

fun readCharFromKeyboard2(): Char {
    var result: Char?
    val keyboardReader = Scanner(System.`in`)
    do {
        val selectedOption = keyboardReader.nextLine()
        result = if (selectedOption.length == 1) selectedOption[0] else null
    } while (result == null)
    return result
}

// función de polimorfismo, es como java
fun funPolimorfica(){

}
fun funPolimorfica (integer : Int){

}

// Dar un valor ya por defecto:
fun funConValor(integer : Int = 15){

}

fun funValorPorDefectoMultiple(integer1: Int = 15, integer2: Int = 10){
    println("el valor recibido es un $integer1")
    println("el valor recibido es un $integer2")

}

// EJERCICIO DE FUNCIONES
fun ejercicio5(ciudades: List<String>): Any? {
    val ciudadesMutable = ciudades.toMutableList()
    val ciudadesImpares = ciudades.asSequence().filter { (it.length.rem(2) == 1) }
    ciudadesImpares.forEach { ciudadImpar: String ->  ciudadesMutable.forEachIndexed{ index: Int, ciudad: String ->  if (ciudad.contentEquals(ciudadImpar)) ciudadesMutable[index] = ciudadesMutable[index].reversed() }  }
    return ciudadesMutable
}

fun ejercicio3(ciudades: List<String>): MutableList<String> {
    val ciudadesABorrar = ciudades.asSequence().filter { it.length == 8 }
    // Las tres ultimas líneas podrían reducirse a esta:
    // return ciudades.toMutableList().apply { removeAll(ciudadesABorrar) }
    val ciudadesMutable = ciudades.toMutableList()
    ciudadesMutable.removeAll(ciudadesABorrar)
    return ciudadesMutable
}

fun ejercicio2(ciudades: List<String>) {
    ciudades.asSequence().filter { it.contains("a") }
    ciudades.forEach { if (it.contains("A")) print("${it.toUpperCase()}, ") else print("$it, ") }
    println()
}

fun ejercicio1(ciudades: List<String>): List<String> {
    // Tambien se puede hacer con expresiones regulares
    return ciudades.filter { it.contains("a") || it.contains("A") }
}


