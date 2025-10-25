
public class projectException extends RuntimeException {

    public projectException() {
        String msj = "Proyect in progress already exist";
        
        System.out.println(msj);
    }

    public projectException(String msg) {
        super(msg);
    }
}
