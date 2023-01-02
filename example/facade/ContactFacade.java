package org.example.facade;

import org.example.Contact;
import org.example.ContactDao;
import org.example.controller.ContactDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

@Service
public class ContactFacade {
    private final ContactDao contactDao;

    @Autowired
    public ContactFacade(ContactDao contactDao) {
        this.contactDao = contactDao;
    }

    public ContactDto addContact(String name, String telephone, String e_mail) {
        var contact = contactDao.addContact(name, telephone, e_mail);
        return new ContactDto(contact);
    }

    public ContactDto getContact(long contactId) {
        var contact = contactDao.getContact(contactId);
        return new ContactDto(contact);
    }

    public Collection<ContactDto> allContact() {
        Collection<ContactDto> contacts = new HashSet<>();
        for (Contact contact : contactDao.getAllContact()) {
            contacts.add(new ContactDto(contact));
        }
        return contacts;
    }
}
