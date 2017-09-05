package org.proxiBanqueSPHA.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import org.proxiBanqueSPHA.model.Customer;
import org.proxiBanqueSPHA.service.IServiceCustomer;
import org.springframework.stereotype.Controller;

@Controller
public class CustomerController implements Serializable {

	private static final long serialVersionUID = 8303650764387135605L;

	@Resource(name = "serviceCustomer")
	private IServiceCustomer service;

	private List<Customer> listCustomers = new ArrayList<>();
	private Customer selectedCustomer;

	/**
	 * La méthode getSelectedCustomer() permet de retourner un client spécifique
	 */
	public Customer getSelectedCustomer() {
		return selectedCustomer;
	}

	/**
	 * La méthode setSelectedCustomer() permet de setter un client spécifique
	 */
	public void setSelectedCustomer(Customer selectedCustomer) {
		this.selectedCustomer = selectedCustomer;
	}

	/**
	 * La méthode getAllCustomers() permet d'afficher la liste des clients
	 */
	public List<Customer> getAllCustomers() {
		return listCustomers;
	}

	/**
	 * La méthode loadAllCustomers() permet d'importer les informations de tout les
	 * clients de la base de données pour pouvoir les afficher
	 */
	public void loadAllCustomers() {
		try {
			listCustomers = service.getAllCustomers();
		} catch (Exception exc) {
			addErrorMessage(exc);
		}
	}

	/**
	 * La méthode addCustomer() permet d'ajouter un nouveau client
	 */
	public String addCustomer(Customer customer) {
		try {
			service.editCustomer(customer);
		} catch (Exception exc) {
			addErrorMessage(exc);
			return null;
		}

//		return "ajoutClient?faces-redirect=true";
		return "";
	}

	/**
	 * La méthode editCustomer() permet d'éditer les informations du client et de
	 * les transmettre au service
	 */
	public String editCustomer(Customer customer) {

		try {
			service.editCustomer(customer);
		} catch (Exception exc) {
			addErrorMessage(exc);
			return null;
		}

		return "listeClients?faces-redirect=true";
	}

	/**
	 * La méthode deleteCustomer() permet de supprimer le client sélectionné
	 */
	public String deleteCustomer(int idCustomer) {
		try {
			service.deleteCustomer(idCustomer);

		} catch (Exception exc) {
			addErrorMessage(exc);
			return null;
		}

		return "listeClients";
	}

	/**
	 * La méthode loadCustomer() permet de charger les informations d'un client pour
	 * pouvoir les éditer
	 */
	public String loadCustomer(int idCustomer) {

		try {
			Customer theCustomer = service.readCustomer(idCustomer);

			ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();

			Map<String, Object> requestMap = externalContext.getRequestMap();
			requestMap.put("customer", theCustomer);

		} catch (Exception exc) {

			addErrorMessage(exc);

			return null;
		}

		return "editerClient?faces-redirect=true";
	}

	/**
	 * La méthode addErrorMessage() permet d'envoyer un message d'erreur à
	 * l'utilisateur lorsqu'une exception est apparue
	 */
	private void addErrorMessage(Exception exc) {
		FacesMessage message = new FacesMessage("Error: " + exc.getMessage());
		FacesContext.getCurrentInstance().addMessage(null, message);
	}

	/**
	 * La méthode logOut() permet d'invalider la session utilisateur
	 */
	public String logOut() {
		FacesContext facesContext = FacesContext.getCurrentInstance();
		ExternalContext externalContext = facesContext.getExternalContext();
		externalContext.invalidateSession();
		return "listeClient?faces-redirect=true";
	}
}
