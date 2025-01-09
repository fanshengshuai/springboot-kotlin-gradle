package com.fss.dao;

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;

@Configuration
class MongoConfig {
    @Value("\${spring.data.mongodb.uri}")
    private lateinit var mongoClientURI: String
    @Bean
    fun mongoDatabaseFactory(): MongoDatabaseFactory {
        // 这里假设你的MongoDB连接字符串是从配置文件中读取的，例如使用@Value("${spring.data.mongodb.uri}")
        return SimpleMongoClientDatabaseFactory(mongoClientURI)
    }

    @Bean
    fun mongoTemplate(mongoDatabaseFactory: MongoDatabaseFactory): MongoTemplate {
        return MongoTemplate(mongoDatabaseFactory)
    }
}
