package ru.myproject.edu.server.repo

import ru.altmanea.edu.server.model.Flow

val flowsRepo = ListRepo<Flow>()

val flowsRepoTestData = listOf(
    Flow(name = "ПП_лек",  "Lecture"),
    Flow(name = "ПП_пр",  "Practice"),
    Flow(name = "ПП_лаб",  "Lab")
)