package outpostState

fun main() {
    println("Старт программы")

    val manager = OutpostManager()

    manager.resources.add(ObservableResource("Minerals", 100))
    manager.resources.add(ObservableResource("Energy", 50))

    val observer = ResourceObserver()
    observer.watch(manager.resources[0])

    manager.resources[0].amount = 120
    manager.resources[1].amount = 70

    StateStorage.save(manager.resources)

    val loaded = StateStorage.load()
    println("\nЗагруженные ресурсы:")
    loaded.forEach { println("${it.name}: ${it.amount}") }

}