package Package00.HttpRequest;

import java.util.Map;

public class HttpRequestData<T> {
    private Map<String, String> params;
    private Map<String, String> headers;
    private String url;
    private String cookie;
    private RequestMethod requestMethod;
    private Class<T> ReturnFormat;

    public HttpRequestData() {
    }

    public HttpRequestData(Map<String, String> params, Map<String, String> headers, String url, String cookie, RequestMethod requestMethod, Class<T> returnFormat) {
        this.params = params;
        this.headers = headers;
        this.url = url;
        this.cookie = cookie;
        this.requestMethod = requestMethod;
        ReturnFormat = returnFormat;
    }

    public Map<String, String> getParams() {
        return params;
    }

    public Class<T> getReturnFormat() {
        return ReturnFormat;
    }

    public void setReturnFormat(Class<T> returnFormat) {
        ReturnFormat = returnFormat;
    }

    public void setParams(Map<String, String> params) {
        this.params = params;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCookie() {
        return cookie;
    }

    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    public RequestMethod getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(RequestMethod requestMethod) {
        this.requestMethod = requestMethod;
    }
}
