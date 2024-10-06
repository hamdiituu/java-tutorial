import java.io.BufferedWriter;
import java.io.FileWriter;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Paths;
//IO-GET
public class Main {

    public static void main(String[] args) {
        String url = "https://jsonplaceholder.typicode.com/todos";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            long timestamp = System.currentTimeMillis();
            String outputPath = "out/todos_" + timestamp + ".json";
            Files.createDirectories(Paths.get("out"));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath));
            writer.write(response.body());
            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
