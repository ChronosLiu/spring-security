package com.yangliu.browser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 * 自定义实现UserDetailService,查询用户信息
 */
@Component
public class MyUserDetailsService implements UserDetailsService {
    private Logger logger = LoggerFactory.getLogger(getClass());
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        logger.info("登录用户名："+s);
        //todo:根据用户名查询用户信息
        return new User(s,"123456", AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
    }
}
