package nicestring

fun String.isNice(): Boolean {
    var count = 0
    if (this.doesNotContainAny("bu", "ba", "be")) {
        count++
    }

    val count1 = this.map { it == 'a' || it == 'e' || it == 'i' || it == 'o' || it == 'u' }.count { it }

    if(count1 >= 3) {
        count++
    }

   if(containsDoubleLetter(this)){
       count++
   }


    return count == 2 || count == 3

}

fun String.doesNotContainAny(vararg substrings: String): Boolean =
    substrings.none {
        this.contains(it)
    }

fun checkValue(this1 : String) : Boolean{
    return !this1.contains("bu") || this1.contains("ba")|| this1.contains("be")
}


fun containsDoubleLetter(input: String): Boolean {
    for (i in 0 until input.length-1) {
        if (input[i] == input[i + 1]) {
            return true
        }
    }
    return false
}

fun main (){
    val count1 = "wddf".map { it == 'a' || it == 'e' || it == 'i' || it == 'o' || it == 'u' }.count { it }
    print(checkValue("wddf"))
}