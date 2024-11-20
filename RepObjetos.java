import java.util.ArrayList;
import java.util.List;


public class RepObjetos {
    private List<iMyObject> objetos = new ArrayList<iMyObject>();

    public void addObject(iMyObject obj) {
        this.objetos.add(obj);
    }

    public List<iMyObject> getObjetos() {
        return this.objetos;
    }

    public iMyObject getObject(String key) {
        for (int i = 0; i < objetos.size(); i++) {
            if (objetos.get(i).getKey().equals(key)) {
                return objetos.get(i);
            }
        }
        return null;
    }

}
