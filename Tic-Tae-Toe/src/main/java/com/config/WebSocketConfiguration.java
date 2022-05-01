package com.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker //webSocket server를 사용한다는 설정
public class WebSocketConfiguration implements WebSocketMessageBrokerConfigurer {

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/gameplay").withSockJS();
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.setApplicationDestinationPrefixes("/app").enableSimpleBroker("/topic");

    }
}


/* <WebSocket>
서버와 클라이언트 사이에 양방향 통신 채널을 구축할 수 있는 통신 프로토콜이다.
동작 방식은 먼저 HTTP 통신을 연결하고 이후 Upgrade 헤더를 보내 양방향 연결로 업그레이드한다. Websocket은 최신 브라우저에서는 대부분 지원한다.

 */
