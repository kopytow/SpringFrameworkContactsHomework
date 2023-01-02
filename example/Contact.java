package org.example;

/**
 * Контакт имеет следующие характеристики – Имя и Фамилия, Телефонный номер, Email.
 */
public class Contact {
    private final long id;
    private String name;
    private String telephone;
    private String e_mail;

    public Contact(long id, String name, String telephone, String e_mail) {
        this.id = id;
        this.name = name;
        this.telephone = telephone;
        this.e_mail = e_mail;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", telephone='" + telephone + '\'' +
                ", e_mail='" + e_mail + '\'' +
                '}';
    }
}
