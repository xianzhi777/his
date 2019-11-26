package com.woniu.his.config;

import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitmqConfig {
    public static final String QUEUE_INFORM_SURGERY = "queue_inform_surgery";
    public static final String QUEUE_INFORM_INYERNAL = "queue_inform_internal";
    public static final String EXCHANGE_TOPICS_INFORM="exchange_topics_inform";
    public static final String ROUTINGKEY_SURGERY="inform.#.surgery.#";
    public static final String ROUTINGKEY_INTERNAL="inform.#.internal.#";
    @Bean(EXCHANGE_TOPICS_INFORM)
    public Exchange EXCHANGE_TOPICS_INFORM(){
        //durable(true) 持久化，mq重启之后交换机还在
        return ExchangeBuilder.topicExchange(EXCHANGE_TOPICS_INFORM).durable(true).build();
    }
    //声明QUEUE_INFORM_EMAIL队列
    @Bean(QUEUE_INFORM_SURGERY)
    public Queue QUEUE_INFORM_SURGERY(){
        return new Queue(QUEUE_INFORM_SURGERY);
    }
    @Bean(QUEUE_INFORM_INYERNAL)
    public Queue QUEUE_INFORM_INYERNAL(){
        return new Queue(QUEUE_INFORM_INYERNAL);
    }
    //ROUTINGKEY_EMAIL队列绑定交换机，指定routingKey
    @Bean
    public Binding BINDING_QUEUE_INFORM_SURGERY(@Qualifier(QUEUE_INFORM_SURGERY) Queue queue,
                                              @Qualifier(EXCHANGE_TOPICS_INFORM) Exchange exchange){
        return BindingBuilder.bind(queue).to(exchange).with(ROUTINGKEY_SURGERY).noargs();
    }
    @Bean
    public Binding BINDING_QUEUE_INFORM_INYERNAL(@Qualifier(QUEUE_INFORM_INYERNAL) Queue queue,
                                                @Qualifier(EXCHANGE_TOPICS_INFORM) Exchange exchange){
        return BindingBuilder.bind(queue).to(exchange).with(ROUTINGKEY_INTERNAL).noargs();
    }
}
