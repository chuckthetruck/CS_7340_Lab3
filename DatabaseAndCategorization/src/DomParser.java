import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DomParser {

  //Create unique identifiers for both the documents and the authors
  public List<PaperAbstract> getPaperAbstracts() {
    try {
      // Get the DOM Builder Factory
      DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
      // Get the DOM Builder
      DocumentBuilder builder = factory.newDocumentBuilder();
      // Load and Parse the XML document
      // document contains the complete XML as a Tree
      Document document = builder.parse(ClassLoader.getSystemResourceAsStream("dblp_abstract_dataset.xml"));
      // Iterating through the nodes and extracting the data
      List<PaperAbstract> paList = new ArrayList<PaperAbstract>();

      NodeList nodeList = document.getDocumentElement().getElementsByTagName("inproceedings");
      for (int i = 0; i < nodeList.getLength(); i++) {
        Node node = nodeList.item(i);
        if (node instanceof Element) {
          // We have encountered an <employee> tag
          PaperAbstract pa = new PaperAbstract();
          NodeList childNodes = node.getChildNodes();
          for (int j = 0; j < childNodes.getLength(); j++) {
            Node cNode = childNodes.item(j);
            // Identifying the child tag of each Inproceedings
            if (cNode instanceof Element) {
              String content = cNode.getLastChild().getTextContent().trim().replace("'", "");
              switch (cNode.getNodeName()) {
                case "title":
                  pa.title = content;
                  break;
                case "ee":
                  pa.ee = content;
                  break;
                case "abstract":
                  pa.abs = content;
                  break;

              }
            }
          }
          paList.add(pa);
        }
      }

      nodeList = document.getDocumentElement().getElementsByTagName("article");
      for (int i = 0; i < nodeList.getLength(); i++) {
        Node node = nodeList.item(i);
        if (node instanceof Element) {
          // We have encountered an <employee> tag
          PaperAbstract pa = new PaperAbstract();
          NodeList childNodes = node.getChildNodes();
          for (int j = 0; j < childNodes.getLength(); j++) {
            Node cNode = childNodes.item(j);
            // Identifying the child tag of each Inproceedings
            if (cNode instanceof Element) {
              String content = cNode.getLastChild().getTextContent().trim().replace("'", "");
              switch (cNode.getNodeName()) {
                case "title":
                  pa.title = content;
                  break;
                case "ee":
                  pa.ee = content;
                  break;
                case "abstract":
                  pa.abs = content;
                  break;

              }
            }
          }
          paList.add(pa);
        }
      }


      return paList;
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }


}
