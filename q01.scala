object q1 extends App{
    def calculateAverage(temperatures: List[Double]): Double = {
    val fahrenheitTemperatures = temperatures.map(celsius => (celsius * 9.0/5.0) + 32)
    val totalFahrenheit = fahrenheitTemperatures.reduce((temp1, temp2) => temp1 + temp2)
    val averageFahrenheit = totalFahrenheit / temperatures.length.toDouble
    averageFahrenheit
  }
    val celsiusTemperatures = List(0.0,10.0,20.0,30.0)
    
    println(calculateAverage(celsiusTemperatures))
}
