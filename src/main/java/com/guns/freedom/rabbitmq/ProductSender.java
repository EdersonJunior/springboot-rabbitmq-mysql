package com.guns.freedom.rabbitmq;

import com.guns.freedom.interfaces.IProductSender;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
public class ProductSender implements IProductSender {

    private final RabbitTemplate rabbitTemplate;

    public ProductSender(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @Override
    public void sendMessage(String message) throws Exception {
        try {
            rabbitTemplate.convertAndSend(MessagingRabbitmqApplication.topicExchangeName, "foo.bar.baz", message);

        } catch (Exception e) {
            throw new Exception("Error at trying to send the message." + e);
        }
    }
}
