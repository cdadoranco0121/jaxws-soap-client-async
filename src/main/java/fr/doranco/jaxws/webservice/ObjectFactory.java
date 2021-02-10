
package fr.doranco.jaxws.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.doranco.jaxws.webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddEtudiantResponse_QNAME = new QName("http://jaxws.doranco.fr/", "addEtudiantResponse");
    private final static QName _GetEtudiants_QNAME = new QName("http://jaxws.doranco.fr/", "getEtudiants");
    private final static QName _RemoveEtudiant_QNAME = new QName("http://jaxws.doranco.fr/", "removeEtudiant");
    private final static QName _UpdateEtudiantResponse_QNAME = new QName("http://jaxws.doranco.fr/", "updateEtudiantResponse");
    private final static QName _Exception_QNAME = new QName("http://jaxws.doranco.fr/", "Exception");
    private final static QName _AddEtudiant_QNAME = new QName("http://jaxws.doranco.fr/", "addEtudiant");
    private final static QName _GetEtudiantByIdResponse_QNAME = new QName("http://jaxws.doranco.fr/", "getEtudiantByIdResponse");
    private final static QName _RemoveEtudiantResponse_QNAME = new QName("http://jaxws.doranco.fr/", "removeEtudiantResponse");
    private final static QName _GetEtudiantById_QNAME = new QName("http://jaxws.doranco.fr/", "getEtudiantById");
    private final static QName _GetEtudiantsResponse_QNAME = new QName("http://jaxws.doranco.fr/", "getEtudiantsResponse");
    private final static QName _UpdateEtudiant_QNAME = new QName("http://jaxws.doranco.fr/", "updateEtudiant");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.doranco.jaxws.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RemoveEtudiantResponse }
     * 
     */
    public RemoveEtudiantResponse createRemoveEtudiantResponse() {
        return new RemoveEtudiantResponse();
    }

    /**
     * Create an instance of {@link GetEtudiantById }
     * 
     */
    public GetEtudiantById createGetEtudiantById() {
        return new GetEtudiantById();
    }

    /**
     * Create an instance of {@link GetEtudiantByIdResponse }
     * 
     */
    public GetEtudiantByIdResponse createGetEtudiantByIdResponse() {
        return new GetEtudiantByIdResponse();
    }

    /**
     * Create an instance of {@link UpdateEtudiant }
     * 
     */
    public UpdateEtudiant createUpdateEtudiant() {
        return new UpdateEtudiant();
    }

    /**
     * Create an instance of {@link GetEtudiantsResponse }
     * 
     */
    public GetEtudiantsResponse createGetEtudiantsResponse() {
        return new GetEtudiantsResponse();
    }

    /**
     * Create an instance of {@link GetEtudiants }
     * 
     */
    public GetEtudiants createGetEtudiants() {
        return new GetEtudiants();
    }

    /**
     * Create an instance of {@link RemoveEtudiant }
     * 
     */
    public RemoveEtudiant createRemoveEtudiant() {
        return new RemoveEtudiant();
    }

    /**
     * Create an instance of {@link UpdateEtudiantResponse }
     * 
     */
    public UpdateEtudiantResponse createUpdateEtudiantResponse() {
        return new UpdateEtudiantResponse();
    }

    /**
     * Create an instance of {@link AddEtudiantResponse }
     * 
     */
    public AddEtudiantResponse createAddEtudiantResponse() {
        return new AddEtudiantResponse();
    }

    /**
     * Create an instance of {@link AddEtudiant }
     * 
     */
    public AddEtudiant createAddEtudiant() {
        return new AddEtudiant();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link Etudiant }
     * 
     */
    public Etudiant createEtudiant() {
        return new Etudiant();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddEtudiantResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.doranco.fr/", name = "addEtudiantResponse")
    public JAXBElement<AddEtudiantResponse> createAddEtudiantResponse(AddEtudiantResponse value) {
        return new JAXBElement<AddEtudiantResponse>(_AddEtudiantResponse_QNAME, AddEtudiantResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEtudiants }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.doranco.fr/", name = "getEtudiants")
    public JAXBElement<GetEtudiants> createGetEtudiants(GetEtudiants value) {
        return new JAXBElement<GetEtudiants>(_GetEtudiants_QNAME, GetEtudiants.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveEtudiant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.doranco.fr/", name = "removeEtudiant")
    public JAXBElement<RemoveEtudiant> createRemoveEtudiant(RemoveEtudiant value) {
        return new JAXBElement<RemoveEtudiant>(_RemoveEtudiant_QNAME, RemoveEtudiant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEtudiantResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.doranco.fr/", name = "updateEtudiantResponse")
    public JAXBElement<UpdateEtudiantResponse> createUpdateEtudiantResponse(UpdateEtudiantResponse value) {
        return new JAXBElement<UpdateEtudiantResponse>(_UpdateEtudiantResponse_QNAME, UpdateEtudiantResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.doranco.fr/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddEtudiant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.doranco.fr/", name = "addEtudiant")
    public JAXBElement<AddEtudiant> createAddEtudiant(AddEtudiant value) {
        return new JAXBElement<AddEtudiant>(_AddEtudiant_QNAME, AddEtudiant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEtudiantByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.doranco.fr/", name = "getEtudiantByIdResponse")
    public JAXBElement<GetEtudiantByIdResponse> createGetEtudiantByIdResponse(GetEtudiantByIdResponse value) {
        return new JAXBElement<GetEtudiantByIdResponse>(_GetEtudiantByIdResponse_QNAME, GetEtudiantByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveEtudiantResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.doranco.fr/", name = "removeEtudiantResponse")
    public JAXBElement<RemoveEtudiantResponse> createRemoveEtudiantResponse(RemoveEtudiantResponse value) {
        return new JAXBElement<RemoveEtudiantResponse>(_RemoveEtudiantResponse_QNAME, RemoveEtudiantResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEtudiantById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.doranco.fr/", name = "getEtudiantById")
    public JAXBElement<GetEtudiantById> createGetEtudiantById(GetEtudiantById value) {
        return new JAXBElement<GetEtudiantById>(_GetEtudiantById_QNAME, GetEtudiantById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEtudiantsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.doranco.fr/", name = "getEtudiantsResponse")
    public JAXBElement<GetEtudiantsResponse> createGetEtudiantsResponse(GetEtudiantsResponse value) {
        return new JAXBElement<GetEtudiantsResponse>(_GetEtudiantsResponse_QNAME, GetEtudiantsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEtudiant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.doranco.fr/", name = "updateEtudiant")
    public JAXBElement<UpdateEtudiant> createUpdateEtudiant(UpdateEtudiant value) {
        return new JAXBElement<UpdateEtudiant>(_UpdateEtudiant_QNAME, UpdateEtudiant.class, null, value);
    }

}
