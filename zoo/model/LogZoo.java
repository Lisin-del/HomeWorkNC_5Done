package zoo.model;

import zoo.InhibitionLog;

import java.util.ArrayList;
import java.util.List;

public class LogZoo {
    private static List<InhibitionLog> logs = new ArrayList<>();

    public static void setLogs(InhibitionLog log) {
        logs.add(log);
    }

    public static List<InhibitionLog> getLogs() {
        return logs;
    }
}
