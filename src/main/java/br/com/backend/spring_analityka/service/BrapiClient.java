package br.com.backend.spring_analityka.service;

import com.google.gson.Gson;

import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;

public class BrapiClient {
    private static final String BASE_URL = "https://brapi.dev/api";
    private final HttpClient httpClient;
    private final String token;
    private final Gson gson;
    public BrapiClient(String token) {
        this.token = token;
        this.httpClient = HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(10))
                .build();
        this.gson = new Gson();
    }
    public QuoteResponse getQuote(String ticker) throws Exception {
        String url = String.format("%s/quote/%s", BASE_URL, ticker);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Authorization", "Bearer " + token)
                .header("User-Agent", "Java BrapiClient/1.0")
                .GET()
                .build();
        HttpResponse<String> response = httpClient.send(request,
                HttpResponse.BodyHandlers.ofString());
        if (response.statusCode() != 200) {
            throw new Exception("HTTP " + response.statusCode());
        }
        return gson.fromJson(response.body(), QuoteResponse.class);
    }
    public static class QuoteResponse {
        public Quote[] results;

        public static class Quote {
            public String symbol;
            public String shortName;
            public double regularMarketPrice;
            public double regularMarketDayHigh;
            public double regularMarketDayLow;
            public double regularMarketChange;
            public double regularMarketChangePercent;
            public String currency;
        }
    }
}
