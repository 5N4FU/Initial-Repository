val words = List("Air", "Liquid", "Solid", "Alphabet",  "Steam", "Elements", "Alphanumeric", "Scala" )
    words.foreach(x => println(x)) 
      
val alphaSort = words.sorted
    alphaSort.foreach(x => println(x))
      
val sizeSort = words.sortBy(_.length)
    sizeSort.foreach(x => println(x))
