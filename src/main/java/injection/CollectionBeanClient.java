//package injection;
//
//
//import java.util.List;
//import java.util.Map;
//import org.springframework.context.support.AbstractApplicationContext;
//import org.springframework.context.support.GenericXmlApplicationContext;
//import injection.CollectionBean;
//
//public class CollectionBeanClient {
//	public static void main(String[] args) {
//		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
//		
//		CollectionBean bean = (CollectionBean) factory.getBean("CollectionBean");
//		Map<String,String> addressMap = bean.getAddressMap();
//		for (String address : addressMap) {
//			System.out.println(address.key());
//		}
//		
//		factory.close();
//	}
//}
