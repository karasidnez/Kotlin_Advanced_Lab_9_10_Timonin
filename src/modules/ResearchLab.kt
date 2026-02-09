package modules

import resources.ResourseManager

class ResearchLab : OutpostModule(name = "Исследовательская лаборатория") {
    override fun performAction(manager: ResourseManager): ModuleResult {
        val minerals = manager.get("Minerals")
        if (minerals == null || minerals.amount < 30) {
            return ModuleResult.NotEnoughResources(
                resourceName = "Minerals",
                required = 30,
                available = minerals?.amount ?: 0
            )
        }
        minerals.amount -= 30
        return ModuleResult.Success(message = "Исследование завершено")
    }
}