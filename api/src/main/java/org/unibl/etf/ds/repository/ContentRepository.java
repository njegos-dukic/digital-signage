package org.unibl.etf.ds.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.unibl.etf.ds.model.entity.ContentEntity;

import java.util.List;

@Repository
public interface ContentRepository extends JpaRepository<ContentEntity, Integer> {

    List<ContentEntity> getAllByDeleted(Boolean deleted);
    List<ContentEntity> getAllByBillboardIdAndDeletedAndApproved(Integer id, Boolean deleted, Boolean approved);
    List<ContentEntity> getAllByUserIdAndDeleted(Integer id, Boolean deleted);
}
