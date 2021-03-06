import jodd.json.JsonSerializer;
import spark.*;
import spark.template.mustache.MustacheTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;

 /**
 * GET route with record identifier:
      Spark.get("/json/:id", (request, response) -> {
      String recordId = request.params(":id")

   POST route instead of FORM fields (request.queryParams)
      use: ??

 */
public class Main {
    static ArrayList<Object> objects = new ArrayList<>();


     private static void enableCORS(final String origin, final String methods, final String headers) {
         Spark.before((request, response) -> {
             response.header("Access-Control-Allow-Origin", origin);
             response.header("Access-Control-Request-Method", methods);
             response.header("Access-Control-Allow-Headers", headers);
         });
     }
    public static void main(String[] args) {
        enableCORS("*", "*", "*");
        Spark.init();

        Spark.get(
                "/",
                ((request, response) -> {
                    HashMap m = new HashMap();
                    return new ModelAndView(m, "home.html");
                }),
                new MustacheTemplateEngine()
        );

        Spark.get(
                "/json1",
                ((request, response) -> {
                    User user = new User("John", 55, true);
                    response.status(231);
                    response.type("application/json");
                    JsonSerializer serializer= new JsonSerializer();
                    return serializer.serialize(user);
                })
        );

        Spark.get(
                "/json2",
                ((request, response) -> {
                    Animal animal = new Animal("Birds", "Robin", true, "Tweet tweet!");
                    Vehicle vehicle = new Vehicle("Yamaha", "V Star 1300", "gas", "black/red");
                    objects.add(animal);
                    objects.add(vehicle);

                    response.status(200);
                    response.type("application/json");

                    return new JsonSerializer().serialize(objects);
                })
        );
    }
}
