package org.example.java_kotlin.repositories

import org.example.java_kotlin.model.Article
import org.example.java_kotlin.model.User
import org.springframework.data.repository.CrudRepository

interface ArticleRepository: CrudRepository<Article, Long> {
    fun findBySlug(slug: String): Article?
    fun findAllByOrderByAddedAtDesc(): Iterable<Article>
}

interface UserRepository: CrudRepository<User, Long> {
    fun findByLogin(login: String): User?
}