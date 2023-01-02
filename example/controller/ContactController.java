package org.example.controller;

import org.example.facade.ContactFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/contacts")
public class ContactController {
    private final ContactFacade contactFacade;

    @Autowired
    public ContactController(ContactFacade accountFacade) {
        this.contactFacade = accountFacade;
    }

    @PostMapping
    public ContactDto addContact(
            @RequestParam String name,
            @RequestParam String telephone,
            @RequestParam String e_mail
    ) {
        return contactFacade.addContact(name, telephone, e_mail);

    }

    @GetMapping("/contactId")
    public ContactDto getContact(
            @PathVariable long contactId
    ) {
        return contactFacade.getContact(contactId);
    }

    @GetMapping
    public Collection<ContactDto> getAllContact() {
        return contactFacade.allContact();
    }
}
