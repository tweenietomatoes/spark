package spark.embeddedserver.jetty.websocket;

import org.eclipse.jetty.websocket.api.WebSocketListener;
import org.eclipse.jetty.websocket.api.annotations.WebSocket;

/**
 * A wrapper for web socket handler classes/instances.
 */
public interface WebSocketHandlerWrapper {

    static void validateHandlerClass(Class<?> handlerClass) {
        boolean valid = WebSocketListener.class.isAssignableFrom(handlerClass)
                || handlerClass.isAnnotationPresent(WebSocket.class);
        if (!valid) {
            throw new IllegalArgumentException(
                    "WebSocket handler must implement 'WebSocketListener' or be annotated as '@WebSocket'");
        }
    }

    /**
     * Gets the actual handler - if necessary, instantiating an object.
     *
     * @return The handler instance.
     */
    Object getHandler();

}
