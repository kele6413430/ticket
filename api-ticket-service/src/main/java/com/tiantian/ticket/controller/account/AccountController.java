package com.tiantian.ticket.controller.account;

import com.tiantian.ticket.mapper.AccountMapper;
import com.tiantian.ticket.model.Account;
import com.tiantian.ticket.model.AccountExample;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.parsing.SourceExtractor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2019/6/5 0005.
 */
@Slf4j
@RestController
@RequestMapping("api/account")
@Api(value = "AccountController", description = "车后订单管理")
public class AccountController {

    @Autowired
    private AccountMapper accountMapper;

    @ApiOperation(value = "用户信息", notes = "用户不存在时返回空", httpMethod = "GET",
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiImplicitParams({
    })
    @GetMapping("hello")
    public String hello(){
        log.info("hehe");
        AccountExample example = new AccountExample();
        List<Account> accounts = accountMapper.selectByExample(example);
        System.out.println(accounts.size());
        return "Hello";
    }
}
