package com.company;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.sun.tools.internal.ws.processor.model.Model;
import spark.ModelAndView;
import spark.Spark;
import spark.template.mustache.MustacheTemplateEngine;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static ArrayList<Person> person = new ArrayList<>();


    public static void main(String[] args) throws IOException {
        ArrayList<Person> people = new ArrayList<>();
        File data = new File("people.csv");
        Scanner scanner = new Scanner(data);
        while (scanner.hasNext()) {
            String read = scanner.nextLine();
            //read.split(","); unnecessary, redundant
            String[] persons = read.split(",");
            if(!"id".equals(persons[0]));
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

                    String offsetString = request.queryParams("offset");
                    if(offsetString == null) {
                        offsetString = "0";
                    }
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
                    String offSet = request.queryParams("offSet");

                    int offer = Integer.parseInt(offSet);
                    List<Person> personOff = new ArrayList<>();
                    personOff = person.subList(offSet, offSet + 20);

                    HashMap map = new HashMap<>();

                    map.put("People", personOff);
                    map.put("nextOffset", offSet +20);
                    map.put("prevOffset", offSet -20);




                    String personList = people.get("firstName", "lastName", personList);
                    // File data = new File("people.csv")
                    // String personList = Person();
                 //   while (people.hasNext()) {

                      //  if (!id.equals(lineParts[0])) {

                          //  people.add(personList);

                          //  response.redirect("/");

                            return new ModelAndView(personList, "main.html");
                        }
                        return new MustacheTemplateEngine()

                        Spark.get(
                                "/person",
                                ((request, response) -> {
                                    String peopleList =  ;
                                    ArrayList<Person> listed = new ArrayList<>();
                                    for (Person id : people)
                                        if ()


                                            return new ModelAndView(listed, "person.html");
                                }),

                                new MustacheTemplateEngine()
                        );


                    }


                }));
    }
}
