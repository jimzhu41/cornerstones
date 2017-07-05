/*
 * Author: Jim Zhu
 * 
 */
/*
 * Party DAO Interface
 */
package com.cornerstones.dao;

import java.util.List;
import com.cornerstones.models.Party;;


public interface PartyDAO {
 List<Party> getParty();
 Party getPartyById(String partyid);
 void addParty (Party party);
 void updateParty(Party party);
 void deleteParty(String partyId);
 boolean partyExist(String partyId);
}
