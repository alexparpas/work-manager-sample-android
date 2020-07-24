package com.alexparpas.facts.repos

import com.alexparpas.facts.entities.Fact

class FactsRepository {
    fun getFacts(): List<Fact> = listOf(
        Fact(
            id = "123",
            tip = "Hello World 1",
            category = "General",
            date = null,
            subcategory = null,
            provider = null
        ),
        Fact(
            id = "234",
            tip = "Hello World 2",
            category = "Development",
            date = null,
            subcategory = null,
            provider = null
        ),
        Fact(
            id = "345",
            tip = "Hello World 3",
            category = "Development",
            date = null,
            subcategory = null,
            provider = null
        )
    )

    fun getRandomFact(): Fact = getFacts().random()
}