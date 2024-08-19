@main def main():Unit = numberType(scala.io.StdIn.readInt())

def numberType(number:Int):Unit= number.match{
    case n if n <=0 => print("Negative/Zero")
    case n if n%2 == 0 => print("Even Number")
    case _ => print("Odd Number")
}