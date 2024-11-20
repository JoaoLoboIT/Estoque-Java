public class MyObject implements iMyObject{
    private String key;
    public MyObject(String key){
        this.key = key;
    }
    @Override
    public String getKey() {
        return this.key;
    }
}
