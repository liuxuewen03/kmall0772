package com.kgc.kmall.user.service;

import com.kgc.kmall.service.MemberService;
import com.kgc.kmall.user.mapper.MemberMapper;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.lang.reflect.Member;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-12-15 18:41
 */

@Component
@Service
public class MemberServiceImpl implements MemberService {
    @Resource
    MemberMapper memberMapper;
    @Override
    public List<com.kgc.kmall.bean.Member> selectAllMember() {
        return memberMapper.selectByExample(null);
    }
}
