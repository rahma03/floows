package mitrais.cdc.floows.service;

import mitrais.cdc.floows.exceptions.FileStorageException;
import mitrais.cdc.floows.exceptions.MyFileNotFoundException;
import mitrais.cdc.floows.model.FileInfo;
import mitrais.cdc.floows.properties.FileStorageProperties;
import mitrais.cdc.floows.repository.FileInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * @author Rahmawati Sitti Azizah
 * @version $Id: FileStorageServices.java, v 0.1 2021-07-21 9:45
 */
@Service
public class FileStorageServices {
    private final Path fileStorageLocation;
    @Autowired
    private FileInfoRepository fileInfoRepository;

    @Autowired
    public FileStorageServices(FileStorageProperties fileStorageProperties){
        this.fileStorageLocation = Paths.get(fileStorageProperties.getUploadDir())
                .toAbsolutePath().normalize();

        try {
            Files.createDirectories(this.fileStorageLocation);
        } catch (Exception ex) {
            throw new FileStorageException("Could not create the directory where the uploaded files will be stored.", ex);
        }
    }

    public String storeFile(MultipartFile file) {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());

        try {
            if(fileName.contains("..")) {
                throw new FileStorageException("Sorry! Filename contains invalid path sequence " + fileName);
            }

            FileInfo fileInfo = new FileInfo(fileName,fileStorageLocation.toFile().getPath());

            Path targetLocation = this.fileStorageLocation.resolve(fileName);
            Files.copy(file.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);
            fileInfoRepository.save(fileInfo);

            return fileName;
        } catch (IOException ex) {
            throw new FileStorageException("Could not store file " + fileName + ". Please try again!", ex);
        }
    }

    public Resource loadFileAsResource(String fileName) {
        try {
            Path filePath = this.fileStorageLocation.resolve(fileName).normalize();
            Resource resource = new UrlResource(filePath.toUri());
            if(resource.exists()) {
                return resource;
            } else {
                throw new MyFileNotFoundException("File not found " + fileName);
            }
        } catch (MalformedURLException ex) {
            throw new MyFileNotFoundException("File not found " + fileName, ex);
        }
    }

    public FileInfoRepository getFileInfoRepository() {
        return fileInfoRepository;
    }

    public void setFileInfoRepository(FileInfoRepository fileInfoRepository) {
        this.fileInfoRepository = fileInfoRepository;
    }
}
