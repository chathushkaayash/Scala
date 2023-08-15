object Q1 extends App{
    val calculateInterest: Double => Double = depositAmount =>
        if (depositAmount <= 20000) 0.02 * depositAmount
        else if (depositAmount <= 200000) 0.04 * depositAmount
        else if (depositAmount <= 2000000) 0.035 * depositAmount
        else 0.065 * depositAmount

    println(calculateInterest(25000))
}
