package com.rat.study.weChat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weChat")
public class LoginHandleController {

    private final Logger log = LoggerFactory.getLogger(LoginHandleController.class);

    @GetMapping("/login")
    @ResponseBody
    public Object login() {
        log.debug("login");
        return "111";
    }

}
