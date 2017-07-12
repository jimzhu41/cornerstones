package com.cornerstones.models.party;
// Generated Jul 1, 2017 4:29:21 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PartyNoteId generated by hbm2java
 */
@Embeddable
public class PartyNoteId implements java.io.Serializable {

	private String partyId;
	private String noteId;

	public PartyNoteId() {
	}

	public PartyNoteId(String partyId, String noteId) {
		this.partyId = partyId;
		this.noteId = noteId;
	}

	@Column(name = "PARTY_ID", nullable = false, length = 20)
	public String getPartyId() {
		return this.partyId;
	}

	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}

	@Column(name = "NOTE_ID", nullable = false, length = 20)
	public String getNoteId() {
		return this.noteId;
	}

	public void setNoteId(String noteId) {
		this.noteId = noteId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PartyNoteId))
			return false;
		PartyNoteId castOther = (PartyNoteId) other;

		return ((this.getPartyId() == castOther.getPartyId()) || (this.getPartyId() != null
				&& castOther.getPartyId() != null && this.getPartyId().equals(castOther.getPartyId())))
				&& ((this.getNoteId() == castOther.getNoteId()) || (this.getNoteId() != null
						&& castOther.getNoteId() != null && this.getNoteId().equals(castOther.getNoteId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getPartyId() == null ? 0 : this.getPartyId().hashCode());
		result = 37 * result + (getNoteId() == null ? 0 : this.getNoteId().hashCode());
		return result;
	}

}