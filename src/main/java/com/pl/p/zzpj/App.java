package com.pl.p.zzpj;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello mvn!" );
        User user = new User();
        user.setAge(10);
        user.setName("John");

        System.out.println(user.getAge());
        System.out.println(user.getName());
    }
}
