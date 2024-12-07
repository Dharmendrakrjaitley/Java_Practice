package fileExample;

import javax.xml.crypto.dsig.Transform;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

class Student{
	private String name;
	private int age;
	private String designation;
	
	public Student() {}
	
	public Student(String name, int age, String designation) {
		super();
		this.name = name;
		this.age = age;
		this.designation = designation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", designation=" + designation + "]";
	}
	
	public Element toXmlElement(Document doc)
	{
		Element studentElement=doc.createElement("student");
		
		Element nameElement=doc.createElement("name");
		nameElement.appendChild(doc.createTextNode(this.name));
		studentElement.appendChild(nameElement);
		
		Element ageElement=doc.createElement("age");
		ageElement.appendChild(doc.createTextNode(String.valueOf(this.age)));
		studentElement.appendChild(ageElement);
		
		Element designationElement=doc.createElement("designatio");
		designationElement.appendChild(doc.createTextNode(this.designation));
		studentElement.appendChild(designationElement);
		
		return studentElement;
		
	}
	
}


public class SaveToXmlFile {

	public static void main(String[] args) {
		try {
			
			DocumentBuilderFactory dbFactory=DocumentBuilderFactory.newInstance();
			DocumentBuilder dbBuilder=dbFactory.newDocumentBuilder();
			Document doc=dbBuilder.newDocument();
			
			Element rootElement=doc.createElement("students");
			doc.appendChild(rootElement);
			
			//creating Student objects;
			Student student1=new Student("Rahul",25,"Smart boy");
			Student student2=new Student("Sunny",30,"Dull boy");
			
			// adding student object to the root element
			rootElement.appendChild(student1.toXmlElement(doc));
			rootElement.appendChild(student2.toXmlElement(doc));
			
			
			student1.toXmlElement(doc);
			student2.toXmlElement(doc);
			
			//writing xml to a file
			TransformerFactory tfFactory=TransformerFactory.newInstance();
			Transformer transformer=tfFactory.newTransformer();
			DOMSource source=new DOMSource(doc);
			StreamResult result=new StreamResult("C:/Users/wd976875/Downloads/FileExample/Students.xml");
			transformer.transform(source, result);
			
			System.out.println("Data Saved Successfully");
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
