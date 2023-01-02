package org.example.controller;

import com.fasterxml.jackson.annotation.JsonMerge;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.example.Contact;

public class ContactDto {
    @JsonProperty("contactId")
    private final long contactId;
    @JsonProperty("name")
    private final String name;
    @JsonProperty("telephone")
    private final String telephone;
    @JsonProperty("e_mail")
    private final String e_mail;

    public ContactDto(Contact contact) {
        this.contactId = contact.getId();
        this.name = contact.getName();
        this.telephone = contact.getTelephone();
        this.e_mail = contact.getE_mail();
    }

    public long getContactId() {
        return contactId;
    }

    public String getName() {
        return name;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getE_mail() {
        return e_mail;
    }
}
