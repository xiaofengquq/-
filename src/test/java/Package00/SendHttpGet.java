package Package00;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.Header;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.ssl.SSLContexts;
import org.apache.http.util.EntityUtils;

import javax.net.ssl.SSLContext;
import java.util.Map;
import java.util.Objects;

public class SendHttpGet extends HttpRequest {
    public static final ObjectMapper MAPPER = new ObjectMapper();

    @Override
    public <T> T sendHttpRequest(HttpRequestData data) {
        HttpGet httpGet;

        URIBuilder builder = new URIBuilder();
        try {
            Map<String, String> params = data.getParams();
            params.entrySet().stream()
                    .forEach(a -> builder.addParameter(a.getKey(), a.getValue()));
            httpGet = new HttpGet(builder.build());

            Map<String, String> headers = data.getHeaders();
            Header[] header = headers.entrySet().stream()
                    .map(a -> new BasicHeader(a.getKey(), a.getValue()))
                    .toArray(Header[]::new);
            httpGet.setHeaders(header);
        } catch (Exception e) {
            e.printStackTrace();
            throw new IllegalArgumentException(e.getLocalizedMessage());
        }
        try {
            TrustStrategy acceptingTrustStrategy = (x509Certificates, authType) -> true;
            SSLContext sslContext = SSLContexts.custom().loadTrustMaterial(null, acceptingTrustStrategy).build();
            SSLConnectionSocketFactory connectionSocketFactory = new SSLConnectionSocketFactory(sslContext,
                    new NoopHostnameVerifier());
            HttpClientBuilder httpClientBuilder = HttpClients.custom();
            httpClientBuilder.setSSLSocketFactory(connectionSocketFactory);
            try (CloseableHttpClient httpClient = httpClientBuilder.build();
                 CloseableHttpResponse httpResponse = httpClient.execute(httpGet)) {
                if (httpResponse.getStatusLine().getStatusCode() < 200 || httpResponse.getStatusLine().getStatusCode() > 400) {
                    System.out.println("status: " + httpResponse.getStatusLine() + "\ndata:" + EntityUtils.toString(httpResponse.getEntity(), "UTF-8"));
                    return null;
                }
                if (Objects.isNull(data.getReturnFormat()) || String.class.isAssignableFrom(data.getReturnFormat())) {
                    return (T) EntityUtils.toString(httpResponse.getEntity(), "UTF-8");
                }

                return (T) MAPPER.readValue(EntityUtils.toString(httpResponse.getEntity(), "UTF-8"), data.getReturnFormat());
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException(e.getLocalizedMessage());
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new IllegalArgumentException(e.getLocalizedMessage());
        }

    }
}
