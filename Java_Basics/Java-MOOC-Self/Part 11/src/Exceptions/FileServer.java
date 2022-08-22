/**
 *
 * Here, the interface involved files which could throw exceptions
 * Since we expect the methods to handle exceptions, we put it in the declarations
 * See TextServer.java
 *
 */

package Exceptions;

public interface FileServer {
    String load(String fileName) throws Exception;
    void save(String fileName, String textToSave) throws Exception;
}
