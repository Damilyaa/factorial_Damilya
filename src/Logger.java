import java.util.HashMap;
import java.util.Map;

public class Logger {
    private Map<String, Integer> map;
    private int size;

    public Logger() {
        map = new HashMap<>();
        size = 0;
    }

    public boolean shouldPrintMessage(int timestamp, String message) {
        if (size >= 100) {
            map.clear();
            size = 0;
        }

        if (map.containsKey(message) && timestamp - map.get(message) < 10) {
            return false;
        }

        map.put(message, timestamp);
        size++;
        return true;
    }

    public boolean clean(int timestamp) {
        if (size == 0) {
            return true;
        }

        Map<String, Integer> newMap = new HashMap<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (timestamp - entry.getValue() < 10) {
                newMap.put(entry.getKey(), entry.getValue());
            } else {
                size--;
            }
        }
        map = newMap;
        return size == 0;
    }

    public int loggerSize() {
        return size;
    }
}