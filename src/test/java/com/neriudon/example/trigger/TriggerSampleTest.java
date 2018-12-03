package com.neriudon.example.trigger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.PollableChannel;
import org.springframework.messaging.support.GenericMessage;

public class TriggerSampleTest {

  private static Log logger = LogFactory.getLog(TriggerSampleTest.class);

  @Test
  public void demoTrigger() throws InterruptedException {
    ConfigurableApplicationContext ac =
        new ClassPathXmlApplicationContext(
            "/com/neriudon/example/trigger/TriggerSampleTest-context.xml");
    MessageChannel controlChannel = ac.getBean("controlChannel", MessageChannel.class);
    logger.info("adapter will be started");
    controlChannel.send(new GenericMessage<String>("@sampleAdapter.start()"));
    controlChannel.send(new GenericMessage<String>("@sampleAdapter.stop()"));
    Thread.sleep(10000);
    ac.close();
  }
}
