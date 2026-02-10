package outpostState

class ResourceObserver {
    fun watch(resource: ObservableResource) {
        println("Наблюдатель подключён к ресурсу ${resource.name}")
    }
}