package com.paul.config;

import com.paul.career.CareerJpaRepositoryAdapter;
import com.paul.career.CareerMongoRepositoryAdapter;
import com.paul.career.CareerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class BeanConfiguration {

    private boolean isUseMongoDB;

    @Autowired
    public void setUseMongoDB(@Value("${career.infra.mongo}") boolean useMongoDB) {
        log.info("MongoDB 사용 여부: [{}]", isUseMongoDB);
        isUseMongoDB = useMongoDB;
    }

    @Bean
    public CareerRepository careerRepository(CareerJpaRepositoryAdapter jpaRepositoryAdapter,
                                             CareerMongoRepositoryAdapter mongoRepositoryAdapter) {
        return isUseMongoDB ? mongoRepositoryAdapter : jpaRepositoryAdapter;
    }
}
