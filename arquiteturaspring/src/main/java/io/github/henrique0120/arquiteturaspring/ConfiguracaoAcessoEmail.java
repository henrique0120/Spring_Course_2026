package io.github.henrique0120.arquiteturaspring;

import io.github.henrique0120.arquiteturaspring.todos.AppProperties;
import io.github.henrique0120.arquiteturaspring.todos.MailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfiguracaoAcessoEmail {

    @Autowired
    private AppProperties properties;

    //@Bean
    public MailSender mailSender(){
        return null;
    }
}
