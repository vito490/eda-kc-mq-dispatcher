package ibm.gse.voyagems.domain.model.voyage;

import ibm.gse.voyagems.domain.model.EventBase;

public class VoyageNotFoundEvent extends EventBase {

  
	VoyageNotFoundPayload payload;
	
    public VoyageNotFoundEvent(long timestampMillis, String version, VoyageNotFoundPayload payload) {
    	this.timestampMillis = timestampMillis;
    	this.version = version;
    	this.type = EventBase.TYPE_VOYAGE_NOT_FOUND;
    	this.payload = payload;
    }

    public VoyageNotFoundEvent() {
    }

	public VoyageNotFoundPayload getPayload() {
		return payload;
	}

    

}
