package com.github.tyrrx.buntenachtaddr.services

import com.intellij.openapi.project.Project
import com.github.tyrrx.buntenachtaddr.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
