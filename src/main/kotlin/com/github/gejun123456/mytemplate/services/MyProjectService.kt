package com.github.gejun123456.mytemplate.services

import com.intellij.openapi.project.Project
import com.github.gejun123456.mytemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
