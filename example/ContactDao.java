package org.example;

import java.util.Collection;
import java.util.Optional;

public interface ContactDao {
    Contact addContact(String name, String telephone, String e_mail);
    Collection<Contact> getAllContact();
    Optional<Contact> findAccount(long contactId);
    Contact getContact(long contactId);
}
