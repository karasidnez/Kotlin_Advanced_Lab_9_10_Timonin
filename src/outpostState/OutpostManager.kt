package outpostState

class OutpostManager {
    val resources by lazy {
        println("Менеджер аванпоста создан")
        mutableListOf<ObservableResource>()
    }
}