package dev.zwazel.onlineWebsocketChat;

import org.springframework.security.config.annotation.web.socket.AbstractSecurityWebSocketMessageBrokerConfigurer;

public class WebsocketSecurityConfig extends AbstractSecurityWebSocketMessageBrokerConfigurer {
    @Override
    protected boolean sameOriginDisabled() {
        return true;
    }
}
