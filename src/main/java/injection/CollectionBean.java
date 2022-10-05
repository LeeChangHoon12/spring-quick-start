package injection;

import java.util.List;
import java.util.Map;

public class CollectionBean {
	
	
	private List<String> addressList;
	private Map<String,String> addressMap;
	
	public void setAddressList(List<String> addressList) {
		this.addressList = addressList;
	}
	
	public void setAddressMap(Map<String,String> addressMap) {
		this.addressMap = addressMap;
	}
	
	
	public Map<String,String> getAddressMap(){
		return addressMap;
	}
	
	public List<String> getAddressList(){
		return addressList;
	}
	
	
	
}
