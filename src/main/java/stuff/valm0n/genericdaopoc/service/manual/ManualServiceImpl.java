/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stuff.valm0n.genericdaopoc.service.manual;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import stuff.valm0n.genericdaopoc.dao.GenericDAO;
import stuff.valm0n.genericdaopoc.dao.manual.ManualDAO;
import stuff.valm0n.genericdaopoc.entity.Manual;
import stuff.valm0n.genericdaopoc.entity.Rule;
import stuff.valm0n.genericdaopoc.service.GenericServiceImpl;

/**
 *
 * @author vsimon
 */
@Service
@Transactional
public class ManualServiceImpl extends GenericServiceImpl<Manual, Long>
        implements ManualService {

    private ManualDAO manualDao;

    public ManualServiceImpl() {
    }

    @Autowired
    public ManualServiceImpl(@Qualifier("manualDAOImpl") GenericDAO<Manual, Long> genericDao) {
        super(genericDao);
        this.manualDao = (ManualDAO) genericDao;
    }

    @Override
    public List<Rule> getRules(Long manualId) {
        return manualDao.getRules(manualId);
    }

}
