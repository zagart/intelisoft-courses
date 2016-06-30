/**
 * Created by intelisoft on 13.06.2016.
 */
public class MyClosable implements AutoCloseable {

    public MyClosable() {
        System.out.println("Created.");
    }

    public void exception() throws Exception {
        throw new Exception();
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closed.");
    }

}
