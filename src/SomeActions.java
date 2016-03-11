
public class SomeActions {

    String data;

    /*public SomeActions() {
    }
*/
    public SomeActions(String data) {
        this.data = data;
        log("Hello world");
        log("Game starts...");
    }


    public String getDate() {
        return data;
    }


    public void log(String s) {
        System.out.println(s);
    }

}


