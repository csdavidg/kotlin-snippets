@file:JvmName("StringFunctions") // Giving a custom name to this class to be used in java code
package strings

//const creates a public static final field
const val UNIX_LINE_SEPARATOR = "\n"

//Adding lastChar function to the String class
fun String.lastChar() : Char = this[this.length - 1]

//Adding lastChar property to the String class as an extension property immutable
val String.lastCharacter: Char get() = this[this.length - 1]

//Adding lastCharacterMutable property to the String class as an extension property mutable
var StringBuilder.lastCharacterMutable: Char
    get() = this[this.length - 1]
    set(value: Char) {
        this.setCharAt(this.length - 1, value)
    }

/*
@JvmOverloads// @JvCreate the overloaded methods using the default values
fun <T> printCollection(collection: Collection<T>, separator: String = ",", prefix : String = "", suffix: String ="") : String{
    val str = StringBuilder(prefix)

    for((i, v) in collection.withIndex()){
        if(i > 0){
            str.append(separator)
        }
        str.append(v)
    }
    str.append(suffix)

    return str.toString()
}*/

@JvmOverloads// @JvCreate the overloaded methods using the default values
//Adding printCollection as an extension function
fun <T> Collection<T>.printCollection(separator: String = ",", prefix : String = "", suffix: String ="") : String{
    val str = StringBuilder(prefix)

    for((i, v) in this.withIndex()){
        if(i > 0){
            str.append(separator)
        }
        str.append(v)
    }
    str.append(suffix)

    return str.toString()
}