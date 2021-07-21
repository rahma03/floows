package mitrais.cdc.floows.exceptions;

/**
 * @author Rahmawati Sitti Azizah
 * @version $Id: FileStorageException.java, v 0.1 2021-07-21 9:52
 */
public class FileStorageException extends RuntimeException {
    public FileStorageException(String message) {
        super(message);
    }

    public FileStorageException(String message, Throwable cause) {
        super(message, cause);
    }
}
