import java.util.*;

public class Mapper {

    public static Mapper mapper = new Mapper();

    private final String SEPERATION_CHARACTER = "/";
    private final String KEY_SEPERATION_CHARACTER = ",";

    public Map<String,List<String>> toMap(List<String> lines){
        Map<String,List<String>> map = new HashMap<>();
        for (String line : lines){
            String [] splittedLine = line.split(SEPERATION_CHARACTER);
            String key = splittedLine[0];
            String value = splittedLine[1];
            if(key.contains(KEY_SEPERATION_CHARACTER)){
                String[] splittedKey = Arrays.stream(key.split(KEY_SEPERATION_CHARACTER)).map(String::trim).toArray(String[]::new);
                for(String s : splittedKey){
                    if(map.containsKey(s)){
                        map.get(s).add(value);
                    }
                    else {
                        var l = new ArrayList<String>();
                        l.add(value);
                        map.put(s,l);
                    }
                }
            }
            else{
                if(map.containsKey(key)){
                    map.get(key).add(value);
                }
                else {
                    var l = new ArrayList<String>();
                    l.add(value);
                    map.put(key,l);
                }
            }
        }
        return map;
    }

}
