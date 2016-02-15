/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stuff.valm0n.genericdaopoc.dao.manual;

import java.util.List;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import stuff.valm0n.genericdaopoc.dao.GenericDAOImpl;
import stuff.valm0n.genericdaopoc.entity.Manual;
import stuff.valm0n.genericdaopoc.entity.Rule;

/**
 *
 * @author vsimon
 */
@Transactional
@Repository("manualDAOImpl")
public class ManualDAOImpl extends GenericDAOImpl<Manual, Long> implements ManualDAO {

    @Override
    public List<Rule> getRules(Long manualId) {
        Query q = currentSession().createQuery("from Manual u where id=:id");
        q.setParameter("id", manualId);
        Manual man = (Manual) q.uniqueResult();
        return man.getRules();
    }
}
