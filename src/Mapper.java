import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;

import consumer.ConnectionEngine;
import model.document.AbstractDocument;
import model.document.chubb.ChubbDocument;
import model.document.chubb.ExampleDocument;
import tools.JsonTool;

public class Mapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HelloWorld");

		String TEST_SITE = "http://localhost:9595/users";
		// String TEST_SITE = "http://localhost:8080/chubb/getExternalWSCM";
		// private static final String TEST_SITE =
		// "http://localhost:9595/users/1";
		// private static final String TEST_SITE =
		// "http://localhost:8080/chubb/getS6TransactionExternale";

		ConnectionEngine connectionEngine = new ConnectionEngine();
		connectionEngine.setTEST_SITE(TEST_SITE);
		connectionEngine.testGet();

//		 TEST_SITE = "http://localhost:9595/users/2";
//		connectionEngine.setTEST_SITE(TEST_SITE);
//		connectionEngine.testGet();
		
		connectionEngine.setTEST_SITE("http://localhost:8080/chubb/getExternalWSCM");
		connectionEngine.testGet();
//
//		connectionEngine.setTEST_SITE("http://localhost:8080/chubb/getPremiumResponse");
//		connectionEngine.testGet();
//
//		connectionEngine.setTEST_SITE("http://localhost:8080/chubb/getS6TransactionExternal");
//		connectionEngine.testGet();
//
//		connectionEngine.setTEST_SITE("http://localhost:8080/ejemplos/1");
//		connectionEngine.testGet();
		
		
		TEST_SITE = "http://localhost:9595/users";
		connectionEngine = new ConnectionEngine();
		connectionEngine.setTEST_SITE(TEST_SITE);
		connectionEngine.testPost("{\"name\":\"holi\",\"pass\":\"cc\",\"salary\":5000}");
		
		
		
		 TEST_SITE = "http://localhost:9595/users";
		 connectionEngine = new ConnectionEngine();
			connectionEngine.setTEST_SITE(TEST_SITE);
			connectionEngine.testGet();
		
		
		// AbstractDocument exampleDocument = new	
		// ExampleDocument(1,"fril","fofo",12000);
		// JsonNode node = JsonTool.fromDocumentToJsonNode(exampleDocument);
		// System.out.println(node);

	}

}
