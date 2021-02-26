package com.github.xinboljy.templatefromjb.services

import com.github.xinboljy.templatefromjb.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
