package udemy_exercises.cell_phone;

import java.util.ArrayList;

class CellPhone {
  private String myNumber;
  private ArrayList<Contact> myContacts;

  public CellPhone(String myNumber) {
    this.myNumber = myNumber;
    this.myContacts = new ArrayList<Contact>();
  }

  public boolean addNewContact(Contact contact) {
    if (findContact(contact.getName()) >= 0) {
      System.out.println("Contact is already on the list");
      return false;
    }
    myContacts.add(contact);
    return true;
  }

  public boolean updateContact(Contact oldContact, Contact newContact) {
    int foundPosition = findContact(oldContact);
    if (foundPosition < 0) {
      System.out.println(oldContact.getName() + ", was not found.");
      return false;
    }

    this.myContacts.set(foundPosition, newContact);
    System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
  }

  private int findContact(Contact contact) {
    return this.myContacts.indexOf(contact);
  }

  private int findContact(String contactName) {
    for (int i = 0; i < this.myContacts.size(); i++) {
      Contact contact = this.myContacts.get(i);
      if (contact.getName().equals(contactName)) {
        return i;
      }
    }
    return -1;
  }

}

/*
 ** Cell Phone with Java Classes** - **CellPhone Class:** - Contact List - quit()
 * - showContacts() - addContact() - updateContact() - removeContact() -
 * searchContact() **When adding or updating be sure to check if the contact
 * already exists** **Be sure not to expose the inner workings of the Arraylist
 * to MobilePhone (use concepts of encapsulation to meet this requirement)**
 */
