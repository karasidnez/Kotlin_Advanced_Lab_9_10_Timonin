package modules

import resources.OutpostResource
import resources.ResourseManager

class EnergyGenerator : OutpostModule(name = "Генератор энергии") {
    override fun performAction(manager: ResourseManager): ModuleResult {
        println("Генератор работает...производит 20 энергии")
        val energy = manager.get("Energy")
        return if (energy != null) {
            energy.amount += 20
            ModuleResult.ResourceProduced(resourceName = "Energy", amount = 20)
        } else {
            manager.add(OutpostResource(id = 99, name = "Energy", amount = 20))
            ModuleResult.Success(message = "Энергия создана впервые")
        }
    }
}