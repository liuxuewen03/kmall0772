package com.kgc.kmall.user.controller;

import com.kgc.kmall.bean.Member;
import com.kgc.kmall.service.MemberService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-12-15 19:25
 */
@RestController
public class MemberControlelr {

    @Reference
    MemberService memberService;

    @RequestMapping("")
    public List<Member> test(){

        return memberService.selectAllMember();
    }
}
