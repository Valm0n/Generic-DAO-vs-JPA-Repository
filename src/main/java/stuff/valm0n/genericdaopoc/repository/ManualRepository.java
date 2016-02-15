/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stuff.valm0n.genericdaopoc.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import stuff.valm0n.genericdaopoc.entity.Manual;
import stuff.valm0n.genericdaopoc.entity.Rule;

/**
 *
 * @author vsimon
 */
@Repository
@Transactional
public interface ManualRepository extends JpaRepository<Manual, Long> {
    
    @Query("SELECT m.rules FROM Manual m WHERE m.id = :id")
    public List<Rule> getRules(@Param("id") Long id);
}
