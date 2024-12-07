package fileExample;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

class Employee{
	private String name;
	private int age;
	private String designation;
	
	public Employee() {}
	
	public Employee(String name, int age, String designation) {
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
		return "Employee [name=" + name + ", age=" + age + ", designation=" + designation + "]";
	}
	
	
	
}

public class XMLToClass {

	public static void main(String[] args) {
		
		
		try {
			File inputeFile=new File("C:/Users/wd976875/Downloads/FileExample/Employee.xml");
			DocumentBuilderFactory dbFactory=DocumentBuilderFactory.newInstance();
			DocumentBuilder dbBuilder=dbFactory.newDocumentBuilder();
			Document doc=dbBuilder.parse(inputeFile); 
			doc.getDocumentElement().normalize();
			
			//extract each employee and create an employee object
			NodeList nodeList = doc.getElementsByTagName("employee");
			for(int temp=0;temp<nodeList.getLength();temp++)
			{
				Node node=nodeList.item(temp);
				if(node.getNodeType()==Node.ELEMENT_NODE)
				{
					Element element=(Element) node;
					String name=element.getElementsByTagName("name").item(0).getTextContent();
					int age=Integer.parseInt(element.getElementsByTagName("age").item(0).getTextContent());
					String designation=element.getElementsByTagName("designation").item(0).getTextContent();
					Employee employee = new Employee(name, age, designation);
                    System.out.println("Employee Details:");
                    System.out.println("Name: " + employee.getName());
                    System.out.println("Age: " + employee.getAge());
                    System.out.println("Designation: " + employee.getDesignation());
                    System.out.println();
				}
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		


	}

}
