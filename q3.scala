@main def main():Unit = 
    println(formatNames("Benny",toUpper))
    println(formatNames("N",toUpper)+formatNames("iroshan",toLower))
    println(formatNames("Saman",toLower))
    println(formatNames("K",toUpper)+formatNames("umar",toLower)+formatNames("A",toUpper))
    

def toUpper(s:String): String = s.toUpperCase()
def toLower(s:String): String = s.toLowerCase()

def formatNames(name:String, method:(String)=>String) = method(name)

