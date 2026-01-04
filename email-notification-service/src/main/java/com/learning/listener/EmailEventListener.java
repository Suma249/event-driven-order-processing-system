package com.learning.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.learning.event.PaymentCompletedEvent;

@Component
public class EmailEventListener {

	@RabbitListener(queues="email.notification.queue")
	public void sendEmail(PaymentCompletedEvent event) {
		System.out.println("in email service user email is: "+event.getUserEmail());
		if("SUCCESS".equals(event.getPaymentStatus()))
			System.out.println("email sent to "+event.getUserEmail()+" : order "+event.getOrderId()+" confirmed");
		else
			System.out.println("email sent to "+event.getUserEmail()+" : payment failed for order "+event.getOrderId());
			
			
	}
}
