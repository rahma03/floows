package mitrais.cdc.floows.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author Rahmawati Sitti Azizah
 * @version $Id: FileInfo.java, v 0.1 2021-07-29 11:22
 */
@Entity
@Table(name = "FILEINFO")
public class FileInfo {

    public FileInfo(String fileName, String filePath){
        this.fileName = fileName;
        this.filePath = filePath;
        this.createdDate = new Date();
    }
    @Id
    @GeneratedValue
    private long id;
    private String fileName;
    private String filePath;
    private Date createdDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
