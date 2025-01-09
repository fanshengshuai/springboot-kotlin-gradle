package com.fss.canting.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/wf")
class WFController {

    @GetMapping("/sign_contract")
    fun signContract(): String {
        return "合同签署成功！"
    }
}
