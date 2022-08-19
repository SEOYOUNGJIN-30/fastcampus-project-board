package com.fastcampus.projectboard.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Optional;

//EnableJpaAudition-> 사용하기 위해 JpaConfig 생성
@EnableJpaAuditing
@Configuration
public class JpaConfig {

    //사람 이름 정보를 넣어주기 위한 Bean
    @Bean
    public AuditorAware<String> auditorAware() {
        return () -> Optional.of("syj"); //스프링 시큐리티로 인증 기능을 붙이게 될 때 수정하기.
    }
}
