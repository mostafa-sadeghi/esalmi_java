/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

import java.util.ArrayList;

/**
 *
 * @author msa
 */
public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person("ali");
        Person reza = new Person("reza");
        Person tina = new Person("tina");
        Person mina = new Person("mina");
//        System.out.println(person.getName());
        person.addFriend(reza);
        person.addFriend(tina);
        person.addFriend(mina);
        ArrayList<Person> list = new ArrayList<>();
        list = person.getFriends();
        for(Person p:list){
//            System.out.println(p.getName());
        }
        String fincom = person.friendsInCommon(mina);
        System.out.println(fincom);
        
    }
}
