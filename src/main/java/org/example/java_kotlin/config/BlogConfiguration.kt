package org.example.java_kotlin.config

import org.example.java_kotlin.model.Article
import org.example.java_kotlin.model.User
import org.example.java_kotlin.repositories.ArticleRepository
import org.example.java_kotlin.repositories.UserRepository
import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

//@Configuration
class BlogConfiguration {
/*
    @Bean
    fun databaseInitializer(userRepository: UserRepository, articleRepository: ArticleRepository) = ApplicationRunner {
        val smaldini = userRepository.save(
            User("smaldini", "Stéphane", "Maldini")
        )
        articleRepository.save(
            Article(
                title = "Reactor Bismuth is out",
                headline = "Lorem ipsum",
                content = "dolor sit amet",
                author = smaldini
            )
        )
        articleRepository.save(
            Article(
                title = "Reactor Aluminium has landed",
                headline = "Lorem ipsum",
                content = "dolor sit amet",
                author = smaldini
            )
        )

    }*/
}