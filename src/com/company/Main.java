package com.company;

import spark.ModelAndView;
import spark.Session;
import spark.Spark;
import spark.template.mustache.MustacheTemplateEngine;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {








    public static void main(String[] args) throws IOException {
        ArrayList<Person> people = new ArrayList<>();
        File data = new File("people.csv");
        Scanner scanner = new Scanner(data);
        while(scanner.hasNext()) {
            String read = scanner.nextLine();
            //read.split(","); unnecessary, redundant
            String [] persons = read.split(",");
            Person personList = new Person(Integer.parseInt(persons[0]), persons[1], persons[2], persons[3], persons[4], persons[5]);
            people.add(personList);
        }

        //public static void personList() {
        //people.add(new Person(personList());


        Spark.init();

        //for(x y : a)
        // a = the list, a is the class(object), y variable given to the entry that is pulled out



        Spark.get(
                "/",
                ((request, response) -> {
                    //to disregard first post on the txt file
                    //if(!"id".equals(lineParts[0])) {

                    //get offset for the parameters queryParams(offset) offset is defined by us
                    //convert offset to Integer(parse)
                    //create temporary list to hold
                    //we are using that throw away temp list for that specific run through
                    //fill temp list using sublist(offset, offset +20)
                    //offset is the beginning of index
                    //create Hashmap to give to html
                    //put temp list in the hashmap
                    //put next in hashmap(offset + 20)
                    //put previous in hashmap(offset -20)

                    String personList = people.get("firstName", "lastName", personList);
                   // File data = new File("people.csv")
                    // String personList = Person();
                    while(people.hasNext()) {

                        people.add(personList);

                        response.redirect("/");

                        return "";
                })
                return new MustacheTemplateEngine()
        );


        Spark.get(
                "/person",
                ((request, response) -> {
                    String peopleList = ;
                    ArrayList<Person> listed = new ArrayList<>();
                    for(Person id : people)
                        if()






                   return new ModelAndView(listed, "person.html");
                })
        )





    }


    }
}
