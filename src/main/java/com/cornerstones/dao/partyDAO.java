/*
 * Author: Jim Zhu
 * 
 */
/*
 * Party DAO Interface
 */
package com.cornerstones.dao;

import java.util.List;
import com.cornerstones.party.models.*;


public interface partyDAO {
 List<Party> getParty();
 Party getPartyById(String partyid);
 void addParty (Party party);
 void updateParty(Party party);
 void deleteParty(String partyId);
 boolean partyExist(String partyId);
}
