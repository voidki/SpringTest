import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

/**
 * @projectName: SpringTest
 * @package: PACKAGE_NAME
 * @className: Test
 * @author: voidki
 * @description:
 * @date: 2022/12/24 16:04
 */
public class Test {
    public static void main(String[] args) throws Exception{
        //得到DOM解析器的工厂实例
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        //从DOM工厂中获得DOM解析器
        DocumentBuilder dbBuilder = dbFactory.newDocumentBuilder();
        //把要解析的xml文档读入DOM解析器
        Document doc = dbBuilder.parse("src/main/resources/applicationContext.xml");
        Element documentElement = doc.getDocumentElement();
        System.out.println(documentElement);
        System.out.println(documentElement.getNamespaceURI());
    }
    public static void queryXml() {
        try {
            //得到DOM解析器的工厂实例
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            //从DOM工厂中获得DOM解析器
            DocumentBuilder dbBuilder = dbFactory.newDocumentBuilder();
            //把要解析的xml文档读入DOM解析器
            Document doc = dbBuilder.parse("src/xidian/sl/dom/applicationContext.xml");
            System.out.println("处理该文档的DomImplementation对象  = " + doc.getImplementation());
            //得到文档名称为Student的元素的节点列表
            NodeList nList = doc.getElementsByTagName("Student");
            //遍历该集合，显示结合中的元素及其子元素的名字
            for (int i = 0; i < nList.getLength(); i++) {
                Element node = (Element) nList.item(i);
                System.out.println("Name: " + node.getElementsByTagName("Name").item(0).getFirstChild().getNodeValue());
                System.out.println("Num: " + node.getElementsByTagName("Num").item(0).getFirstChild().getNodeValue());
                System.out.println("Classes: " + node.getElementsByTagName("Classes").item(0).getFirstChild().getNodeValue());
                System.out.println("Address: " + node.getElementsByTagName("Address").item(0).getFirstChild().getNodeValue());
                System.out.println("Tel: " + node.getElementsByTagName("Tel").item(0).getFirstChild().getNodeValue());
            }

        } catch(Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
