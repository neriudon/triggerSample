# triggerSample
verify about spring integration's trigger

# output
```
12 04, 2018 7:40:57 午前 com.neriudon.example.trigger.TriggerSampleTest demoTrigger
情報: adapter will be started
12 04, 2018 7:40:57 午前 org.springframework.integration.handler.LoggingHandler handleMessageInternal
情報: autoStart
12 04, 2018 7:40:57 午前 org.springframework.integration.endpoint.SourcePollingChannelAdapter start
情報: started firedBusAdapter
12 04, 2018 7:40:57 午前 org.springframework.integration.handler.LoggingHandler handleMessageInternal
情報: firedBus
12 04, 2018 7:40:57 午前 org.springframework.integration.endpoint.SourcePollingChannelAdapter start
情報: started firedBusWithDelayAdapter
12 04, 2018 7:41:02 午前 org.springframework.integration.handler.LoggingHandler handleMessageInternal
情報: autoStartWithDelay
12 04, 2018 7:41:02 午前 org.springframework.integration.handler.LoggingHandler handleMessageInternal
情報: firedBusWithDelay
12 04, 2018 7:41:07 午前 com.neriudon.example.trigger.TriggerSampleTest demoTrigger
情報: ** end **
```
