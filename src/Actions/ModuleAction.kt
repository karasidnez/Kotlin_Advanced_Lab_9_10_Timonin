package Actions

import resources.ResourseManager

interface ModuleAction {
    fun execute(manager: ResourseManager)
}