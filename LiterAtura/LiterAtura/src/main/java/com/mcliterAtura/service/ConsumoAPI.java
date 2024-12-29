package com.mcliterAtura.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoAPI {
    public String obtenerDatos(String url) { // esto es un metodo q permite hacer el consumo de dato, el cual lo usamos en la clase ScreenmatchApp
        HttpClient client = HttpClient.newHttpClient(); // con esta clase es para hacer la coneccion cliente y la api
        HttpRequest request = HttpRequest.newBuilder() // con esta clase es para hacer el requerimiento para obtener los datos q queremos de la api
                .uri(URI.create(url)) // acà va la conexion con la web de la api donde hacemos la requesicion de los datos
                .build(); // tambien se aplica el metodo builder q permite definir varias caracteritica de nuestro objeto
        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        String json = response.body(); // aca tenemos la variable para recibir los datos mediante el archivo json
        return json;
    }
}
