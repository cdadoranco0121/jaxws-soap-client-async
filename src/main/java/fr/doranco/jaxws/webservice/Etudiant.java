
package fr.doranco.jaxws.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour etudiant complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="etudiant">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prenom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="specialite" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "etudiant", propOrder = {
		"id",
		"nom",
		"prenom",
		"specialite",
		"age"
})
public class Etudiant {

	protected Integer id;
	@XmlElement(required = true)
	protected String nom;
	@XmlElement(required = true)
	protected String prenom;
	@XmlElement(required = true)
	protected String specialite;
	protected int age;

	public Etudiant() {}

	public Etudiant(String nom, String prenom, String specialite, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.specialite = specialite;
		this.age = age;
	}

	/**
	 * Obtient la valeur de la propriété id.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Integer }
	 *     
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Définit la valeur de la propriété id.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link Integer }
	 *     
	 */
	public void setId(Integer value) {
		this.id = value;
	}

	/**
	 * Obtient la valeur de la propriété nom.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Définit la valeur de la propriété nom.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	public void setNom(String value) {
		this.nom = value;
	}

	/**
	 * Obtient la valeur de la propriété prenom.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * Définit la valeur de la propriété prenom.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	public void setPrenom(String value) {
		this.prenom = value;
	}

	/**
	 * Obtient la valeur de la propriété specialite.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	public String getSpecialite() {
		return specialite;
	}

	/**
	 * Définit la valeur de la propriété specialite.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	public void setSpecialite(String value) {
		this.specialite = value;
	}

	/**
	 * Obtient la valeur de la propriété age.
	 * 
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Définit la valeur de la propriété age.
	 * 
	 */
	public void setAge(int value) {
		this.age = value;
	}

	@Override
	public String toString() {
		return "Etudiant [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", specialite=" + specialite + ", age="
				+ age + "]";
	}

}
