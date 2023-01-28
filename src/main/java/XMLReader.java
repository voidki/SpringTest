import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLReader {
    public static void main(String[] args) throws Exception{
            File f = new File("src/main/resources/applicationContext.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();//步骤1
            DocumentBuilder builder = factory.newDocumentBuilder();//步骤2
            Document doc = builder.parse(f);//步骤3
            Element root = doc.getDocumentElement();
        System.out.println(root);
        NodeList childNodes = root.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item instanceof Element) {
                Element ele = (Element) item;
                System.out.println(ele.getAttribute("name"));
            }
        }


//            NodeList nl = doc.getElementsByTagName("action");
//            for (int i = 0; i < nl.getLength(); i++) {
//                System.out.println("result:"+ doc.getElementsByTagName("result")
//                        .item(i).getFirstChild().getNodeValue());
//            }
//        } catch (Exception e) {
//
//            e.printStackTrace();
//        }
    }
}