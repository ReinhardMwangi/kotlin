fun main() {
    val name = "Mwas"
    println(name)
    println(name.length)
    println(name.uppercase())
    println(name.lowercase())
    println(name[0])

    println("".isEmpty())

    val age = 20

    val msg = "Name$name, Age:$age"
    println(msg)

    val email = """
        Hello %s
        How 
        Are you
        """.trimIndent()

    println(email.format("Ana"))
}