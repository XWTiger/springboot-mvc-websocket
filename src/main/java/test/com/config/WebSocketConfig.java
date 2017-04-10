package test.com.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

@Configuration
@EnableWebSocketMessageBroker
//通过EnableWebSocketMessageBroker 开启使用STOMP协议来传输基于代理(message broker)的消息,此时浏览器支持使用@MessageMapping 就像支持@RequestMapping一样。
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer{

	@Override
	 //注册一个名字为"/tiger-hello" 的endpoint,并指定 SockJS协议。   点对点-用
	public void registerStompEndpoints(StompEndpointRegistry registry) {
		registry.addEndpoint("/tiger-hello").withSockJS();
	}

	
	@Override
	public void configureMessageBroker(MessageBrokerRegistry registry) {
		//配置消息代理(message broker)
		 //点对点式增加一个/queue 消息代理
        registry.enableSimpleBroker("/queue","/topic");
        
	}

}
