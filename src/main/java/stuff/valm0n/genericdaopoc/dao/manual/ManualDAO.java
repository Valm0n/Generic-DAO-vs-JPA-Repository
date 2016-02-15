/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stuff.valm0n.genericdaopoc.dao.manual;

import java.util.List;
import stuff.valm0n.genericdaopoc.dao.GenericDAO;
import stuff.valm0n.genericdaopoc.entity.Manual;
import stuff.valm0n.genericdaopoc.entity.Rule;

/**
 *
 * @author vsimon
 */
public interface ManualDAO extends GenericDAO<Manual, Long> {

    public List<Rule> getRules(Long manualId);

}
