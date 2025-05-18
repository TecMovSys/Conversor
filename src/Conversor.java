import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor {

    private static final String API_KEY = "bfbb8416c5707b7dc42f64f1"; // Reemplaza con tu clave real si es necesario

    public static double convertir(double cantidad, String monedaOrigen, String monedaDestino)
            throws IOException, InterruptedException {

        String url = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/" + monedaOrigen + "/" + monedaDestino;

        HttpClient cliente = HttpClient.newHttpClient();
        HttpRequest solicitud = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> respuesta = cliente.send(solicitud, HttpResponse.BodyHandlers.ofString());

        if (respuesta.statusCode() != 200) {
            throw new IOException("Error en la solicitud HTTP: Código " + respuesta.statusCode());
        }

        JsonObject json = JsonParser.parseString(respuesta.body()).getAsJsonObject();

        if (!json.has("result") || !json.get("result").getAsString().equals("success")) {
            throw new IOException("Respuesta de API no exitosa: " + json);
        }

        if (!json.has("conversion_rate")) {
            throw new IOException("Tasa de conversión no disponible.");
        }

        double tasa = json.get("conversion_rate").getAsDouble();
        return cantidad * tasa;
    }
}
