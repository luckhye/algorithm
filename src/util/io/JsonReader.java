package util.io;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReader {
    public JsonReader() {
    }

    public static void main(String[] args) throws IOException, ParseException {
        String path = "/Users/jane.kwon/Desktop/blockList.json";
        FileReader fileReader = new FileReader(path);
        JSONParser parser = new JSONParser();
        JSONArray array = (JSONArray) parser.parse(fileReader);
        System.out.println("시나리오, obj = ");

        int i;
        JSONObject obj;
        for (i = 0; i < array.size(); ++i) {
            obj = (JSONObject) array.get(i);
            System.out.println(obj.get("name") + "," + obj.get("id"));
        }

        System.out.println("블록, items =  ");

        for (i = 0; i < array.size(); ++i) {
            obj = (JSONObject) array.get(i);
            JSONArray items = (JSONArray) obj.get("items");

            for (int j = 0; j < items.size(); ++j) {
                JSONObject obj2 = (JSONObject) items.get(j);
                System.out.println(obj2.get("name") + "," + obj2.get("id"));
            }
        }

    }
}

