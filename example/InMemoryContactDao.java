package org.example;

import java.util.*;

public class InMemoryContactDao implements ContactDao{
    private long contactId = 1L;
    private final Map<Long, Contact> contactIdMap;

    public InMemoryContactDao() {
        this.contactIdMap = new HashMap<>();
    }

    @Override
    public Contact addContact(String name, String telephone, String e_mail) {
        var contact = new Contact(contactId, name, telephone, e_mail);
        contactIdMap.put(contactId++, contact);
        return contact;
    }

    @Override
    public Collection<Contact> getAllContact() {
        return contactIdMap.values();
    }

    @Override
    public Optional<Contact> findAccount(long contactId) {
        return Optional.ofNullable(contactIdMap.get(contactId));
    }

    @Override
    public Contact getContact(long contactId) {
        return findAccount(contactId)
                .orElseThrow(() -> new IllegalArgumentException("Contact " + contactId + " not found"));
    }

    public void setContact(long contactId, String name, String telephone, String e_mail) {
        var contact = getContact(contactId);
        contact.setName(name);
        contact.setTelephone(telephone);
        contact.setE_mail(e_mail);
    }
}
