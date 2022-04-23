package com.github.lihuu.testplugin.services

import com.intellij.openapi.project.Project
import com.github.lihuu.testplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
