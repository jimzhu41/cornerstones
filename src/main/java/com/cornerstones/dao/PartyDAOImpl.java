/**
 * 
 */
package com.cornerstones.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;



import com.cornerstones.models.Party;

/**
 * @author jimzhu
 *
 */

@Transactional
@Repository

public class PartyDAOImpl implements PartyDAO {

	/* (non-Javadoc)
	 * @see com.cornerstones.dao.partyDAO#getParty()
	 */

	@PersistenceContext
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Party> getParty() {
		// TODO Auto-generated method stub
	    String queryStr="FROM Party ORDER BY partyId";
	    
		return (List<Party>) entityManager.createQuery(queryStr).getResultList();
	}

	/* (non-Javadoc)
	 * @see com.cornerstones.dao.partyDAO#getPartyById(java.lang.String)
	 */
	@Override
	public Party getPartyById(String partyid) {
		return entityManager.find(Party.class,partyid);
		
	}

	/* (non-Javadoc)
	 * @see com.cornerstones.dao.partyDAO#addParty(com.cornerstones.models.Party)
	 */
	@Override
	public void addParty(Party party) {
		// TODO Auto-generated method stub
     entityManager.persist(party);
	}

	/* (non-Javadoc)
	 * @see com.cornerstones.dao.partyDAO#updateParty(com.cornerstones.models.Party)
	 */
	@Override
	public void updateParty(Party party) {
		// TODO Auto-generated method stub
      Party _party=getPartyById(party.getPartyId());
      _party.setCreatedByUserLogin(party.getCreatedByUserLogin());
      _party.setCreatedDate(party.getCreatedDate());
      _party.setPartyId(party.getPartyId());
      _party.setPartyTypeId(party.getPartyTypeId());
      _party.setExternalId(party.getExternalId());
      _party.setPreferredCurrencyUomId(party.getPreferredCurrencyUomId());
      _party.setDescription(party.getDescription());
      _party.setStatusId(party.getStatusId());
      _party.setLastUpdatedStamp(party.getLastUpdatedStamp());
      entityManager.flush();
      
	}

	/* (non-Javadoc)
	 * @see com.cornerstones.dao.partyDAO#deleteParty(java.lang.String)
	 */
	@Override
	public void deleteParty(String partyId) {
		// TODO Auto-generated method stub
         entityManager.remove(getPartyById(partyId));
	}

	/* (non-Javadoc)
	 * @see com.cornerstones.dao.partyDAO#partyExist(java.lang.String)
	 */
	@Override
	public boolean partyExist(String partyId) {
		// TODO Auto-generated method stub
		
		String queryStr = "FROM Party WHERE partyId=? ";
		int count =entityManager.createQuery(queryStr).setParameter(1, partyId).getResultList().size();
		return count >0 ? true:false;
	}

}
