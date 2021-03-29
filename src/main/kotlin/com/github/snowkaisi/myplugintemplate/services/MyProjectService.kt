package com.github.snowkaisi.myplugintemplate.services

import com.github.snowkaisi.myplugintemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
