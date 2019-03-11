package com.step.MobilePhone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MobilePhone {
    private List<Contact> contacts = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    public MobilePhone(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public void addContact(Contact contact){
        System.out.println("Contact Name : ");
        String name = scanner.nextLine();
        System.out.println("Contact Number : ");
        String number = scanner.nextLine();

        if(this.contacts.contains(contact)){
            System.out.println("Contact already exists!");
        }else{
            this.contacts.add(new Contact(name,number));
        }
    }

    public void removeContact(Contact contact){
        if(!this.contacts.contains(contact)){
            System.out.println("Contact does't exists!");
        }else{
            this.contacts.remove(contact);
        }
    }

    public void updateContact(Contact contact){
        if(!this.contacts.contains(contact)){
            System.out.println("Contact does't exists!");
        }else{
            this.contacts.set(this.contacts.indexOf(contact),contact);
        }
    }
}
