import java.util.Map;

public abstract class HttpRequest {
    public abstract <T> T sendHttpRequest(HttpRequestData requestData);
}
