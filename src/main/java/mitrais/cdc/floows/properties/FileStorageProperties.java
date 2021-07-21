package mitrais.cdc.floows.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Rahmawati Sitti Azizah
 * @version $Id: FileStorageProperties.java, v 0.1 2021-07-21 9:36
 */
@ConfigurationProperties(prefix = "file")
public class FileStorageProperties {

    private String uploadDir;

    public String getUploadDir() {
        return uploadDir;
    }

    public void setUploadDir(String uploadDir) {
        this.uploadDir = uploadDir;
    }
}
