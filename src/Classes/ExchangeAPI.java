package Classes;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExchangeAPI {
    public Endereco buscaAPI(String base_code, String target_code) {
        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/86f5cd99845095352b06c280/pair/"+ base_code + "/" + target_code);
        HttpRequest request = HttpRequest.newBuilder().uri(endereco).build();

        try{
            HttpResponse<String> response = java.net.http.HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Endereco.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

