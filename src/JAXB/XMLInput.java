//package JAXB;
//
//import javax.xml.bind.JAXBContext;
//import javax.xml.bind.JAXBException;
//import javax.xml.bind.Marshaller;
//
//
//import java.io.File;
//
//public class XMLInput {
//    public static void main(String[] args) throws JAXBException {
//        Customer customer = new Customer();
//        customer.setAge(18);
//        customer.setId(1);
//        customer.setName("HomeMax");
//
//        JAXBContext context = JAXBContext.newInstance(Customer.class);
//        Marshaller marshaller = context.createMarshaller();
//        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//
//        marshaller.marshal(customer, new File("myxml.xml"));
//        marshaller.marshal(customer, System.out);
//
//    }
//}
