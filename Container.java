public abstract class Container extends RepObjetos implements Comparavel {
    private iMyObject objeto;

    @Override
    public int comparar(Object o) {
        iMyObject obj = (iMyObject) o;
        if (objeto.getKey().equals(obj.getKey())) {
            return 0;
        } else if (objeto.getKey().compareTo(obj.getKey()) < 0) {
            return -1;
        } else {
            return 1;
        }
    }
    public void printToConsole() {
        for (iMyObject obj : super.getObjetos()) {
            System.out.println(obj.toString());
        }
    }

}
