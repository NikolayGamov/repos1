package ru.tinkoff.lesson14

class XMLObject
{
    val begin = "<Object>"
    val end = "</Object>"
    val text = arrayListOf(begin, end)
    lateinit var name: String
    lateinit var surName: String
    lateinit var birthDate: String

    fun MakeXmlFrame(infoType: String, info: String): String
    {
        return "<$infoType>$info</$infoType>"
    }

    fun Name(name: String)
    {
        text.add(1, MakeXmlFrame("name", name))
    }
    fun SurName(surName: String)
    {
        text.add(2, MakeXmlFrame("surname", surName))
    }
    fun BirthDate(date: String)
    {
        text.add(3, MakeXmlFrame("birthDate", date))
    }

    var i = text.size - 1
    operator fun Any.unaryPlus(){
        text.add(i, MakeXmlFrame("address", this.toString()))
        i++
    }

    infix fun Addresses(block: XMLObject.()-> Unit){
        block()
    }

    fun BuildXml()
    {
        Name(name)
        SurName(surName)
        BirthDate(birthDate)
    }

    fun PrintXML()
    {
        BuildXml()
        for(string in text)
            println(string)
    }
}

fun XML(block: XMLObject.() -> Unit) {block(XMLObject())}

fun main()
{
    XML{
        name      = "erg"
        surName   = "Gamov"
        birthDate = "16.12.1997"

        Addresses{
            +"547382@trjky.net"
            +"5678@fgh.ru"
            +"1234@abc.com"
        }

        PrintXML()
    }
}

