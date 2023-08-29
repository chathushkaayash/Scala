object q2 extends App{
    def countLetterOccurrences(words: List[String]): Int = {
    val wordLengths = words.map(_.length) 
    val totalLetterCount = wordLengths.reduce(_ + _) 
    totalLetterCount
    }

    val words = List("apple", "banana", "cherry", "date")
    print(countLetterOccurrences(words))
}
