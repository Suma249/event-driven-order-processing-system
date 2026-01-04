package com.learning.config;

//email service
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.ExchangeBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

@Configuration
public class RabbitMQConfig {

    public static final String ORDER_EXCHANGE = "order.events"; //place where order service wil produce events to
    public static final String EMAIL_QUEUE = "email.notification.queue"; //queue from where order service will consume events

    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        return mapper;
    }

    @Bean
    public MessageConverter jsonMessageConverter(ObjectMapper objectMapper) {
        return new Jackson2JsonMessageConverter(objectMapper);
    }

    @Bean
    public Exchange orderExchange() {
        return new TopicExchange(ORDER_EXCHANGE);
    }
    
    @Bean
    public Queue emailQueue() {
    	return new Queue(EMAIL_QUEUE, true);
    }
    
    @Bean
    public Binding emailBindig(Queue emailQueue, Exchange orderExchange) {
    	return BindingBuilder
    			.bind(emailQueue)
    			.to(orderExchange)
    			.with("payment.completed")
    			.noargs();
    }

}
