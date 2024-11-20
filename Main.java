public class Main {
    public static void main(String[] args) {
        RepObjetos rep = new RepObjetos();

        MyObject obj1 = new MyObject("123");
        MyObject obj2 = new MyObject("456");
        rep.addObject(obj1);
        rep.addObject(obj2);

        iMyObject retrievedObj = rep.getObject("123");
        if (retrievedObj != null) {
            System.out.println("Objeto encontrado: " + retrievedObj.getKey());
        } else {
            System.out.println("Objeto não encontrado.");
        }

        System.out.println("Objetos no repositório:");
        for (iMyObject obj : rep.getObjetos()) {
            System.out.println(obj.getKey());
        }
    }
    }
}