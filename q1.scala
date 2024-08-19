@main def main():Unit = print(yearlyInterest(20000000))


def yearlyInterest(deposit:Int):Double = deposit.match{
    case x if x <= 20000 => deposit*0.02
    case x if x <= 200000 => deposit*0.04
    case x if x <= 2000000 => deposit*0.035
    case _ => deposit*0.065 // There may be a issue in the question logic
}