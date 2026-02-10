package outpostState

import java.io.File

object StateStorage {
    fun save(resources: List<ObservableResource>) {
        val file = File("state.txt")
        val text = resources.joinToString("\n") { "${it.name}=${it.amount}" }
        file.writeText(text)
        println("Сохранено ${resources.size} ресурсов")
    }

    fun load(): List<ObservableResource> {
        val file = File("state.txt")
        if (!file.exists()) return emptyList()

        return file.readLines().mapNotNull {
            val parts = it.split("=")
            if (parts.size == 2) {
                ObservableResource(parts[0], parts[1].toInt())
            } else null
        }
    }
}