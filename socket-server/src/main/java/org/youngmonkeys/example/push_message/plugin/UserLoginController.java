package org.youngmonkeys.example.push_message.plugin;

import com.tvd12.ezyfox.core.annotation.EzyEventHandler;
import com.tvd12.ezyfoxserver.constant.EzyEventNames;
import com.tvd12.ezyfoxserver.context.EzyPluginContext;
import com.tvd12.ezyfoxserver.controller.EzyAbstractPluginEventController;
import com.tvd12.ezyfoxserver.event.EzyUserLoginEvent;

@EzyEventHandler(EzyEventNames.USER_LOGIN)
public class UserLoginController extends EzyAbstractPluginEventController<EzyUserLoginEvent> {
    @Override
    public void handle(EzyPluginContext context, EzyUserLoginEvent event) {
        logger.info("user: {} logged in", event.getUsername());
    }
}
