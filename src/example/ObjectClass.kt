package example
object GameSession {
    init {
        println("Игровая сессия создана")
    }

    var isActive: Boolean = false

    fun start() {
        isActive = true
        println("Игра началась")
    }

    fun end() {
        isActive = false
        println("Игра завершена")
    }
}
object Logger {
    var count = 0
    fun log(message: String){
        count++
        println("[$count] $message")
    }
}
object AppSetting{
    val version = "1.0.0"
    var isDarkMode = true
    fun toggleTheme() {
        isDarkMode = !isDarkMode
    }
    fun checkTheme(){
        if (AppSetting.isDarkMode){
            println("Тёмная тема включена")
        }
    }
}
object Colors{
    const val RED = "#FF0000"
    const val GREEN = "#00FF00"
    const val BLUE = "#0000FF"
}
fun main() {
    val handler = object {
        val name = "Обработчик"
        fun handle(){
            println("Обрабатываю")
        }
    }
    println(handler.name)
    handler.handle()
    Logger.log("Первое сообщение")
    Logger.log("Второе сообщение")
    val logger1 = Logger
    val logger2 = Logger
    println(logger1 === logger2)
    println("Программа запущена")
    println("Проверяем состояние, но не трогаем GameSession")
    println("Теперь запускаем игру")
    GameSession.start()
    println("Проверяем состояние ещё раз")
    println("Активная ли сессия: ${GameSession.isActive}")
}
