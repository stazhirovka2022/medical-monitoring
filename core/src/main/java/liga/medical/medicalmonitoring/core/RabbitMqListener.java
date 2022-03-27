package liga.medical.medicalmonitoring.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@EnableRabbit
@Component
public class RabbitMqListener {

    Logger logger = LoggerFactory.getLogger(RabbitMqListener.class);

    /**
     * Обрабатываем сообщение.
     *
     * @param message сообщение
     */
    @RabbitListener(queues = "patient-alert")
    public void processAppQueue(String message) {

        // реализовать сохранение в БД случаев на которые должны реагировать
        // отслеживать скорую, которая освобождается и передавать информацию на вызов
        logger.info("Получено сообщенеи об ухудшении состояния пациента: {}", message);
    }

}
