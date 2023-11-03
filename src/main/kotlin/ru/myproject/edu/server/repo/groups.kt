package ru.myproject.edu.server.repo

import ru.altmanea.edu.server.model.Group


val groupsRepo = ListRepo<Group>()


val groupsRepoTestData = listOf(
    Group("29м"),
    Group("29з"),
    Group("20з"),
    Group("20м"),

)

