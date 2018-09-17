package com.cango.zdzboot.dao;


import com.cango.zdzboot.entity.MSequence;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import java.util.List;

/**
 * 	m_sequence表
 * 
 * @author syh
 */
@Repository
public interface MSequenceDao{
	/**
	 * 生成保单编号
	 * @param
	 * @return
	 */
	List<MSequence> createInsureNo();


}
