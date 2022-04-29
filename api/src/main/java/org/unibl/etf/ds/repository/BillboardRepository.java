package org.unibl.etf.ds.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.unibl.etf.ds.model.entity.BillboardEntity;

@Repository
public interface BillboardRepository extends JpaRepository<BillboardEntity, Integer> {

}