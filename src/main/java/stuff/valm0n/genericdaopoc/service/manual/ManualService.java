/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stuff.valm0n.genericdaopoc.service.manual;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import stuff.valm0n.genericdaopoc.entity.Manual;
import stuff.valm0n.genericdaopoc.entity.Rule;
import stuff.valm0n.genericdaopoc.service.GenericService;

/**
 *
 * @author vsimon
 */
@Transactional
public interface ManualService extends GenericService<Manual, Long> {

    public List<Rule> getRules(Long manualId);
}
