package com.kh.app16.websocket;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

//설정파일로 만들겠다
@Configuration
@EnableWebSocket
@RequiredArgsConstructor
public class SocketConfig implements WebSocketConfigurer {

private final WebSocketHandler webSocketHandler;
    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry
                //hTTP요청이 들어오면 컨트롤러에 있는 동작이 실행됬지만
                .addHandler(webSocketHandler , "/chat")
                //내가 허용하는 아이피 주소 크로스오리진과 비슷함
                .setAllowedOrigins("*")
                .addInterceptors(new KhHandshaker())
                ;
    }
}
