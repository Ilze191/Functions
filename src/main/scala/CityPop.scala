object CityPop extends App{

  def getCityYear(pO:Int, perc:Double, delta:Int, targetPopulation:Int):Int = {
    var futurePopulation:Double = pO
    var year:Int = 0

    while(futurePopulation < targetPopulation && year >= 0)
    {
      futurePopulation = futurePopulation * (1 + perc/100) + delta
      year = year + 1
      if(futurePopulation < pO) year = -1
    }
    year
  }
  println(getCityYear(1000,2,50,1200)) // should print 3
  println(getCityYear(1000,2,-50,1200)) // should print -1
  println(getCityYear(1500000,2.5,10000,2000000)) // should print 10 
}
