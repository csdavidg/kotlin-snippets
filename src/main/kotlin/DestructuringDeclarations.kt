data class FileNameComponent(val name: String, val extension: String, val path: String? = null)

class DestructuringDeclarations {

    fun getFileComponents(fileName: String): FileNameComponent {
        val path = fileName.substringBeforeLast("/")
        val components = fileName.substringAfterLast("/").split(".")
        return FileNameComponent(components[0], components[1], path)
    }

}

fun main(args: Array<String>) {
    val dd = DestructuringDeclarations()
    val (name, extension, path) = dd.getFileComponents("/main/csanchez/Documents/fileName.docx")
    path?.let { println("The path is: $it") }
    println("Name: $name, extension: $extension")
}