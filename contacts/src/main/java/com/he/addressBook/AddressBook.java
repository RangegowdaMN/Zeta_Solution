package com.he.addressBook;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    public AddressBook() {
        //TODO
    }

    List<Contact> contactManagement = new ArrayList<Contact>(); 
    
    public void addContact(Contact contact) {
    	if(!contactManagement.contains(contact))
    	{
    		contactManagement.add(contact);	
    	}
    }

    public void deleteContact(String name) {
        for(int i=0; i<contactManagement.size() ; i++)
        {
        	if(contactManagement.get(i).getName().equals(name))
        	{
        		contactManagement.remove(i);
        	}
        }
    }

    public void updateContact(String name, Contact contact) {
    	for(int i=0; i<contactManagement.size() ; i++)
        {
        	if(contactManagement.get(i).getName().equals(name))
        	{
        		contactManagement.add(i, contact);
        	}
        }
    }

    public List<Contact> searchByName(String name) {
    	
    	  List<Contact> contactManagementByName = new ArrayList<Contact>();   	
    	for(int i=0; i<contactManagement.size() ; i++)
        {
        	if(contactManagement.get(i).getName().contains(name))
        	{
        		contactManagementByName.add(contactManagement.get(i));
        	}
        }
    	
    	return contactManagementByName;
    }

    public List<Contact> searchByOrganisation(String organisation) {
    	 List<Contact> contactManagementByorg = new ArrayList<Contact>();   	
     	for(int i=0; i<contactManagement.size() ; i++)
         {
         	if(contactManagement.get(i).getName().contains(organisation))
         	{
         		contactManagementByorg.add(contactManagement.get(i));
         	}
         }
     	
     	return contactManagementByorg;
    }

}