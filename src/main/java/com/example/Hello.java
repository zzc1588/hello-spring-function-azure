package com.example;

import com.example.entity.SpuInfoEntity;
import com.example.model.Greeting;
import com.example.model.User;
import com.example.service.SpuInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.function.Function;

@Component
public class Hello implements Function<Mono<User>, Mono<Greeting>> {
    @Autowired
    SpuInfoService spuInfoService;
    public Mono<Greeting> apply(Mono<User> mono) {
        List<SpuInfoEntity> list = spuInfoService.list();
        for (SpuInfoEntity infoEntity : list) {
            System.out.println(infoEntity);
        }

        return mono.map(user -> new Greeting("Hello, " + user.getName() + "!\n"));
    }
}
