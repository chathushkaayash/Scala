object Q3 extends App{

    val toUpper: String => String = str => str.toUpperCase
    val toLower: String => String = str => str.toLowerCase
    val formatNames: (String, String => String) => String = (name, formatFunc) => formatFunc(name)

    
    println(formatNames("Benny",toUpper))
    println(formatNames("Ni",toUpper)+"roshan")
    println(formatNames("Saman",toLower))
    println("Kumar"+formatNames("a",toUpper))
}
