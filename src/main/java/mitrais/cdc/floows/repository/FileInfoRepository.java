package mitrais.cdc.floows.repository;

import mitrais.cdc.floows.model.FileInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Rahmawati Sitti Azizah
 * @version $Id: FileInfoRepository.java, v 0.1 2021-07-16 13:20
 */
@Repository
public interface FileInfoRepository extends CrudRepository<FileInfo, Long> {
    public FileInfo save(FileInfo fileInfo);
}
