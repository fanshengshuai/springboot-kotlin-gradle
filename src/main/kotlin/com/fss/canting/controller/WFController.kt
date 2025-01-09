package com.fss.canting.controller

import User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.data.mongodb.core.query.Criteria
import org.springframework.data.mongodb.core.query.Query
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/wf")
class WFController(@Autowired private val mongoTemplate: MongoTemplate) {

    @GetMapping("/sign_contract")
    fun signContract(): Any {
        // 创建一个查询条件，这里以查询年龄大于20岁的用户为例
        val criteria: Criteria = Criteria.where("_id").lt(2)
        val query = Query(criteria)

        // 使用MongoTemplate执行查询，返回符合条件的用户列表
        val userList: List<User> = mongoTemplate.find(query, User::class.java, "user_data")
        for (user in userList) {
            println("查询到的用户：" + user.name + ", 年龄：" + user.age)
        }
        return userList
    }
}
