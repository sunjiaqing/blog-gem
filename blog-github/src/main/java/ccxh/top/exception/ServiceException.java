package ccxh.top.exception;

/**
 * 自定义异常
 * @author admin
 */
public class ServiceException extends NullPointerException {
    public  ServiceException(String message){
        super(message);
    }
}
