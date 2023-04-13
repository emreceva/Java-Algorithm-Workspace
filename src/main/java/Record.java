import java.util.Map;

public class Record {

    public record EmpRecord (int id, String name, long salary, Map<String, String> adresses){

    }
}
