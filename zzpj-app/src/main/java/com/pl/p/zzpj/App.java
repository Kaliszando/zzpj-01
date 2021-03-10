package com.pl.p.zzpj;

import com.pl.p.zzpj.lib.Person;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My zzpj-lib usage 1.0" );

        Person person = new Person();

        person.setName("John");
        person.setSurname("Kowalsky");
        person.setAge(47);
        person.setEmail(person.getName()+person.getSurname()+person.getAge()+"@mail.com");

        System.out.println(person);
    }
}
